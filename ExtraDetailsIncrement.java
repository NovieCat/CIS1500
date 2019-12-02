public class ExtraDetailsIncrement
{
   public static void main(String [] args)
   {
      /*
      int x = 10;
      int y = x++;
      // addition happens after y=x
      System.out.println("x: " + x);
      
      int a = 5;
      int b = 2 * ++a;
      // addition happens before multiplication
      */
      
      int x = 10, y = 20;
      x += y++;
      System.out.println("x = " + x + ", y = " + y);

   }
}