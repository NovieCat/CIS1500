public class SummaryLoops
{
   public static void main(String [] args)
   {
      //counting loops
      int i = 1
      
      System.out.println("While");
      while (i <= 10)
      {
         //doing something interesting...
         system.out.println(i);
         
         if (something)
            break;
            
         if (skip rest of loop and start over)
            i++;
            continue;
            
         i++;
      }
      
      System.out.println("For");
      for (int j = 1; j <= 10; j++);
      
      //sentinel loops (reading loops)
      // info from outside program
      System.out.println("Sentinel");
      
      Scanner scan = new Scanner(System.in);
      int val = scan.nextInt();
      while (val != 17)
      {
      
      }
      
      System.out.println("do-while");
      int tax;
      
      do
      {
         tax = scan.nextInt();
         System.out.println("Processing: " + tax);
      }
      while (tax != 17);   
      
      //file loop
      try {
         File file = new File("data.txt")
         
         if (file.exists() != true) {
            //System.out.println("not there");
            //System.exit(0);
            file.create();
         
         Scanner infile = new Scanner(new File(file));
         
         while (infile.hasNext()) {
            String word = infile.next();
            System.out.println("Processing: " + word);
         }
      }
      catch (Exception e) {
         System.out.println("cries");
      }
      
   }
}