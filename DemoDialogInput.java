import javax.swing.JOptionPane;

public class DemoDialogInput
{
   public static void main(String [] args)
   {
      JOptionPane.showMessageDialog(null, "Good Morning!");
      String s = JOptionPane.showInputDialog("Enter a value:");
      JOptionPane.showMessageDialog(null, "You just entered: " + s);
      
      int num = Integer.parseInt(s);
      int twice = num * 2;
      JOptionPane.showMessageDialog(null, "Twice is: " + twice);
   }
}
