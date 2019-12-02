import java.util.Scanner;

public class DaysInJanuary
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many days in January?");
      int days = scan.nextInt();
      
      if (days == 31)
      System.out.println("That is correct!");
      else
      System.out.println("No. Not correct.");
      
   }
}