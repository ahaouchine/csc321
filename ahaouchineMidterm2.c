// Aziz Haouchine
// csc321
// midt#2




#include <stdio.h>
#include <stdlib.h>

// Function prototype
void printMyName(int times);

int main(void)
{
    int num;

    // Prompt user for number of times to print the name
    printf("Enter the number of times to print your name: ");
    scanf("%d", &num);

    // Call the function
    printMyName(num);

    return EXIT_SUCCESS;
}

// Function definition
void printMyName(int times)
{
    for (int i = 0; i < times; i++)
    {
        printf("Aziz\n");
    }
}


