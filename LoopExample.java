/**
 * This LoopExample class uses a while loop. 
 * The loop starts from a certain number and increments it by some amount
 * until it reaches or exceeds a certain point.
 * 
 * It uses an integer that starts at 5 and increases by 3 on each loop iteration
 * until it is no longer less than 105.
 * 
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
