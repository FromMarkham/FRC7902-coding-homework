import java.util.Scanner;

public class StringReducer {
/**
 * This program prompts the user to enter a string, then checks if that the string is not empty, then removes
 * one character from the beginning of the string until everything's gone. It uses a do while loop. 
 * By: Bob Wang
 */
 
    //Main class 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
            // Prompt the user for a string input
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            
             // Use a do-while loop to reduce and print the string
             do {
                try {
                System.out.println(input);
                input = input.substring(1);                    
                }
                
                //Catch block if the user gave an empty input
                catch(Exception e){
                    
                // Message printed when the user gives an empty input. 
                System.out.println("Error: " + e.getMessage());
                }
            } while (input.length() > 0);
            
            //closes the scanner 
            scanner.close();
    }
}
