/*
CountChars
   set integer sumChars = 0
   set char charUser = ''
   set interation = 0
   
   get String userString
   charUser = userString[0]
   
   while (userString[interation] != '') do
      if(userString[interation] == charUser) then
         sumChars = sumChars + 1
      
      interation = interation + 1   
   
   report sumChars, charUser
   
*/

import java.util.Scanner;

public class CountChars {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int sum = 0;
      
      /*System.out.println("Enter a line: ");*/
      
      char ch = keyboard.next().charAt(0);
      
      
      String inputline = keyboard.nextLine();
      /*System.out.println("inputLine = " + inputline + " ch = " +ch);*/
      
      for(int i=0; inputline.length() > i ; i++ ){
         System.out.println("chartat(i) = " + inputline.charAt(i) + " ch = " +ch +" length string: " +inputline.length());
         if (inputline.charAt(i) == ch) {
            sum = sum + 1;
         }
      }
      
      if (sum == 1){
         System.out.println(sum + " " + ch);
      }
         
      else {
         System.out.println(sum + " " + ch + "'s");
      }
      /* Type your code here. */
   }
}