import java.util.Scanner;

public class Problem8
{
   public static void main(String [] args)
   {
      //get 7 numbers
      //sum of all, # of even, sum of odd, sum of even
      Scanner scan = new Scanner(System.in);
      
      int x = 0;

      int count = 0;
      
      int sum = 0;
      int even = 0;
      int sumodd = 0;
      int sumeven = 0;
      
      while (count < 7) {
         x = scan.nextInt();
         sum += x;
         
         if (x % 2 == 0) {
            even ++;
            sumeven += x;
         }
         else {
            sumodd += x;
         }
         count ++;
      }
      
      System.out.printf("Sum of all numbers: %d\n" +
         "Number of even numbers: %d\n" +
         "Sum of odd numbers: %d\n" +
         "Sum of even numbers: %d",
         sum, even, sumodd, sumeven);

   }
}