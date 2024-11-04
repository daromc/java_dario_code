import java.util.Scanner;
/* Your algorithm goes here:

*/

public class LargestDefinite {
   
   public static void main(String[] args) {
      
   Scanner userInput = new Scanner(System.in);
   System.out.print("How many integers do you have? ");
   int numIntegers = userInput.nextInt();
   int largestSoFar;
   if (numIntegers <= 0 ){
      largestSoFar=0;
   }
   else {
	  System.out.print("Enter an integer: ");
	  largestSoFar = userInput.nextInt();
      for (int i = 0 ; i < (numIntegers - 1) ; i++) {
		System.out.print("Enter an integer: ");
		int userNumber = userInput.nextInt();
		if (userNumber > largestSoFar){
			largestSoFar = userNumber;
		}
	  }
   }
      

      // Your code goes here.
      
      System.out.println("The largest integer entered is " + largestSoFar + ".");
      
   }
}