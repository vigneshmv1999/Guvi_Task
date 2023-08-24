package guvi.task8;

import java.util.Scanner;

public class task7 {
	
	public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate and print the length of the string
        int stringLength = inputString.length();
        System.out.println("Length of the string: " + stringLength);

        // Close the scanner
        scanner.close();
    }
}




