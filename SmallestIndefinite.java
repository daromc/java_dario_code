import java.util.Scanner;
/* Your algorithm goes here:

*/

public class SmallestIndefinite {
	final static int STOP = 0;    
    
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userNumber=1;
		System.out.print("Enter an integer: ");
		int smallestSoFar = userInput.nextInt();
		if (smallestSoFar != 0) {
			while (userNumber != STOP) {
				System.out.print("Enter an integer: ");
				userNumber = userInput.nextInt();
				if (userNumber == 0){
					
				}
				else if (userNumber < smallestSoFar) {
					smallestSoFar = userNumber;
				}
			}	
		}
		
	
      // Your code goes here.
      
		System.out.println("The smallest integer was: " + smallestSoFar);      
   }
}