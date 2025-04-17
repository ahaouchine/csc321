// Aziz Haouchine
// csc321
// lab # 11 






#include <stdio.h>
#include <math.h>
#include <stdlib.h> 

  // Function prototype 
   double calculateHypotenuse(double base, double height);
	

int main(void)
{
    double base, height, hypotenuse;

    // Prompt user for base and height
    printf("Enter the base of the triangle: ");
    scanf("%lf", &base);

    printf("Enter the height of the triangle: ");
    scanf("%lf", &height);

    // Call the function and store the result
    hypotenuse = calculateHypotenuse(base, height);

    // Display the result
    printf("The hypotenuse of the triangle is: %.2f\n", hypotenuse);



    return EXIT_SUCCESS;
}



double calculateHypotenuse(double base, double height)
{
    return sqrt((base * base) + (height * height));

}



