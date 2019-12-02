public class DemoAnimals
{
   public static void main(String [] args)
   {
      Animal a1 = new Animal(10);
      Animal a2 = new Animal(22);
      Animal a3 = new Animal(-10);
  
      a1.setAge(15);
  
      a1.status();
      a2.status();
  
      System.out.println( a2.getAge() );
      a3.status();
      
      Chicken chickie = new Chicken(11, 5);
      chickie.setAge(12);
      chickie.setEggs(7);
      chickie.status();
      
      Cow milkie = new Cow(3, 100);  // plus spots
      milkie.setSpots(102);
      milkie.status();  // Cow has 102 spots and is an animal that is 3 years old
   }
}

class Cow extends Animal
{
   private int spots;
   
   public Cow(int startAge, int startSpots)
   {
      super(startAge);
      spots = startSpots;
   }
   
   public void setSpots(int amount)
   {
      if (amount >= 0)
         spots = amount;
   }
   
   public void status()
   {
      System.out.printf("Cow has %d spots ", spots);
        super.status();
   }
}

class Chicken extends Animal
{
    private int eggs;
    
    public Chicken(int startAge, int startEggs)
    {
        super(startAge);
        eggs = startEggs;
    }
    
    public void setEggs(int amount)
    {
        if (amount >= 0)
            eggs = amount;
    }
    
    public int getEggs()
    {
        return eggs;
    }
    
    public void status()
    {
        System.out.printf("Chicken has %d eggs ", eggs);
        super.status();
    }
}

class Animal
{
    private int age;
    
    public Animal(int startAge)
    {
        if (startAge >= 0)
            age = startAge;
    }
    
    void setAge (int newAge)
    {
        if (newAge >= 0)
            age = newAge;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void status() 
    {
        System.out.printf("and is an animal that is %d years old\n", age);
    }
}