public class DemoPrintf
{
   public static void main(String [] args)
   {
      System.out.print("today is\n");
      System.out.println("Thursday" + " Sep 22 " + 2016);
      System.out.println(111);
      
      int x = 33;
      System.out.printf("one %04d string %04d\n", x, 100);
      System.out.printf("Price 6%% is %,.2f\n", 111111111.1);
   }
}