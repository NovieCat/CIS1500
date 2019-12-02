/*
Program to make a bar chart for sales in three stores

@author Grace Yang
@version 26 Oct 2016
CIS 1500
*/

import java.util.Scanner;
 
public class BarChart
{
	public static void main(String [] args)
	{
      
      //prompt and record sales for stores 1; catch invalid input
      System.out.print("Enter today's sales for store 1: ");
      
      int sales1 = getSales();
      
      while (sales1 <= 0) {
         System.out.print("Invalid input - enter a value of zero or greater: ");
         sales1 = getSales();
      }
      
      //repeat for store 2
      System.out.print("Enter today's sales for store 2: ");
      
      int sales2 = getSales();
      
      while (sales2 <= 0) {
         System.out.print("Invalid input - enter a value of zero or greater: ");
         sales2 = getSales();
      }
      
      //repeat for store 3
      System.out.print("Enter today's sales for store 3: ");
      
      int sales3 = getSales();
      
      while (sales3 <= 0) {
         System.out.print("Invalid input - enter a value of zero or greater: ");
         sale3 = getSales();
      }
      
      //create bar chart section
      System.out.print("\nSALES BAR CHART\n");
      
      //print bar chart for store 1
      int count1 = 1;
      System.out.print("\nStore 1: ");
      while (count1 <= sales1) {
         if (count1 % 10 == 0) {
            System.out.print("x");
         }
         else {
            System.out.print("*");
         }
         count1++;
      }
      
      //repeat for store 2
      int count2 = 1;
      System.out.print("\nStore 2: ");
      while (count2 <= sales2) {
         if (count2 % 10 == 0) {
            System.out.print("x");
         }
         else {
            System.out.print("*");
         }
         count2++;
      }
      
      //repeat for store 3
      int count3 = 1;
      System.out.print("\nStore 3: ");
      while (count3 <= sales3) {
         if (count3 % 10 == 0) {
            System.out.print("x");
         }
         else {
            System.out.print("*");
         }
         count3++;
      }
	}
   
   static int getSales()
   {
      Scanner scan = new Scanner(System.in);
      int sales = 0;
      boolean val = false;
      
      try {
            sales = scan.nextInt();
            val = true;
      }
      catch (Exception e) {
            retry();
      }
      
      if (val = true) {
         return sales;
      }
      else return 0;
   }
   
   static void retry()
   {
      System.out.print("Invalid input - enter a value of zero or greater: ");
      getSales();
   }
}