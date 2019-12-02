class Bus
{
   private int passenger;
   
   public void board(int numPeople)
   {
      passenger += numPeople;
   }
   
   public void leave(int numPeople)
   {
      passenger -= numPeople;
   }
   
   public void status()
   {
      System.out.println("Bus has " + passenger + " passengers.");
   }
}

public class CitySimulation
{
   public static void main(String [] args)
   {
      Bus school = new Bus();
      Bus airport = new Bus();
      Bus downtown = new Bus();
      school.board(17);
      school.board(3);
      school.leave(2);
      school.status();
   }
}