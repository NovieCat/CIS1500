public class DemoMethods1
{
   public static void main(String [] args)
   {
      System.out.println("He was laughing");
      laugh();
      System.out.println("and");
      laugh();
      System.out.println("and also");
      laugh();
      
      System.out.println("On bad days, he says");
      cry();
      
      System.out.println("He laughed really hard");
      laugh(50);
      laugh(10);
      laugh(3);
      laugh(4, "java");
      
      times (2, 3);
   }
   
   static void laugh()
   {
      System.out.println("Haaa!");
   }
   
   static void cry()
   {
      System.out.println("Wawa...");
   }
   
   static void laugh(int val)
   {
      while (val >= 1) {
         System.out.print("ha ");
         val --;
      }
      System.out.println("!");
   }
   
   static void laugh(int val, String word)
   {
      while (val >= 1) {
         System.out.print(word + " ");
         val --;
      }
   }
   
   static void times(int num1, int num2)
   {
      int product = num1 * num2;
      System.out.println(num1 + " times " + num2 + " is " + product);
   }
}