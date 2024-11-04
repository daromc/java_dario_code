import java.util.Scanner;

public class Ranger {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
		int numElements;
		System.out.println("enter number of elements");
		numElements = scnr.nextInt();
		
		if(numElements != 0){
   		int[] userList = new int[numElements];
   		int[] answerList = new int[numElements];
   		int countAnswer = 0;
   		for(int count = 0; count < numElements; count++){
			System.out.println(count+" Elements: ");
   		     userList[count] =  scnr.nextInt();
   		}
   		System.out.println(" Range Min: ");
   		int rangeMin = scnr.nextInt();
		System.out.println(" Range Max: ");
   		int rangeMax = scnr.nextInt();
   		
   		for(int count = 0; count < numElements; count++){
   		    if (rangeMin <= userList[count] && rangeMax >= userList[count]) {
   		       //System.out.print(userList[count]+",");
   		       answerList[countAnswer] = userList[count];
   		       countAnswer = countAnswer + 1 ;
   		    }    
   		}
		//System.out.println(countAnswer);
		//System.out.println(answerList[0]);
   		for(int count = 0; countAnswer > count; count++ ){
			//System.out.print("Count = "+count+" "+answerList[count]+",");
			if ((countAnswer - 1) == count){
				System.out.println(answerList[count]);
			}
			else{
				System.out.print(answerList[count]+",");
			} 
   		}
   	}
   	else{
   	   System.out.println("No values found in the range.");
   	}
   }
}
