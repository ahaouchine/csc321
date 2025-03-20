// Aziz Haouchine
// csc321
// lab#10



    import java.util.Scanner;

public class CylinderCalculator {


    // Method to calculate the volume of a cylinder

    public static double calculateCylinderVolume(double radius, double height) {
        
	    return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user for input
	
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Call the methods to calculate volume
	
        double volume = calculateCylinderVolume(radius, height);

        // Display the results

        System.out.printf("The volume of the cylinder is: %.2f\n", volume);

       scanner.close();
    }
}

