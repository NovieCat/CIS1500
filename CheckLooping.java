public class CheckLooping
{
   public static void main(String [] args)
   {
      int num = 1;
      
      while (num < 6)
      {
         System.out.println(3 * num);
         num++;
      }
      
      int num2 = 20;
      
      while (num2 >= 14)
      {
         System.out.println(num2);
         num2 -= 1;
      }
   }
}