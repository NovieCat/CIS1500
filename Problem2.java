import java.util.Scanner;

public class Problem2 {
   public static void main(String [] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int x = scan.nextInt();
      int odd = 0;
      
      while (x >= 0) {
         System.out.println("READ: " + x);
         if (x % 2 == 1) {
            odd ++;
         }
         x = scan.nextInt();
      }
      
      System.out.println("Number of odd numbrs is: " + odd);
      
   }
}