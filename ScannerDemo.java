import java.util.Scanner;

/*

nextInt - int
nextDouble - double
nextLine - entire line as a string
next - read one word as a string

*/

public class ScannerDemo
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      double num1 = scan.nextDouble();
      double num2 = scan.nextDouble();
      double num3 = scan.nextDouble();
      double total = num1 + num2 + num3;
      double ave = total / 3.0;
      System.out.println("Average: " + ave);
      
      String word1 = scan.next()
      System.out.println(word1)
   }
}