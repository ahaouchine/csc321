// aziz haouchine
// csc321
// midterm
    





import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
	
 // we can change this number
 //
        int secretNumber = 5;
        String prize = "a brand new smartphone!";
        String losingMessage = "Oops! Try again next time.";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int userGuess = scanner.nextInt();

        if (userGuess == secretNumber) {
            System.out.println("Congratulations! You won " + prize);
        } else {
            System.out.println("Sorry, that's incorrect. " + losingMessage);
        }

        scanner.close();
    }
}
