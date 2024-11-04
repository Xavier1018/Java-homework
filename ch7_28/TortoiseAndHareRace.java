package ch7_28;
import java.util.Random;

public class TortoiseAndHareRace {
    private static final int FINISH_LINE = 70; // Define the finish line position
    private static final Random random = new Random(); // Create a Random object for random number generation

    public static void main(String[] args) {
        int tortoisePosition = 1; // Initial position of the tortoise
        int harePosition = 1; // Initial position of the hare

        System.out.println("BANG!!! AND THEY'RE OFF!!!!");

        // Continue the race while either the tortoise or the hare hasn't reached the finish line
        while (tortoisePosition < FINISH_LINE && harePosition < FINISH_LINE) {
            tortoisePosition = moveTortoise(tortoisePosition); // Update the tortoise's position
            harePosition = moveHare(harePosition); // Update the hare's position
            displayCourse(tortoisePosition, harePosition); // Display the race progress

            // Check the race results
            if (tortoisePosition >= FINISH_LINE && harePosition >= FINISH_LINE) {
                System.out.println("It's a tie");
                break;
            } else if (tortoisePosition >= FINISH_LINE) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePosition >= FINISH_LINE) {
                System.out.println("HARE WINS. YUCH!");
                break;
            }
        }
    }

    // Calculate the tortoise's movement
    private static int moveTortoise(int position) {
        int move = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        if (move <= 50) {
            position += 3; // Fast plod
        } else if (move <= 70) {
            position -= 6; // Slip
        } else {
            position += 1; // Slow plod
        }
        return Math.max(1, position); // Ensure position is not below 1
    }

    // Calculate the hare's movement
    private static int moveHare(int position) {
        int move = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        if (move <= 20) {
            // The hare sleeps and doesn't move
        } else if (move <= 40) {
            position += 9; // Big hop
        } else if (move <= 50) {
            position -= 12; // Big slip
        } else if (move <= 80) {
            position += 1; // Small hop
        } else {
            position -= 2; // Small slip
        }
        return Math.max(1, position); // Ensure position is not below 1
    }

    // Display the race progress
    private static void displayCourse(int tortoisePosition, int harePosition) {
        for (int i = 1; i <= FINISH_LINE; i++) {
            if (i == tortoisePosition && i == harePosition) {
                System.out.print("OUCH!!!"); // When the tortoise and hare reach the same position
                i += 5; // Skip extra positions to display "OUCH!!!"
            } else if (i == tortoisePosition) {
                System.out.print("T"); // Display the tortoise's position
            } else if (i == harePosition) {
                System.out.print("H"); // Display the hare's position
            } else {
                System.out.print("-"); // Display empty positions
            }
        }
        System.out.println(); // Move to the next line
    }
}
