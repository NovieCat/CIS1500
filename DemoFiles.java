import java.io.*;
import java.util.*;

public class DemoFiles
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(new File("nums.txt"));
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      
      int sum = num1 + num2;
      System.out.printf("Sum is %d.\n", sum);
   }
}