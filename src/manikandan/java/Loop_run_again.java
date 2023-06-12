package manikandan.java;
import java.util.Scanner;
public class Loop_run_again {
	

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String userInput;

	    do {
	      // Your program code goes here, e.g.:
	      System.out.print("Enter a number: ");
	      int number = scanner.nextInt();
	      System.out.println("You entered: " + number);

	      // Ask the user if they want to run the program again
	      System.out.print("Do you want to run the program again? (y/n): ");
	      userInput = scanner.next();
	    } while (userInput.equals("y"));
	    
	    // Close the scanner when you're done using it
	    scanner.close();
	  
	}


}
