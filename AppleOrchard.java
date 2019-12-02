/*
ever wonder how you can keep track of
the apples you pick and eat at an orchard?!
don't wanna count the apples in your basket?!?
here's the program for you!!!

@author Grace Yang
@version 20 Nov 2016
CIS1500
*/

public class AppleOrchard
{
	public static void main(String [] args)
	{
		System.out.println("Rick...");
		BushelBasket rick = new BushelBasket(0);
		rick.print();
		rick.pick(11);
		rick.pick(22);
		rick.print();
		rick.eat(4);
		rick.print();
		rick.spill();
		rick.print();
		
		System.out.println("Newt...");
		BushelBasket newt = new BushelBasket(100);
		newt.print();
		
		System.out.println( newt.isEmpty() );
		System.out.println( newt.isFull() );
		System.out.println( newt.getApples() );
		System.out.println( newt.roomLeftInBasket() );
		
		System.out.println("Michele...");
		BushelBasket michele = new BushelBasket(0);
		System.out.println( michele.isEmpty() );
		System.out.println( michele.isFull() );
		michele.pick(25);
		System.out.println( michele.isEmpty() );
		System.out.println( michele.isFull() );
		michele.pick(100);
		System.out.println( michele.isEmpty() );
		System.out.println( michele.isFull() );
		
		System.out.println("Herman...");
		BushelBasket herman = new BushelBasket(-5);  // should default to 0
		herman.print();
		
		System.out.println("Jon...");
		BushelBasket jon = new BushelBasket(300);  // should default to 125
		jon.print();
		
		System.out.println("Ron...");
		BushelBasket ron = new BushelBasket(20);  // starts with 20
		ron.print();
		ron.eat(50);  // can only eat down to zero apples
		ron.print();  // should see zero apples
		ron.eat(10);  // back to 10
		ron.pick(1000);  // basket can only hold 125 apples
		ron.print();  // should print 125
		
		System.out.println("Gary...");
		BushelBasket gary = new BushelBasket();  // should default to 0
		gary.print();
	}
}

class BushelBasket
{
	private int apples;
   
   public BushelBasket(int start) {
      if (start > 125) {
         apples = 125;
      }
      else if (start < 0) {
         apples = 0;
      }
      else {
         apples = start;
      }
   }
   
   public BushelBasket() {
      apples = 0;
   }
   
   public void print() {
      System.out.println("This bushel basket has " + apples + " apples in it.");
   }
   
   public void pick(int picked) {
      int spaceLeft = 125 - apples;
      
      if (picked > spaceLeft) {
         int extra = picked - spaceLeft;
         apples = 125;
         //System.out.println(extra + " apples fall out of the basket.");
      }
      else {
         apples += picked;
      }
   }
   
   public void eat(int eaten) {
      if (eaten > apples) {
         apples = 0;
         //System.out.println("You only eat " + apples + " apples.");
      }
      else {
         apples -= eaten;
      }
   }
   
   public void spill() {
      apples = 0;
   }
   
   public boolean isEmpty() {
      if (apples == 0) {
         return true;
      }
      else {
         return false;
      }
   }
   
	public boolean isFull() {
      if (apples == 125) {
         return true;
      }
      else {
         return false;
      }
   }
   
	public int getApples() {
      return apples;
   }
   
	public int roomLeftInBasket() {
      int roomLeft = 125 - apples;
      return roomLeft;
   }
   
}
