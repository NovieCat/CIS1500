import java.util.Random;

public class DiceRoll
{
   public static void main(String [] args)
   {
      Random rand = new Random();
      int die1 = rand.nextInt(6) + 1; //0 to 5 => 1 to 6
      int die2 = rand.nextInt(6) + 1;
      
      System.out.printf("%d and %d.", die1, die2);
   }
}