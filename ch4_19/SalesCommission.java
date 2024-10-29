package ch4_19; 

import java.util.Scanner; 

public class SalesCommission { 

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the keyboard
        
        double BASE_MONEY = 200.00;  // Define a constant for the base salary of the salesperson
        double COMMISSION_RATE = 0.09; // Define a constant for the commission rate (9%)
        
        double[] itemPrices = {239.99, 129.75, 99.95, 350.89}; // Array to store the prices of items
        
        double grossSales = 0.0; // Variable to accumulate the gross sales
        int itemNumber = 0; // Variable to store the item number input by the user
        
        // Prompt the user to enter the item number sold
        System.out.println("Enter the item number sold (0 to finish):");
        
        // Start an infinite loop to read user input
        while (true) {
            itemNumber = input.nextInt(); // Read the item number from user input
            
            if (itemNumber == 0) { // Check if the input is 0
                break; // Exit the loop if the user inputs 0
            }
            
            // Check if the item number is valid (between 1 and 4)
            if (itemNumber >= 1 && itemNumber <= 4) {
                grossSales += itemPrices[itemNumber - 1]; // Add the price of the sold item to grossSales
            } else {
                // Print an error message for invalid item numbers
                System.out.println("Invalid item number. Please enter a number between 1 and 4.");
            }
        }
        
        // Calculate total earnings: base salary + commission from gross sales
        double earnings = BASE_MONEY + (grossSales * COMMISSION_RATE);
        
        // Print the total earnings, formatted to two decimal places
        System.out.printf("Total earnings: $%.2f%n", earnings);
        
        input.close(); 
    }
}

