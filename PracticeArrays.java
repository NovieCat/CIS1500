import java.util.*;

public class PracticeArrays
{
   public static void main(String [] args)
   {
      int [] arr = { 111, 22, 19, 399, 61, 43 };
      
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      list2.add(1000);
      list2.add(2000);
      list2.add(3000);
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(111);
      list.add(22);
      list.add(19);
      list.add(399);
      list.add(61);
      list.add(43);
      
      list.remove(2);
      
      list.add(1, 99);
      
      list.set(0, 555);
      //list.clear();
      
      list.addAll(list2);
      
      System.out.println(list.toString());
      
      /*give sum of the odd values in the array
      int i = 0;
      int oddSum = 0;
      
      while (i < arr.length) {
         if (arr[i] % 2 == 1) {
            oddSum += arr[i];
         }
         i++;
      }
      
      int j = 0;
      for (j = 0; j < arr.length; j++) {
         if (arr[i] % 2 == 1) {
            oddSum += arr[i];
         }
      }
      
      System.out.println(oddSum);
      
      
      //report the smallest value
      int smallest = arr[0];
      int k = 1;
      for (k = 1; k < arr.length; k++) {
         if (arr[k] < smallest) {
            smallest = arr[k];
         }
      }
      
      System.out.println(smallest);
      */
   }
}