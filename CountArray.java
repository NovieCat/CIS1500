public class CountArray
{

   public static void main(String [] args)
   {
      int [] val = { 81, 6, 95, 30, 40, 5, 16 };
      
      int i = 0;
      int count = 0;
      
      while (i < val.length) {
         if (val[i] >= 40)
           count ++; 
         i++;
      }
      
      System.out.println("There were " + count + " values greater than or equal to 40");
   }
}