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

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0.0;

        // Fruit prices variables
        final double applePrice = 1.00;
        final double bananaPrice = 0.75;
        final double orangePrice = 0.80;
        final double grapePrice = 2.00;
        final double kiwiPrice = 1.50;

        // Beverage prices variables
        final double juicePrice = 2.50;
        final double waterPrice = 1.00;
        final double sodaPrice = 1.75;

        // List of product prices to display on startup
        System.out.println("Welcome to the Fruit Stand!");
        System.out.println("Here is our price list:");
        System.out.println("Fruits:");
        System.out.printf(" - Apple: $%.2f%n", applePrice);
        System.out.printf(" - Banana: $%.2f%n", bananaPrice);
        System.out.printf(" - Orange: $%.2f%n", orangePrice);
        System.out.printf(" - Grape: $%.2f%n", grapePrice);
        System.out.printf(" - Kiwi: $%.2f%n", kiwiPrice);
        System.out.println("Beverages:");
        System.out.printf(" - Juice: $%.2f%n", juicePrice);
        System.out.printf(" - Water: $%.2f%n", waterPrice);
        System.out.printf(" - Soda: $%.2f%n", sodaPrice);
        System.out.println();

        // Prompt user for fruit or beverage selection
        System.out.print("Would you like fruits or beverages? ");
        String category = scanner.nextLine().toLowerCase();

        if (category.equals("fruits")) {
            // Ask the user for multiple fruit items
            System.out.print("Enter the fruits you want (separated by spaces): ");
            String[] fruits = scanner.nextLine().toLowerCase().split(" ");
            
           // Calculates the total price of their order if they ordered fruits, and also prints the prices along with the beverage fruits
            for (String fruit : fruits) {
                switch (fruit) {
                    case "apple":
                        System.out.printf("Apple - $%.2f%n", applePrice);
                        totalPrice += applePrice;
                        break;
                    case "banana":
                        System.out.printf("Banana - $%.2f%n", bananaPrice);
                        totalPrice += bananaPrice;
                        break;
                    case "orange":
                        System.out.printf("Orange - $%.2f%n", orangePrice);
                        totalPrice += orangePrice;
                        break;
                    case "grape":
                        System.out.printf("Grape - $%.2f%n", grapePrice);
                        totalPrice += grapePrice;
                        break;
                    case "kiwi":
                        System.out.printf("Kiwi - $%.2f%n", kiwiPrice);
                        totalPrice += kiwiPrice;
                        break;
                    default:
                        System.out.println(fruit + " - Not available.");
                        break;
                }
            }

        //If the user chose beverage
        } else if (category.equals("beverages")) {
            
            //Ask the user what beverages they want
            //Unlike previously, they can now select multiple beverages
            System.out.print("Enter the beverages you want (separated by spaces): ");
            String[] beverages = scanner.nextLine().toLowerCase().split(" ");
            
            //Calculates the total price of their order if they ordered beverages, and also prints the prices along with the beverage names
            for (String beverage : beverages) {
                switch (beverage) {
                    case "juice":
                        System.out.printf("Juice - $%.2f%n", juicePrice);
                        totalPrice += juicePrice;
                        break;
                    case "water":
                        System.out.printf("Water - $%.2f%n", waterPrice);
                        totalPrice += waterPrice;
                        break;
                    case "soda":
                        System.out.printf("Soda - $%.2f%n", sodaPrice);
                        totalPrice += sodaPrice;
                        break;
                    default:
                        System.out.println(beverage + " - Not available.");
                        break;
                }
            }

       
        } else {
        //Message it prints if the user didn't choose fruit or beverage, or entered incorrectly
            System.out.println("Invalid selection. Please choose 'fruits' or 'beverages'.");
        }

        // Display total if any valid items were added
        if (totalPrice > 0) {
            System.out.printf("Total: $%.2f%n", totalPrice);
        }

        scanner.close(); //Close the scanner
    }
}

