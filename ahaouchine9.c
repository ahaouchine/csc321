// aziz haouchine
// csc321
// lab#9





#include <stdio.h>
#include <stdlib.h>
#include <time.h>


// Guess the number game in C
int main(void) 
{
    int randomNumber, userGuess;

    // Initialize random seed based on current time
    srand(time(NULL));
    randomNumber = (rand() % 20) + 1; 

    // Prompt user to guess
    printf("please make sure the number is between 1 and 20:\n\n");

    while (1) 
    {
        scanf("%d", &userGuess);

        // Check if the number entred is out of valid range
        if (userGuess < 1 || userGuess > 20)
       	{
            printf("You input a number that is out of range (1–20). Please try again:\n\n");
            continue;
        }

        // Correct guess
        if (userGuess == randomNumber) 
	{
            printf("You won and guessed the number correctly!\n");
            for (int i = 0; i < userGuess * 2; i++) {
                printf(" Congrats! \n");
            }

            break;

        }
       	else
       	{
            // Incorrect guess and tell the user if it's higher or lower AND reveal the correct number
            if (userGuess < randomNumber) 
	    {
            
		    printf("You lost! Your guess is LOWER than the correct number, which was %d.\n", randomNumber);
            }else
	    {
                printf("You lost! Your guess is HIGHER than the correct number, which was %d.\n", randomNumber);
            }
            break;
        }
    }

    return EXIT_SUCCESS;
}



