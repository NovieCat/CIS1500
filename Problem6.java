import java.util.Scanner;

public class Problem6
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int x = 0;
      x = scan.nextInt();
      
      int sum = 0;
      
      while (x >= 0) {
         sum ++;
         x = scan.nextInt();
      }
      
      System.out.printf("You entered %d numbers.", sum);

   }
}