
import java.util.Scanner; 

public class ReverseBinary {
   public static void main(String[] args) {
      final int BASE= 2;
      
      Scanner scnr = new Scanner (System.in);
      /*System.out.println("Enter a Number: ");*/
      
      int quotation = 0;
      int remainder = 0;
      int numDecimal = scnr.nextInt();
      
      while(numDecimal <= 0){
         System.out.println("Input must be greater than zero.");
         numDecimal = scnr.nextInt();
      }
      
      do{ 
         numDecimal =  numDecimal / BASE;
         remainder = numDecimal % BASE;
         System.out.print(remainder);   
      }while(numDecimal != 0 );
         
      /* Type your code here. */
   }
}
