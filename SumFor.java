import java.util.Scanner;
/* Your algorithm goes here:

get integer numIntegers
set integer sum

for numIntegers times do
    get integer userNumber
    sum = sum + userNumber

report sum

*/

public class SumFor {
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.print("How many integers do you have? ");
      int numIntegers = userInput.nextInt();
      int sum = 0;
      
      for (int i = 0 ; i < numIntegers; i++) {
		   System.out.print("Enter integer "+ i + ": ");
         int userNumber = userInput.nextInt();
         sum = sum + userNumber;
      }
      
      System.out.println("The sum is " + sum + ".");
      
      // Your code goes here.
      // Use the prompt: "Enter integer " + i + ": "
      // Use this statement to report the sum: System.out.println("The sum is " + sum + ".");
   }
}