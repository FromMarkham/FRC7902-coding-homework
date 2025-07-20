import java.util.Scanner;

/**
 * This is a virtual fruit stand where users can choose
 * either fruits (multiple items allowed) or only 1 beverage. 
 * Then it displays the total price of their order. 
 * It uses user inputs, string parsing, conditional logic, loops, and price calculations
 * It also checks for any invalid inputs and displays error messages if the user does so. 
 *
 *By: Bob Wang
 */
public class FruitStand {

    //Main class 
    public static void main(String[] args) {
        
        //Scanner input
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0; // Keeps track of the total cost

        // Prompt user for fruit or beverage selection
        System.out.print("Would you like fruit or a beverage? ");
        String category = scanner.nextLine().toLowerCase();

        //If the user chose fruit
        if (category.equals("fruit")) {
            
            // Ask the user for multiple fruit items
            System.out.print("Enter the fruits you want (separated by spaces): ");
            String fruitLine = scanner.nextLine().toLowerCase();
            String[] fruits = fruitLine.split(" ");

            // Loop through each fruit and add price to total
            for (String fruit : fruits) {
                switch (fruit) {
                    case "apple":
                        System.out.println("Apple - $1.00");
                        totalPrice += 1.00;
                        break;
                    case "banana":
                        System.out.println("Banana - $0.75");
                        totalPrice += 0.75;
                        break;
                    case "orange":
                        System.out.println("Orange - $0.80");
                        totalPrice += 0.80;
                        break;
                    case "grape":
                        System.out.println("Grape - $2.00");
                        totalPrice += 2.00;
                        break;
                    case "kiwi":
                        System.out.println("Kiwi - $1.50");
                        totalPrice += 1.50;
                        break;
                    default:
                        System.out.println(fruit + " - Not available.");
                        break;
                }
            }

        //If the user chose beverage    
        } else if (category.equals("beverage")) {
            
            //Asks for a single beverage choice
            System.out.print("Enter your beverage (juice, water, soda): ");
            String beverage = scanner.nextLine().toLowerCase();

            //Displays certain messages and calculates the price depending on which beverage the user chose. 
            switch (beverage) {
                case "juice":
                    System.out.println("Juice - $2.50");
                    totalPrice += 2.50;
                    break;
                case "water":
                    System.out.println("Water - $1.00");
                    totalPrice += 1.00;
                    break;
                case "soda":
                    System.out.println("Soda - $1.75");
                    totalPrice += 1.75;
                    break;
                default:
                    System.out.println("Sorry, we don't have that beverage.");
                    break;
            }

        } else {
            //Message it prints if the user didn't choose fruit or beverage, or entered incorrectly
            System.out.println("Invalid selection. Please choose 'fruit' or 'beverage'.");
        }

        // Display the total price if valid items were selected
        if (totalPrice > 0) {
            System.out.printf("Total: $%.2f%n", totalPrice);
        }

        scanner.close(); // Close the Scanner 
    }
}

