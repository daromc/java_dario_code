import java.util.Scanner;

public class ArrayReverser {
   public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
        // List of numElement integers specified by the user
		int numElements;                // Number of integers in user's list
		// Add more variables as needed
		/*System.out.print("Digite el numbero de elementos: ");*/
		numElements = scnr.nextInt();   // Input begins with number of integers that follow
		int[] userList = new int[numElements];
      
		for (int count=0; userList.length > count; count++){
            userList[count] = scnr.nextInt();
		}
		System.out.println(userList.length+"  ");
		for (int count_2 = userList.length-1;  0 < count_2; count_2--){
			System.out.println(count_2);
            System.out.print(userList[count_2]+" ");
		}
      System.out.println("");
/* 		for (int count= userList.length; count > 0; count--){
            System.out.print(userList[count]+" ");
		} */
      /* Type your code here. */
   }
}
