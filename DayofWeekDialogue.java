import javax.swing.JOptionPane;

public class DayofWeekDialogue
{
   public static void main(String [] args)
   {
      String s = JOptionPane.showInputDialog("Enter a day of the week (1 to 7): ");
      int day = Integer.parseInt(s);
      
      /*
      if (day == 1)
         System.out.print("That is a weekday.");
      else if (day == 2)
         System.out.print("That is a weekday.");
      else if (day == 3)
         System.out.print("That is a weekday.");
      else if (day == 4)
         System.out.print("That is a weekday.");
      else if (day == 5)
         System.out.print("That is a weekday.");
      else if (day == 6)
         System.out.print("That is a weekend.");
      else if (day == 7)
         System.out.print("That is a weekend.");
      else 
         System.out.print("That is not a valid day.");
      
      if (day == 1 || day == 7)
         System.out.print("That is a weekday.");
      else if (day >= 2 && day <= 6)
         System.out.print("That is a weekend.");
      else
         System.out.print("That is not a valid day.")
      */
      
      switch(day)
      {
         case 1:
         case 7:
                JOptionPane.showMessageDialog(null, "Weekend!");
                break;
         case 2: case 3: case 4: case 5: case 6:
                JOptionPane.showMessageDialog(null, "Weekday.");
                break;
         default:
                 JOptionPane.showMessageDialog(null, "That is not a valid day.");
      }
   }
}