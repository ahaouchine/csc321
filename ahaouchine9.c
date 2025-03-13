// aziz haouchine
// csc321
// lab#9



#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int randomNumber = 3, userGuess;
    
    // Display the correct number before the user guesses
    printf("Your correct number is %d\n\n", randomNumber);
    
    printf("Guess a number between 1 and 20:\n\n");
    
    while (1) {
        scanf("%d", &userGuess);
        
        // Check if the guess is out of range
        if (userGuess < 1 || userGuess > 20) {
            printf("You input a number that is out of range (1-20) re-enter a valid number.\n\n");
            continue;
        }
        
        // Check if the guess is correct
        if (userGuess == randomNumber) {
            for (int i = 0; i < userGuess * 2; i++) {
                printf("You won and guessed the number correctly!\n");
            }
            break;
        } else {
            // Inform user of loss and whether their guess was too high or too low
            if (userGuess < randomNumber) {
                printf("You lost and your guess is lower than my number which was %d.\n", randomNumber);
            } else {
                printf("You lost and your guess is higher than my number which was %d.\n", randomNumber);
            }
            break;
        }
    }
    
    return EXIT_SUCCESS;
}
    
   






