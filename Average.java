import java.util.Scanner;

public class Average
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //Enter mum1: 20
      
      System.out.print("Enter num1: ");
      double num1 = scan.nextDouble();
      
      //Enter num2: 50
      
      System.out.print("Enter num2: ");
      double num2 = scan.nextDouble();
      
      //Average: 35.0
      
      double avg = (num1+num2)/2;
      System.out.print("Average: " + avg);
   }
}