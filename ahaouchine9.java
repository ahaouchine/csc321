// aziz haouchine
// csc 321
// lab number 9




import java.util.Scanner;
import java.util.Random;


public class GuessNumberGame {

    public static void main(String[] args) {

        int randomNumber, userGuess;

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Generate a random number between 1 and 20
        randomNumber = rand.nextInt(20) + 1;

        // Prompt the user to guess
        System.out.println("Guess a number between 1 and 20:\n");

        while (true) {
            userGuess = scanner.nextInt();

            // Check if guess is out of range
            if (userGuess < 1 || userGuess > 20) {
                System.out.println("You input a number that is out of range (1–20). Please try again:\n");
                continue;
            }

            // Correct guess
            if (userGuess == randomNumber) {
                System.out.println("You won and guessed the number correctly!");
                
		for (int i = 0; i < userGuess * 2; i++) {
                    System.out.println(" Congrats! ");
                }
                break;
            
	    } else {
                
		    // Incorrect guess 
                if (userGuess < randomNumber) {
                    System.out.println("You lost, Your guess is LOWER than the correct number, which was " + randomNumber + ".");
                
		} else {
                    System.out.println("You lost, Your guess is HIGHER than the correct number, which was " + randomNumber + ".");
                }
                break;
            }
        }

        scanner.close();
    }
}







