// aziz haouchine
// csc321
// lab#6





#include <stdio.h>
#include <stdlib.h> 

// Recursive function for integer division
int divideInt(int n) {
    if (n <= 1) 
   
    return n;
           
         return divideInt(n / 2); // Integer division
}

// Recursive function for floating point division
double divideDouble(double n) {
    if (n <= 1.0) 
	    
    return n;
          
         return divideDouble(n / 2.0); // Floating-point division
}

int main() {
    int numInt = 100;
    double numDouble = 100.0;

    printf("C Program Results:\n");
    printf("Final result (int): %d\n", divideInt(numInt));
    printf("Final result (double): %f\n", divideDouble(numDouble));

    return EXIT_SUCCESS; 

}



