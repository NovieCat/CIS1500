import java.util.Random;

public class RandomFun
{
   public static void main(String [] args)
   {
      Random rand = new Random();
      
      int die1 = rand.nextInt(6) + 1;
      int die2 = rand.nextInt(6) + 1;
      System.out.printf("You rolled %d and %d.\n", die1, die2);
      
      int craps = die1 + die2;
      
      switch (craps)
      {
         case 7: case 11:
            System.out.printf("You win with a %d!", craps);
            break;
         case 2: case 3: case 12:
            System.out.printf("You lose with a %d!", craps);
            break;
         default:
            System.out.printf("You get %d. Roll again...", craps);
      }
      
      
   }
}