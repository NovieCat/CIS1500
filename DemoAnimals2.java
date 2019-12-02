public class DemoAnimals2
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
        System.out.printf("animal that is %d years old\n", age);
    }
}