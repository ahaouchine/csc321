/*aziz haouchine
 *csc-321
 lab #6
*/


#include <stdio.h>

int main() {
    // Using the same initial values for both integer and double types.
    int x_int = 5, y_int = 2;
    double x_double = 5.0, y_double = 2.0;

    // Expression 1: x + y*x/y - x
    int result1_int = x_int + y_int * x_int / y_int - x_int;
    double result1_double = x_double + y_double * x_double / y_double - x_double;

    // Expression 2: -x - y/x*y + x
    int result2_int = -x_int - (y_int / x_int) * y_int + x_int;
    double result2_double = -x_double - (y_double / x_double) * y_double + x_double;

    // Expression 3: x + y - x/y
    int result3_int = x_int + y_int - x_int / y_int;
    double result3_double = x_double + y_double - x_double / y_double;

    // Print results
    printf("C Program Results:\n");
    printf("Integer calculations:\n");
    printf("  x + y*x/y - x = %d\n", result1_int);
    printf("  -x - y/x*y + x = %d\n", result2_int);
    printf("  x + y - x/y = %d\n", result3_int);

    printf("\nDouble calculations:\n");
    printf("  x + y*x/y - x = %f\n", result1_double);
    printf("  -x - y/x*y + x = %f\n", result2_double);
    printf("  x + y - x/y = %f\n", result3_double);

    return 0;
}

