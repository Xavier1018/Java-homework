package ch5_16;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        // Read 5 numbers between 1 and 30
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int number = scanner.nextInt();
            
            // Validate input
            while (number < 1 || number > 30) {
                System.out.print("Invalid input. Please enter a number between 1 and 30: ");
                number = scanner.nextInt();
            }
            
            numbers[i] = number;
        }
        
        // Display the bar chart
        System.out.println("\nBar Chart:");
        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after printing asterisks for a number
        }
        
        scanner.close();
    }
}
