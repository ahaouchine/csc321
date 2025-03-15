// aziz haouchine
// csc321
// lab#6






public class FunctionEvaluateDifferently {

    // Recursive function for integer division
    static int divideInt(int n) {
        if (n <= 1)
	       
       	return n;

               return divideInt(n / 2); // Integer division
    }

    // Recursive function for floating point division
    static double divideDouble(double n) {
        if (n <= 1.0)

	return n;

               return divideDouble(n / 2.0); // Floating point division
    }

    public static void main(String[] args) {
        int numInt = 100;
        double numDouble = 100.0;

        System.out.println("Java Program Results:");
        System.out.println("Final result (int): " + divideInt(numInt));
        System.out.println("Final result (double): " + divideDouble(numDouble));
    }
}
