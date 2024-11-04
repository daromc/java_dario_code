/*
Goals: To gain experience with
1. declaring and initializing variables
2. arithmetic operators: / %
3. type casting (explicit and implicit)
4. syntax errors
5. constants

Instructions:
Provide the Java code indicated by the comments (//)
Save, compile and run after each step.
When there is a question, supply your answer in a comment.
(This will be useful to you when you are studying later.)
Do not remove the comments once you have completed a task!!
*/
import java.util.Scanner;

public class ExerciseStart1 {
    public static void main(String args[]) {
        System.out.println("Variables, Arithmetic Operators, and Type Casting\n");
        
        // 1. Here: Declare 2 integer variables with variable names: num, count.
        //       Initialize both to zero.
        //       Question: What if you initialize an integer to 0.0? Try it. Is not possible, because is a double format.
         int num =0;
		 //num = (double)0.0;
         int count = 10;
		System.out.println("1. num = " + num);
		System.out.println("2. count = " + count);

        // 2. Here: Declare 2 double variables with variables names: temperature, price.
        //       Initialize both to zero.
        //       Question: Do you have to use 0.0 (ie Can you just use 0?) Why or why not?  // Not neccesary, is ok the 0, because the deffinition of double means a decimal number.
        double temperature = 1;
		double price = 2.0;
		System.out.println("2. temperature = " + temperature);
		System.out.println("2. price = " + price);
		
        // 3. Here: Remove the comment indicator from the following output statement.
        //       Observe the \n. What does it do?  // the \n is a end line it separate the text in other line 
         System.out.println("3. Temperature is: " + temperature + "Price is: " + price);
        
        // 4. Here: Declare a float variable called depth.
        //       Initialize it to 0.0.
        //       Compile. What happens? Why? How can we correct the error? (four ways) sintaxis error, 
        float dept = 1.45f;
		System.out.println("4.1 dept = " + dept);
		dept = 1;
		System.out.println("4.2 dept = " + dept);
		dept = 2.0f;
		System.out.println("4.3 dept = " + dept);
		dept = (float)3;
		
		System.out.println("4.4 dept = " + dept);
		
        // 5. Here: Provide an assignment statement to store 150.99 in variable price.
		
		price = 150.99;
		System.out.println("5. price = " + price);
        
        // 6. Here: Provide an assignment statement to store price in count.
        //      What happens? Why? How can it be fixed? // is not posible to assign store in count because this is not an integer. 
		
		count = (int)price;
        System.out.println("6. price = " + count);
		
        // 7. Here: Remove the comment from the following statement to display price and count.
        //       Think: What do you expect to happen?  //  Price is 2.0 and count is 10. Price is an double variable and count is an integer.
        System.out.println("7. price is " + price + " and count is " + count);
		
        // 8. Here: Provide an assignment statement to store the value 10 in variable num.
        num = 10;
		System.out.println("8. num = " + num);
        // 9. Here: Provide an assignment statement to store the value 3 in variable count.
        count = 3;
		System.out.println("9. count = " + count);
        // 10. Here: Declare an integer variable called quotient.
        //       Initialize it to num/count
        int quotient;
		quotient = num/count;
		System.out.println("10. Quotient = " + quotient);
		
        // 11. Here: Remove the comment indicator from the following output statement.
        
		System.out.println("11. " + num + " / " + count + ": quotient is: " + quotient);
        
		
		
        // 12. Here: Declare an integer variable called remainder.
        //       Initialize it to the remainder when num is divided by count.
        
		int remainder = num % count;
		
		
		
        // 13. Here: Copy the System.out.println statement from above and paste it here.
        //       Change quotient to remainder (two occurrences.)
        System.out.println("13. " + num + " % " + count + ": remainder is: " + remainder);
		
        // 14. Here: Declare a float variable called floatQuotient.
        //       Initialize it to num / count.
		float floatQuotient = num/(float)count;
		
        System.out.println("14. " + num + " / " + count + ": floatQuotient is: " + floatQuotient);
        // 15. Here: Again, paste the System.out.println statement here.
        //       This time, display floatQuotient to the screen.
        
		System.out.println("15. " + num + " / " + count + ": floatQuotient is: " + floatQuotient);
		
        // 16. Here: Change all of the above System.out.println statements to System.out.print statements.
        //       Observe the output. What happens? Why?  // they apper in the same line, because the println insert an enter to the text.
		System.out.println("16. ----------------------16. ------------------------------------");
		System.out.print("16. " + num + " / " + count + ": quotient is: " + quotient);
        System.out.print(". " + num + " % " + count + ": remainder is: " + remainder);
        System.out.print(". " + num + " / " + count + ": floatQuotient is: " + floatQuotient);
		System.out.print(". " + num + " / " + count + ": floatQuotient is: " + floatQuotient);
		
        // 17. Here: Declare a float called value.
        //       Initialize it to num / count.
        //       Notice the implicit type conversion that is done.
		//		 Again, paste the System.out.println statement here and make the appropriate changes.
        
		float value;
		value = num/count;
		System.out.println("17. -------------------------------------------");
		System.out.println("17. "+ num + " / " + count + " = value = " +  value);
		
        // 18. Here: Copy and paste the above two lines and then change the integer division operator to the modulo operator.
        //       You will have to make one change. Try to compile to determine what needs to be changed.
        //       Is there implicit type conversion again?
		//	     Yet, again, provide a System.out.println statement to see what is happening.
		
		value = num%count;
		System.out.println("18. -------------------------------------------");
		System.out.println("18. "+ num + " % " + count + " = value = " +  value);
		
		
		// 19. Here: Let's see floating point division.
		//       Declare variables called size, height, width. The first two are of type float and the last of type int.
		//       Initialize height to 100.3 and width to 7.
		//       Provide an assignment statement that assigns size the value of height / width.
		// 	     Question: What type of division is this?
		//       Write a System.out.println statement to output size, height and width.
        
		float size, height;
		int width;
		
		height= (float)100.3;
		width = 7;
		size = height / width;
		
		System.out.println("19. -------------------------------------------");
		System.out.println("19. height "+ height + " / width " + width  + " = size = " +  size);
		
        // 20. Here: This is the formula to convert a Fahrenheit temperature to Celcius.
        //     5 / 9 * (fahrenheit -32)
        //     Declare and initialize variables to perform this conversion.
        //     You need not get input from the user. Simply use an assignment statement to store a value in fahrenheit.
        //     Output the celsius value as a real number.
        //     Once you have done this, replace the values 5, 9, 32 with constants. (See zyBooks: Constants)
		
		//-------------------------------------------------------------------------------------------------------
		//Scanner userInput = new Scanner(System.in);
		float celcius;
		float CONSTANTE_1 = 5;
		final int CONSTANTE_2 = 9;
		final int CONSTANTE_3 = 32;
		
		System.out.println("20. --------------------------------------------------------------------------------");
		//System.out.print("20. Please enter the temperature value in fahrenheit: ");
		//double fahrenheit = userInput.nextDouble();
		float fahrenheit = 90.0f;
		celcius = (CONSTANTE_1/CONSTANTE_2)*(fahrenheit - CONSTANTE_3);
		System.out.println("20. --------------------------------------------------------------------------------");
		System.out.println("20. CONSTANTE_1 = " + CONSTANTE_1);
		System.out.println("20. CONSTANTE_2 = " + CONSTANTE_2);
		System.out.println("20. CONSTANTE_3 = " + CONSTANTE_3);
		System.out.println("20. Fahrenheit = "+ fahrenheit);
		System.out.println("20. Fahrenheit = "+ fahrenheit + " is equal to "+ celcius + " celcius degrees, Real number. ");
		System.out.println("20. Fahrenheit = "+ fahrenheit + " is equal to "+ (int)celcius + " celcius degrees in int. ");
		CONSTANTE_1 = 111;
		System.out.println("20. CONSTANTE_1 = " + CONSTANTE_1);
		//int a = 0;
		//a = (double)5;
		
		
    }
}
