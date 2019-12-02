public class DemoMethods
{
   public static void main(String [] args)
   {
      System.out.printf("hi");
      int x = Integer.parseInt("33");
      
      greet("Alan");
      greet("Rekha");
   }
   
   static void greet(String s) //a varible to hold
   {
      System.out.printf("Good day %s!\n", s);
   }
}