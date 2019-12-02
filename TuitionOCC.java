/*
Program to calculate tuition at OCC according to residency and credit hours
@author Grace Yang
@version 8 Oct 2016
CIS 1500
*/

import javax.swing.JOptionPane;

public class TuitionOCC
{
   public static void main(String [] args)
   {
      //greeting message
      JOptionPane.showMessageDialog(null, 
         "Calculate your tuition!", "Tuition at OCC", 
         JOptionPane.INFORMATION_MESSAGE);
         
      //get residency status, display error for invalid input
      String res = JOptionPane.showInputDialog(null,
         "Are you a:\n" + 
         "1 - College District Resident\n" + 
         "2 - Non-Resident of College District\n" + 
         "3 - Out-of-State or International Student\n\n" + 
         "Enter a 1, 2, or 3:", 
         "Input", JOptionPane.QUESTION_MESSAGE);
         
      double rate = 0;
      
      switch (res)
      {
         case "1": rate += 88;
                 break;
                 
         case "2": rate += 171;
                 break;
         
         case "3": rate += 240;
                 break;
         
         default:
               JOptionPane.showMessageDialog(null, 
               "You must enter a 1, 2, or 3.\n" + 
               "Please run the program again.",
               "Invalid Input", 
               JOptionPane.ERROR_MESSAGE);
               System.exit(0);
      }
      
      //get credit hours, display error for invalid input
       String credit = JOptionPane.showInputDialog(null,
         "How many credit hours are you taking?", 
         "Input", JOptionPane.QUESTION_MESSAGE);
       
       try
       {
         Integer.parseInt(credit);
       }
       catch (java.lang.NumberFormatException e)
       {
         JOptionPane.showMessageDialog(null, 
            "You must enter a value of 1 or more.\n" + 
            "Please run the program again.",
            "Invalid Input", 
            JOptionPane.ERROR_MESSAGE);
            System.exit(0);
       }
       
       double hours = Integer.parseInt(credit);
       
       if (hours < 1)
       JOptionPane.showMessageDialog(null, 
         "You must enter a value of 1 or more.\n" + 
         "Please run the program again.",
         "Invalid Input", 
         JOptionPane.ERROR_MESSAGE);
         System.exit(0);
         
      
      //calculate tuition
      double tuition = rate * hours;
      
      //display credit hours, rate, and tuition
      JOptionPane.showMessageDialog(null, 
         String.format("%.0f hours at $%.2f per hour yeilds a tuition of $%.2f", hours, rate, tuition), 
         "Your Tuition", 
         JOptionPane.INFORMATION_MESSAGE);
   }
}