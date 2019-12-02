import java.util.Scanner;

public class SumLoop {
   public static void main(String [] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int x = 0;
      x = scan.nextInt();
      
      int sum = 0;
      
      while (x >= 0) {
         System.out.println("READ: " + x);
         sum += x;
         x = scan.nextInt();
      }
      
      System.out.println("Sum is: " + sum);
      
   }
}