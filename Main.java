/**
 * Main class for copying negative values with ArrayLists
 * @author Anindita Roy
 * CIS 36B, 
 * Practice Program 7.2
 */
// Add import statement from starter code here
import java.util.ArrayList;
import java.util.Scanner;

// Implement the Main class using starter code and instructions above.
public class Main {
   public static void main(String[] args) {
      final int NUM_ELEMENTS = 6;
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> listInts = new ArrayList<Integer>();
      // Hint: Declare listNegInts
      ArrayList<Integer> listNegInts = new ArrayList<Integer>();
      int i;

      // Get input integers
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         listInts.add(scnr.nextInt());
      }

      // Type your code here.
      for (i = 0; i < listInts.size(); i++) {
         if (listInts.get(i) < 0) {
            listNegInts.add(listInts.get(i));
         }
      }

      // Output number of negative elements
      System.out.println(listNegInts.size());

      // Output the negative elements
      for (i = 0; i < listNegInts.size(); i++) {
         System.out.println(listNegInts.get(i));
      }
   }
}