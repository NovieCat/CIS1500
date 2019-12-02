import javax.swing.JOptionPane;

public class DialogGreeting
{
   public static void main(String [] args)
   {
      String first = JOptionPane.showInputDialog(
         "What is your first name?");
      String last = JOptionPane.showInputDialog(
         "What is your last name?");
      
      JOptionPane.showMessageDialog(null,
         "Hello, " + first + " " + last + "!");
         
      JOptionPane.showMessageDialog(null,
         String.format("Hello, %s %s!", first, last));
   }
}