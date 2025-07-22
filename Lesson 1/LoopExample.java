/**
 * 
 * This program starts from 5 and increments it by 3
 * until it exceeds 105 using a while loop.
 *
 * By: Bob Wang 
 */
public class LoopExample {

    //Main class 

    public static void main(String[] args) {
        int num = 5; // Starting value

        // Loop until the number is at least 105
        while (num < 105) {
            System.out.println(num); // Print current value
            num += 3;                // Increment by 3
        }
    }
}
