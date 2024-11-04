import java.util.Scanner;
public class array{
   final static int STOP = 0;
   
   public static void main(String[] args) {
		final int MAX = 6;
		int[] numbers = new int[MAX];
		System.out.println("The length of the array is: "+numbers.length);
		numbers[0]=7;
		numbers[3]=10;
		System.out.println("The position [0] of the array is: " + numbers[0]);
		System.out.println("The position [MAX-3] of the array is: " + numbers[MAX-3]);
		System.out.println("The position [MAX-2] of the array is: " + numbers[MAX-2]);
		
		int[] numbers_1 = {0,1,3,4,5};
		System.out.println("The position [0] of the array is: " + numbers_1[0]);
		System.out.println("The position [1] of the array is: " + numbers_1[1]);
		System.out.println("The position [2] of the array is: " + numbers_1[2]);
		System.out.println("FOR LOOP");
		int[] numbers_2 = new int[5];
		for (int i = 0; i < (numbers_2.length - 1);i++){
			System.out.print(numbers_2[i]+"-");
		}
		System.out.println("WHILE LOOP");
		int[] numbers_3 = new int[4];
		int i = 0;
		while (i< (numbers_3.length- 1)){
			System.out.println(numbers_2[i]+"-");
			i++;
		}
   }
}