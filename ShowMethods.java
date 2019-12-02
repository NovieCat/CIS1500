public class ShowMethods
{
   public static void main(String [] args)
   {
      System.out.println("Starting."); //1
      first(); //2
      System.out.println("Done."); //6
      
      timesHundred (3.3);
   }
   
   static void first()
   {
      System.out.println("In"); //3
      System.out.println("first"); //4
      System.out.println("method"); //5
   }
   
   static void timesHundred(double val)
   {
      double hundred;
      hundred = val * 100;
      System.out.println("Now " + hundred + "!");
   }
}