package ch7_28;
import java.util.Random;

public class TortoiseAndHareRace {
    private static final int FINISHLINE = 70; // Define finish line position
    private static final Random random = new Random(); // Random object for generating random numbers

    public static void main(String[] args) {
        int tortoise = 1; // Initial position of the tortoise
        int hare = 1; // Initial position of the hare

        // Start the race
        while (tortoise < FINISHLINE && hare < FINISHLINE) {
            tortoise = moveTortoise(tortoise); // Move tortoise
            hare = moveHare(hare); // Move hare
            displayCourse(tortoise, hare); // Display race progress

            // Check for winner or tie
            if (tortoise >= FINISHLINE && hare >= FINISHLINE) {
                System.out.println("It's a tie!");
                break;
            } else if (tortoise >= FINISHLINE) {
                System.out.println("TORTOISE WINS!!! YAH!!!");
                break;
            } else if (hare >= FINISHLINE) {
                System.out.println("HARE WINS. Yuch.");
                break;
            }
        }
    }

    // Function to move the tortoise
    public static int moveTortoise(int tortoise) {
        int move = random.nextInt(100) + 1; // Generate random number between 1 and 100
        if (move <= 50) {
            tortoise += 3; // Fast plod
        } else if (move <= 70) {
            tortoise -= 6; // Slip
        } else {
            tortoise += 1; // Slow plod
        }
        return Math.max(tortoise, 1); // Ensure tortoise doesn't go below 1
    }

    // Function to move the hare
    public static int moveHare(int hare) {
        int move = random.nextInt(100) + 1; // Generate random number between 1 and 100
        if (move <= 20) {
            hare += 0; // Hare sleeps
        } else if (move <= 40) {
            hare += 9; // Big hop
        } else if (move <= 50) {
            hare -= 12; // Big slip
        } else if (move <= 80) {
            hare += 1; // Small hop
        } else {
            hare -= 2; // Small slip
        }
        return Math.max(hare, 1); // Ensure hare doesn't go below 1
    }

    // Display the current course status
    public static void displayCourse(int tortoise, int hare) {
        for (int i = 1; i <= FINISHLINE; i++) {
            if (i == tortoise && i == hare) {
                System.out.print("OUCH!!!"); // Collision point
            } else if (i == tortoise) {
                System.out.print("T"); // Display tortoise
            } else if (i == hare) {
                System.out.print("H"); // Display hare
            } else {
                System.out.print("-"); // Empty space
            }
        }
        System.out.println(); // Move to the next line after the race display
    }
}
