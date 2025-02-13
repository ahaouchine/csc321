// Aziz Haouchine
// csc321
// lab#five



#include <stdio.h>
#include <stdlib.h>

int main(void) { 

    // Declare and initialize variables
    int i, x = 0;
    char myChar = 'c';
    float cost = 22.770680;
    float floatVar = 33.5;
     
    /* declar variable y out of the statement 

     } 
     int y =100;
     }
     printf("The value of y is %d and its address is %p\n", x, &x);

     */

    // Print the addresses and values of each variable
    printf("The value of x is %d and its address is %p\n", x, &x);
    printf("The value of myChar is %c and its address is %p\n", myChar, &myChar);
    printf("The value of cost is $%.6f and its address is %p\n", cost, &cost);
    printf("The value of floatVar is %.6f and its address is %p\n", floatVar, &floatVar);

    // Declare and initialize an array with more elements
    int arr[100];
    for (i = 0; i < 100; i++) {
        arr[i] = i;
    }

    // Print the addresses of selected elements
    printf("\nArray addresses:\n");
    int indices[] = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81};
    for (i = 0; i < 10; i++) {
        printf("Address of arr[%d] = %p\n", indices[i], &arr[indices[i]]);
    }

    return EXIT_SUCCESS;


    }




