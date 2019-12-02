/*
class Account
{
   private double balance;
   
   public void desposit(double amount) {}
   public void withdraw(double amount) {}
   public double getBalance() {}
}

class Person
{
   private String name;
   
   public void setName(String s) {}
   public String getName() {}
}

class Customer extends Person
{
   private Account account;
}
*/
class Demo
{
   public static void main(String args[])
   {
      Car ford = new car;
      ford.drive(30);
      ford.drive(22);
   }
   
   class ForSaleCar extends Car
   {
      private double price;
      
      public void setPrice(double p) {price =p;}
      public double getPrice() {return p;}
      
      public ForSaleCar(double startPrice, int startOdo) {
         
      }
      
      public void status() {
         System.out.printf("price is %.2f", price);
         super.status();
      }
      
   }
   
   class car
   {
      private int odo;
      
      public Car(int startMiles) {
         odo = startMiles;
      }
      public void drive(int miles) {
         odo += miles;
      }
      public int getOdo() {
         return odo;
      }
      public void status() {
         System.out.printf("car has %d miles on odo", odo);
      }
   }
}