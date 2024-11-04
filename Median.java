/*
Median
	set i = 0
	set numElements = 0
	set userList[11]
	
	get userList[0]
	
	if (userList[0] >= 0) then
		i = i + 1
		get userList[i]
		while (userList[i] >= 0) do
			get userList[i]
			if (userList[i] >= 0) then
				i = i+1
		i = i-1
		double median
		median = (double) userList[i/2]
		if (i%2 == 0) then
			Report Median is: + median
		else
			median  = (userList[i/2] + userList[i/2]) / (double) 2
			report Median is + median
		
else
		report "no Data enter"
   
*/

import java.util.Scanner; 

public class Median {
   public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int i = 0;
		int numElements = 0;
		
		int[] userList = new int[20];
		
		userList[0] =  scnr.nextInt();
		if(userList[0] >= 0) {
			i = i + 1;
			
			while (userList[i] >= 0 && i < 11){
			   userList[i] =  scnr.nextInt();   // Input begins with number of integers that follow
			   if (userList[i] >= 0 ){
					i = i + 1;
			   }
			}
			double median;
			i = i -1;
			//System.out.println("i: " + i);
			if (i % 2 == 0 && i < 10) {
				//System.out.println("i/2: " + i/2);
				median = (double)userList[(i / 2)];
				System.out.println("Median: " + median);
			}
			else if (i == 10){
				median = ((userList[4] + userList[5])/((double)2));
				System.out.println("Median: " + median);
			}
			else {
			   median = ((userList[i/2] + userList[((i/2)+ 1 )])/((double)2));
			   //System.out.println("i/2: " + userList[i/2] + " " + userList[((i/2)+ 1 )]);
			   System.out.println("Median: " + median);
			}
		}
		else {
			System.out.println("No data entered.");
		}
   }
}

