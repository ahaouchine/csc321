/* aziz haouchine
 * csc-321
 * lab #6
 */

public class ArithmeticEvaluation {


    public static void main(String[] args) {
        // Using the same initial values for both integer and double types.
        int x_int = 5;
        int y_int = 2;
        double x_double = 5.0;
        double y_double = 2.0;

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
        System.out.println("Java Program Results:");
        System.out.println("Integer calculations:");
        System.out.println("  x + y*x/y - x = " + result1_int);
        System.out.println("  -x - y/x*y + x = " + result2_int);
        System.out.println("  x + y - x/y = " + result3_int);

        System.out.println("\nDouble calculations:");
        System.out.println("  x + y*x/y - x = " + result1_double);
        System.out.println("  -x - y/x*y + x = " + result2_double);
        System.out.println("  x + y - x/y = " + result3_double);
    }
}
