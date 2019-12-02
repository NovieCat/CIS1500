ublic class DogHouse
{
    public static void main(String [] args)
    {
        Dog fluffy = new Dog(35);
        fluffy.birthday();
        fluffy.birthday();
        fluffy.addSeveralYears(-2002);
        fluffy.addSeveralYears(3);
        fluffy.addSeveralYears(50)
        int x = fluffy.getYears();
        fluffy.report();  // Dog is 2 years old
    }
}

class Dog
{
    private int age;  // instance variable or object variable
    
    // NEXT CLASS: more on constructors (such as default constructor)
    // Also, encapsulation and protecting your data
    public Dog(int start)
    {
        age = start;
    }
    
    public void birthday()
    {
        age++;
    }
    
    public void addSeveralYears(int years)
    {
        age += years;
    }
    
    public int getYears()
    {
        return age;
    }
    
    public void report()
    {
        System.out.printf("Dog is %d years old\n", age);
    }
    
}