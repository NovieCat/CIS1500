public class DebugExercise
{
   public static final double TAX_RATE = 0.06;
   
   public static void main(String [] args)
   {
      double tv = 350.00; // 1
      double dvdPlayer = 119.50;  // 2
      double dvdHungerGames = 11.99;  // 3
      double dvdXMen = 7.99;  // 4
      
      dvdXMen = dvdXMen + 3.57; // 5
      
      calcAndReportTotal(tv, "Television");   // 6
      calcAndReportTotal(dvdXMen, "X Men DVD");   // 7
      calcAndReportTotal(dvdPlayer, "DVD Player");  // 8
      
      double averageDvdCost = (dvdHungerGames + dvdXMen) / 2.0;  // 9
      System.out.printf("Average DVD cost: %.02f\n", averageDvdCost);  // 10
   }
   
   public static void calcAndReportTotal(double amount, String name)
   {
      double tax = amount * TAX_RATE;  // 11
      double total = amount + tax;  // 12
      System.out.printf("ITEM: %11s\nCOST:  %11.02f\nTAX:   %12.02f\nTOTAL: %10.02f\n\n", name, amount, tax, total);  // 13
   }
}