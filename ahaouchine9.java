// aziz haouchine
// csc 321
// lab number 9




import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int randomNumber = 3;
        int userGuess;
        Scanner scanner = new Scanner(System.in);

        // Display the correct number before the user guesses
        System.out.println("Your correct number is " + randomNumber + "\n");

        System.out.println("Guess a number between 1 and 20:\n");

        while (true) {
            userGuess = scanner.nextInt();

            // Check if the guess is out of range
            if (userGuess < 1 || userGuess > 20) {
                System.out.println("You input a number that is out of range (1-20) re-enter a valid number.\n");
                continue;
            }

            // Check if the guess is correct
            if (userGuess == randomNumber) {
                for (int i = 0; i < userGuess * 2; i++) {
                    System.out.println("You won and guessed the number correctly!");
                }
                break;
            } else {
                // Inform user of loss and whether their guess was too high or too low
                if (userGuess < randomNumber) {
                    System.out.println("You lost and your guess is lower than my number which was " + randomNumber + ".");
                } else {
                    System.out.println("You lost and your guess is higher than my number which was " + randomNumber + ".");
                }
                break;
            }
        }

        scanner.close();

    }
}
