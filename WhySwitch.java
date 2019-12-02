public class WhySwitch
{
   public static void main(String [] args)
   {
      final int y = 5;
      int x = 3;
      String s = "3";
      
      
      switch(x)
      {
         case y: System.out.println("five!");
                 break;
         
         default: System.out.println("Wrong!");
      }
   }
}