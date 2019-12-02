/**
   Calculator for increase in sales tax.
   
   @author Grace Yang
   @version 24 Sept 2016
   CIS 1500
*/


import java.util.Scanner;

public class SalesTax
{
   public static void main(String [] args)
   {
      System.out.println("Proposed Sales Tax Increase Program\n");
      
      Scanner scan = new Scanner(System.in);
      
      //Get and record the income
      System.out.print("What is your current income: ");
      double income = scan.nextDouble();
      
      //Get and record percent of income that's taxable
      System.out.print("What percent of your income is taxable (0 to 100): ");
      double tax = scan.nextDouble();
      
      //calculate the taxable income, current 6% tax rate, proposed 7% tax rate, and difference
      double taxableIncome = income * (tax / 100);
      double currentTax = taxableIncome * .06;
      double proposedTax = taxableIncome * .07;
      double difference = proposedTax - currentTax;
      
      //report results
      System.out.printf("\nTaxable income: $%,.2f\n", taxableIncome);
      System.out.printf("At current 6%% tax: $%,.2f\n", currentTax);
      System.out.printf("At proposed 7%% tax: $%,.2f\n", proposedTax);
      System.out.printf("Difference: $%,.2f", difference);
   }
}