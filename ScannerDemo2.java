import java.util.*;

public class ScannerDemo2
{
   public static void main(String [] args)
   {
      System.out.println("Give me a number:");
      Scanner scan = new Scanner( System.in );
      int num = scan.nextInt();
      System.out.println("Twice: " + 2*num);
   }
}