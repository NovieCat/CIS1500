import javax.swing.*;

public class DemoDialogFancy
{
   public static void main(String [] args)
   {
      JOptionPane.showMessageDialog(
         null,
         "stuff\n" +
         "stuff" +
         "stuff",
         "title",
         JOptionPane.PLAIN_MESSAGE
      );
   }
}