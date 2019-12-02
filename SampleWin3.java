import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SampleWin3
{
   public static void main(String [] args)
   {
      JFrame frame = new JFrame("Alan Window");
      frame.setSize(400, 300);
      frame.setLocation(100, 75);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class MyFrame extends JFrame
{
   JButton button = new JButton("click");
   JTextField text = new JTextField(10);
   JButton reset = new JButton("reset");
   
   public MyFrame()
   {
      super("Alan Window");
      //Hbox Vbox don't exist
      //FlowLayout, GridLayout, BorderLayout
      setLayout(new FlowLayout());
      add(button);
      add(text);
      add(reset);
      
      button.addActionListener(
         event -> {
            text.setText("Clicked!");
      });
      
      reset.addActionListener(
         new ResetHandler;
      );
   }
   
   class ResetHandler implements ActionListener
   {
      public void ActionPerormed(ActionEvent event)
      {
         text.setText(null);
      }
   }
}