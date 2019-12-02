public class LotsofPrintf
{
   public static void main(String [] args)
   {
      int x = 345;
      double y = 222.222;
      
      System.out.printf("the val x is %06d and y is %,010.2f\n", x, y);
      //%d means decimal, %f means floating point
      //6 means leave 6 spaces, 0 means fill spaces with 0
      //, means add commas to number, .2 means leave 2 decimal spaces
      
      javax.swing.JOptionPane.showMessageDialog(null, String.format("Number:\n %.2f", y),
      "Printf Example",
      javax.swing.JOptionPane.WARNING_MESSAGE);
   }
}