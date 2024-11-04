import java.util.Scanner;

public class PlayerRoster {
   /* Note:
         We use the keyword "static" for things that are declared
         inside a class, but not inside any method.
      
         Static things belong to the class.
         
         We will learn much more about static when we study OOP
         (object oriented programming a bit later in ICS114 and more in ICS124 next term.)
         For now, remember "Things declared as static belong to the class."
      
         Here we are defining static constants.
   */   
   
   final static int NUM_PLAYERS = 5;

   final static String QUIT_OPTION = "Q";
   final static String UPDATE_OPTION = "U";
   final static String ABOVE_A_RANKING_OPTION = "A";
   final static String REPLACE_A_PLAYER_OPTION = "R";
   final static String DISPLAY_ROSTER_OPTION = "O";
   
   /* Note:
      The following statement (line 43) declares the scanner as a global variable:
            that is, a variable declared inside a class, but not declared in a method.

      The variable scnr, because it is a global variable,
      will be available to all methods without passing it as a parameter.
      
      Please remember, in general, the rule is do NOT use global variables!
            Programmers over the years have learned that global variables
            cause all sorts of side-effects which cause all sorts of debugging
            headaches.
            Also, remember, there are exceptions to every rule.
            One just has to know when it is ok to make an exception!
               The Scanner object, in this case, is one such exception.
               Please ask me if the reasoning is not clear.
           
      Note that the constants declared above are global as well.
   */
   static Scanner scnr = new Scanner(System.in); 
   
   public static void main(String[] args) {
      int[] jerseyNums = new int[NUM_PLAYERS];
      int[] ratings = new int[NUM_PLAYERS];
      
      getRoster(jerseyNums, ratings);
      displayRoster(jerseyNums, ratings);
      
      String menuOption;
      do {
         menuOption = getMenuOption();
         performMenuOption(menuOption);
      } while (!menuOption.equals(QUIT_OPTION));
   }
   
   public static void performMenuOption(String userChoice) {
      
      switch (userChoice) { 
         case UPDATE_OPTION : performUpdate(); break;
         case ABOVE_A_RANKING_OPTION : performOutputAboveAranking(); break;
         case REPLACE_A_PLAYER_OPTION : performReplaceAplayer(); break;
         //case DISPLAY_ROSTER_OPTION : displayRoster(); break;
         case QUIT_OPTION : System.out.println("Bye.");
      }
      
   }
   
   public static void performUpdate() {
      System.out.println("Enter a jersey number:");
      int playerJersey = scnr.nextInt();
            
      System.out.println("Enter a new rating for player:");
      int playerRating  = scnr.nextInt();

      boolean upDateDone = false;
      int playerIndex = 0;
      int playerJerseys[] = new int[5];
      int ratings[] = new int[5];
      while (playerIndex < NUM_PLAYERS && !upDateDone) {
         if (playerJerseys[playerIndex] == playerJersey) {
               ratings[playerIndex] = playerRating;
               upDateDone = true;
         }
         else playerIndex++;
      }
   }   
   
   public static void performOutputAboveAranking() {
      System.out.println("Enter a rating:");
      int lowestRankingWanted  = scnr.nextInt();
            
      System.out.println("\nABOVE " + lowestRankingWanted);
      int ranks[] = new int[5];
      int shirtNums[] = new int[5];
      for (int i = 0; i < NUM_PLAYERS; ++i) {
            if (ranks[i] > lowestRankingWanted)
               System.out.println("Player " + (i + 1) + " -- Jersey number: " + shirtNums[i] +
                                  ", Rating: " + ranks[i]); 
      }       
   }
   
   public static void performReplaceAplayer() {
      System.out.println("Enter a jersey number:");
      int playerJersyToReplace = scnr.nextInt();
      int shirts[] = new int[5];
      int categories[] = new int[5]; 
      int playerIndex = 0;
      boolean found = false;
      while (playerIndex < NUM_PLAYERS && !found){
         if (playerJersyToReplace == shirts[playerIndex])
            found = true;
         else playerIndex++;
      }

      if (found) {         
         System.out.println("Enter a new jersey number:");
         playerJersyToReplace = scnr.nextInt();
               
         System.out.println("Enter a rating for the new player:");
         int newPlayerRating  = scnr.nextInt();
               
         shirts[playerIndex] = playerJersyToReplace;
         categories[playerIndex] = newPlayerRating;
      } 
   }
      
   public static void getRoster(int[] jerseyNums, int[] ratings) {
      //int jerseyNums[] = new int[5];
      //int ratings[] = new int[5];
      for (int i = 0; i < NUM_PLAYERS; i++) {
         System.out.println("Enter player " + (i + 1) + "'s jersey number:");
         jerseyNums[i] = scnr.nextInt();
         
         System.out.println("Enter player " + (i + 1) + "'s rating:");
         ratings[i] = scnr.nextInt();
         
         System.out.println("");
      }
   }
   
   public static void displayRoster(int[] jerseyNums, int[] ratings) {
      System.out.println("ROSTER");
      /*for (int i = 0; i < NUM_PLAYERS; i++) {
         System.out.println("Player " + (i + 1) + " -- Jersey number: " + playerJerseyNums[i] + 
                            ", Rating: " + ratings[i]);
      }
      */
   }
   
   public static String getMenuOption() {      
      String userInput;
      do {
         System.out.println("\nMENU");
         System.out.println("u - Update player rating");
         System.out.println("a - Output players above a rating");
         System.out.println("r - Replace player");
         System.out.println("o - Output roster");
         System.out.println("q - Quit");
      
         System.out.println("\nChoose an option:");
         userInput = scnr.next();
      } while(!userInput.matches("[uUaArRoOqQ]"));
      
      return(userInput.toUpperCase());
   }
}