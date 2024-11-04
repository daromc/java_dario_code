import java.util.Scanner;
/* Your algorithm goes here:

set CONSTANT STOP = -1
set userNumber = 0
set sum = 0


while (userNumber != STOP) then
   Report Enter an integer:
   get userNumber
   if (userNumber != STOP) then
      sum = sum + userNumber

Report sum

*/

public class SumWhile {
   static final int STOP = -1;   
   
   public static void main(String[] args) {        
      Scanner userInput = new Scanner(System.in);
      int userNumber = 0;
      int sum = 0;
      
      while (userNumber != STOP) {
		   System.out.print("Enter an integer: ");
         userNumber = userInput.nextInt();
         if (userNumber != STOP) {
            sum = sum + userNumber;
         }
         
      }
      // Your solution goes here.
      
      System.out.println("Sum is " + sum + ".");
   }
}