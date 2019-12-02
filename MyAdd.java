import java.util.*;

public class MyAdd
{
   public static void main(String [] args)
   {
      System.out.println("Give number 1:");
      Scanner scan = new Scanner( System.in );
      int num1 = scan.nextInt();
      System.out.println("Give number 2:");
      int num2 = scan.nextInt();
      System.out.println(num1 + " plus " + num2 + " is " + (num1+num2) + ".");
   }
}