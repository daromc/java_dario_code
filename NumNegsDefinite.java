import java.util.Scanner;
/* Your algorithm goes here:
   get numIntegers
   set numberOfNegatives = 0
   
   for numIntegers times do
         get userNumber
         if (userNumber < 0 ) then
            numberOfNegatives = numberOfNegatives + 1
   
   report numberOfNegatives

*/

public class NumNegsDefinite {
   
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter number of integers: ");
      int numIntegers = userInput.nextInt();
      int numberOfNegatives = 0;
      
      for (int i = 0 ; i < numIntegers; i++) {
		   System.out.print("Enter an integer: ");
         int userNumber = userInput.nextInt();
         if (userNumber < 0 ){
            numberOfNegatives = numberOfNegatives + 1;
         }
      }
      // Your code goes here.
      
      System.out.println("There were " + numberOfNegatives + " negative values.");
   }
}