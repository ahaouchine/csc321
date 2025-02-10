import java.util.Scanner;

public class ahaouchine4 {

	
	 public static void main(String[] args) {
	        Scanner choose = new Scanner(System.in);

	        // Displaying the menu options
	        System.out.println("Welcome to Choose an option:");
	        System.out.println("1. Say Hello");
	        System.out.println("2. Say Goodbye");
	        System.out.println("3. Give a Compliment");
	        System.out.println("4. Offer Motivation");

	        // Reading user's choice
	        System.out.print("Enter your choice (1-4): ");
	        int choice = choose.nextInt();

	        // Displaying the corresponding message
	        switch (choice) {
	            case 1:
	                System.out.println("Hello, Hope you're having a wonderful day");
	                break;
	            case 2:
	                System.out.println("Goodbye, Take care and see you later");
	                break;
	            case 3:
	                System.out.println("You are amazing, Keep being awesome");
	                break;
	            case 4:
	                System.out.println("Keep going, Success is just around the corner");
	                break;
	            default:
	                System.out.println("Invalid choice. Please run the program again and choose between 1 and 4.");
	                break;
	        }

	        choose.close();
	    }
	}





