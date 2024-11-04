import java.util.Scanner;
/* Your algorithm goes here:
get userNumber
set nextNumber = 0


if(userNumber is different to 0) then
   report Enter an integer:
   get nextNumber
   while (userNumber > nextNumber) do
      report Enter an integer:
      get userNumber
   
   if (nextNumber > userNumber) then
      report the integers are in ascending order
   else
      report the integers aare in descending order
      
   else
   report the integers are in ascending order 


*/

public class AscendingOrder {
   final static int STOP = 0;
   
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int userNumber = userInput.nextInt();
      int nextNumber = 1;
      boolean ascending = false;
      boolean stop = false;
      
      if (userNumber != STOP ){
         System.out.print("Enter an integer: ");
         nextNumber = userInput.nextInt();
         System.out.println("userNum "+ userNumber);
         System.out.println("nextNum "+ nextNumber);
         if (nextNumber < userNumber ){
            ascending = true;
         }
         while ((userNumber != 0) && (nextNumber != 0) && (stop == false)) {
            System.out.print("inside while Enter an integer: ");
            userNumber = userInput.nextInt();
            System.out.println("inside 1 userNum "+ userNumber);
            System.out.println("inside 1 nextNum "+ nextNumber);
            System.out.println("ascending: "+ ascending);
            if (userNumber > nextNumber) {
               nextNumber = userNumber;
               System.out.println("inside if userNum "+ userNumber);
               System.out.println("inside if nextNum "+ nextNumber);
               System.out.println("inside if ascending: "+ ascending);
            }
            else if(userNumber == 0){
               stop = true;
               ascending = false;
            }
            else if(userNumber < nextNumber){
               stop = true;
               ascending = true;
               //nextNumber = userNumber;
               System.out.println("inside else if userNum "+ userNumber);
               System.out.println("inside else if nextNum "+ nextNumber);
               System.out.println("inside else if ascending: "+ ascending);
            }
         }
         
         if ( userNumber == 0 || nextNumber == 0 || nextNumber < userNumber || ascending == true){
            System.out.println("ascending esta en "+ ascending);
            if (ascending == false) {
               System.out.println("The integers were in ascending order.");
            }
            else if (ascending == true) {
               System.out.println("The integers were not in ascending order.");
            }
         }
      }   
      else {
         System.out.println("The integers were in ascending order.");
      }
      // Your code goes here.
   }
}