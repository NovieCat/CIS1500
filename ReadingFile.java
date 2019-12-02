import java.util.Scanner;
import java.lang.*;
import java.io.File;

public class ReadingFile
{
   public static void main(String [] args)// throws Exception //not as good as try
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a file name: ");
      String filename = keyboard.next();
      
      try {
         Scanner scan = new Scanner(new File("nums.txt"));
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         
         System.out.println("READ: " + num1);
         
         int sum = num1 + num2;
         System.out.println("Sum: " + sum);
      }
      catch(Exception exc) {
         System.out.println("Problem opening file!");
      }
   }
}