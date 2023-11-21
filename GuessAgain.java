import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessAgain {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int numGuess = 0;
		int randomNumber = new Random().nextInt(10) + 1;
		
		out.println("		************		");
		out.println("Welcome to the Guessing Game");
		out.println("		************		");
		out.println();
		
		out.print("Enter an int from 1 to 10: ");
		int inputNumber = keyboard.nextInt();
		
		// int numGuess = 0;
		// int randomNumber = new Random().nextInt(10) + 1;
		
		numGuess++;
		
		while (inputNumber != randomNumber) {
			out.println();
			out.println("Try again...");
			out.println("Enter an int from 1 to 10: ");
			inputNumber = keyboard.nextInt();
		}
		
		out.print("You win after ");
		out.println(numGuess + " guesses.");
		
		keyboard.close();
	}
}	