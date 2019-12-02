import javax.swing.JOptionPane;

public class FizzBuzz{
   public static void main(String [] args){
      int i = 1;
      while (i <= 100)
      {
         boolean fizz = i%3==0;
         boolean buzz = i%5==0;
         
         if(fizz && buzz)
            System.out.println("FizzBuzz");
         else if(fizz)
            System.out.println("Fizz");
         else if(buzz)
            System.out.println("Buzz");
         else
            System.out.println(i);
            
         i++;
      }
   }
}