class DemoMethods2
{
    public static void main(String [] args)
    {
        int x = 10;
        report(x);
        
        int total = sum(100, 223);
        System.out.println("Sum is: " + total);
        
        double tiny = giveSmallest(100.1, 3.3);  // give 3.3
        double other = giveSmallest(6.0, 9999.9); // give 6.0
        
        reportOddOrEven(600);
        reportOddOrEven(3);
        
        boolean b = isOdd(501);  // returns true if number is odd
        boolean b2 = isOdd(4);
        
        if (isOdd(3))
            System.out.println("I knew that was odd!");
        
    }
    
    static void report(int x)
    {
      System.out.println("You passed me: " + x);
    }
    
    static int sum(int num1, int num2)
    {
      int sum = num1 + num2;
      return sum;
    }
    
    static double giveSmallest(double x, double y)
    {
      if (x > y) {
         return y;
      }
      else return x;
    }
    
    static void reportOddOrEven(int num)
    {
      if (num % 2 == 0) {
         System.out.println(num + " is even");
      }
      else {
         System.out.println(num + " is odd");
      }
    }
    
    static boolean isOdd(int num)
    {
      return (num % 2 == 1);
    }
}