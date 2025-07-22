import java.util.Scanner;

/**
 * This program prompts the user to enter a string, then checks if that the string is not empty, then removes
 * one character from the beginning of the string until everything's gone. It uses a do while loop. 
 * By: Bob Wang
 */
public class StringReducer {

    //Main class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check that the user didn't provide and empty input
        if (input.length() > 0) {
            // Use a do-while loop to reduce and print the string
            do {
                System.out.println(input);       // Print the current string
                input = input.substring(1);      // Remove the first character
            } while (input.length() > 0);        // Continue until the string is empty
        } else {
            // Message printed when the user gives an empty input. 
            System.out.println("Error: You must enter a string with at least one character.");
        }

        scanner.close();
    }
}
