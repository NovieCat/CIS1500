import java.util.Scanner;

public class NameAndAge
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("How old are you?");
      int age = scan.nextInt();
      
      System.out.println("What is your first name?");
      String name = scan.next();
      
      System.out.println("You are " + age + " years old, " + name + ".");
      System.out.printf("You are %d old, %s.", age, name);
   }
}