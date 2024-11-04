import java.util.Scanner;
import java.util.Random;
/* Your algorithm goes here:

*/

public class GuessingGame {
   final static int MAX = 10;   
   final static long SEED = 101253;    
   
   public static void main(String[] args) {    
      Scanner userInput = new Scanner(System.in);
        
      Random generator = new Random();
      generator.setSeed(SEED);
      int rand = generator.nextInt(MAX) + 1;
      
	  int userNumber;
      
      boolean guessed = false;
      System.out.println("Random number is "+ rand);
      while (guessed == false) {
         System.out.print("Enter your guess (Hint: It is between 1 and 10): ");
         userNumber = userInput.nextInt();
         if (userNumber == rand) {
            guessed = true;   
         }
         else if (userNumber > rand) {
            System.out.println("Your guess is greater than the random number.");
         }
         else {
            System.out.println("Your guess is less than the random number.");
         }
      
      }
      System.out.println("You guessed it!");
      // Your code goes here.
        
   }
}