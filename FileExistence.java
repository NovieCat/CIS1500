import java.io.*;

public class FileExistence
{
   public static void main(String [] args)
   {
      try {
         File file2 = new File("two.txt");
         
         if (file2.exists())
            System.out.println("Yes it is there");
         else {
            PrintWriter out = new PrintWriter("two.txt");
            out.println("new output");
            out.close();
         }
      }
      catch (IOException ioe) {
         System.out.println("Error: " +ioe.toString());
      }
   }
}