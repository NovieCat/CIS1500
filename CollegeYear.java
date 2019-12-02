import java.util.Scanner;

public class CollegeYear
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What is your year at college? ");
      int year = scan.nextInt();
      
      if (year == 1)
      System.out.print("You are a freshman.");
      else if (year == 2)
      System.out.print("You are a sophomore.");
      else if (year == 3)
      System.out.print("You are a junior.");
      else if (year == 4)
      System.out.print("You are a senior.");
      else
      System.out.print("Please enter a number between 1 and 4.");
   }
}