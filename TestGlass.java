public class TestGlass 
{ 
   public static void main(String [] args) 
   { 
      Glass milk = new Glass(15); // 15 ounces of milk 
      Glass juice = new Glass(3); // 3 ources of juice 

      milk.drink(2); 
      milk.drink(1); 

      milk.report(); 

      juice.fill(6);  // went from 3 to 9 ounces 
      juice.drink(1); // now down to 8 ounces 

      juice.report();  

      juice.spill(); 

      juice.report(); 
   } 
} 

class Glass 
{
   private int ounce = 0;
   
   public Glass(int startOunce)
   {
      ounce = startOunce;
   }
   
   public void drink(int sips)
   {
      if (sips >=0)
         ounce -= sips;
   }
   
   public void fill(int pours)
   {
      if (pours >= 0)
         ounce += pours;
   }
   
   public void spill()
   {
      ounce = 0;
   }
   
   public void report()
   {
      System.out.printf("Glass has %d ounces.\n", ounce);
   }
} 