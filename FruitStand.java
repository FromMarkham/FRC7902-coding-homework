import java.util.Scanner;

/**
 * This program simulates a simple virtual stand
 * where users can buy fruits or beverages. They choose by entering their choice into the terminal. 
 * If the user selects fruits, they can enter multiple items separated by spaces.
 * The program then prints the price of each selected item.
 * 
 * This shows how to use basic input handling, control flow, string parsing, and conditionals in Java.
 * 
 * 
 */

public class FruitStand {

    //Main class
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose fruit or beverage
        System.out.println("Welcome to the Fruit & Drink Stand!");
        System.out.println("Would you like to buy fruit or a beverage?");
        System.out.print("Enter 'fruit' or 'beverage': ");
        String category = scanner.nextLine().toLowerCase();

        //This switch statement directs the scanner input to 2 methods depending on what the user entered in the previous part 
        switch (category) {
            case "fruit":
                handleFruitOrder(scanner);
                break;
            case "beverage":
                handleBeverageOrder(scanner);
                break;
            default:
                System.out.println("Sorry, we only sell fruit and beverages.");
        }

        scanner.close();
    }

    public static void handleFruitOrder(Scanner scanner) {
        // Fruit menu
        System.out.println("\nAvailable fruits:");
        System.out.println("Apple - $0.50");
        System.out.println("Banana - $0.30");
        System.out.println("Orange - $0.40");
        System.out.println("Mango - $1.00");
        System.out.println("Grape - $0.80");

        System.out.print("\nEnter the fruits you'd like to buy, separated by commas: ");
        String input = scanner.nextLine().toLowerCase();
        String[] fruits = input.split(",");

        double total = 0.0;

        for (String fruit : fruits) {
            fruit = fruit.trim();
            switch (fruit) {
                case "apple":
                    total += 0.50;
                    break;
                case "banana":
                    total += 0.30;
                    break;
                case "orange":
                    total += 0.40;
                    break;
                case "mango":
                    total += 1.00;
                    break;
                case "grape":
                    total += 0.80;
                    break;
                default:
                    System.out.println("Sorry, we don't have: " + fruit);
            }
        }

        System.out.printf("Your total for fruit is: $%.2f%n", total);
    }

    public static void handleBeverageOrder(Scanner scanner) {
        // Beverage menu
        System.out.println("\nAvailable beverages:");
        System.out.println("Water - $1.00");
        System.out.println("Juice - $2.50");
        System.out.println("Smoothie - $3.75");

        System.out.print("Enter the beverage you'd like to buy: ");
        String beverage = scanner.nextLine().toLowerCase();

        switch (beverage) {
            case "water":
                System.out.println("The price of water is $1.00.");
                break;
            case "juice":
                System.out.println("The price of juice is $2.50.");
                break;
            case "smoothie":
                System.out.println("The price of a smoothie is $3.75.");
                break;
            default:
                System.out.println("Sorry, we don't have that beverage.");
        }
    }
}


