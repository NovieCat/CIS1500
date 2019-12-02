import javax.swing.JOptionPane;

public class OddEven
{
   public static void main(String [] args)
   {
      String s = JOptionPane.showInputDialog("Enter a number:");
      int num = Integer.parseInt(s);
      int rem = num % 2;
      
      if (rem == 1)
      JOptionPane.showMessageDialog(null, num + " is odd.");
      else
      JOptionPane.showMessageDialog(null, num + " is even.");
   }
}