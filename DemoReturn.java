public class DemoReturn
{
   public static void main(String [] args)
   {
      int x;
      
      x = num();
      System.out.println("x: " + x);
      
      int result = times(3, 2);
      int other = times(10, 22);
      System.out.printf("%d and %d results\n", result, other);
      
      double z = twice(10.0);
      double y = twice(1.2);
   }
   
   static int num()
   {
      return 33;
   }
   
   static int times(int num1, int num2)
   {
      int product = num1 * num2;
      return product;
   }
   
   static double twice(double num)
   {
      double result = num * 2;
      return result;
   }
}