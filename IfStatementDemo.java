import java.util.Scanner;

public class IfStatementDemo {
    /*
        This program prompts the user for the price of an item.
        If the price ends in a 9 it will be rounded up to the nearest 10.
        
        This demonstrates an if statement as well as the modulo (%) operator.
    */
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the (integer) price: ");
        int price = userInput.nextInt();
        
        if (price % 10 == 9) {
            price = price + 1;
            System.out.println("The price was adjusted.");
        }
        
        System.out.print("The price is: " + price);
    }
}