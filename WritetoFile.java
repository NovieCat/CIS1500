import java.io.*;

public class WritetoFile
{
   public static void main(String [] args)
   {
      System.out.println("the");
      
      PrintWriter myOut = new PrintWriter("out.txt");
      myOut.println("the");
      myOut.println("text!");
      myOut.flush(); //built in flush
   }
}