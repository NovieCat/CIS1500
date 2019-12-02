import java.util.Scanner;
import javax.swing.JOptionPane;

public class SalesTaxHomework
{
   public static void main(String [] args)
   {
      /*
      What was the cost of your purchase: 10.00
      The tax on that $10.00 purchase is $0.60.
      */
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What was the cost of your purchase: ");
      
      double cost = scan.nextDouble();
      double tax = cost * 0.06;
      
      System.out.printf("The tax on that $%.2f purchase is $%.2f.", cost, tax);
      /*
      
      
      String input = JOptionPane.showInputDialog("What was the cost of your purchase?");
      
      double cost = Double.parseDouble(input);
      double tax = cost * 0.06;
      
      JOptionPane.showMessageDialog(null,
         String.format("The tax on that $%.2f purchase is $%.2f.", cost, tax));
      */
   }
}