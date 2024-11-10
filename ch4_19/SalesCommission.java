package ch4_19;

import java.util.Scanner;

public class SalesCommission {
    private final Scanner input = new Scanner(System.in);
    private final int BASE_MONEY = 200;
    private final double COMMISSION_RATE = 0.09;

    public void calculate() {
        double grossSales = 0;
        int itemNumber;
        double[] item = {239.99, 129.75, 99.95, 350.89};  // Corrected item prices

        System.out.println("Enter the item number sold (1-4) or 0 to finish:");
        
        while (true) {
            itemNumber = input.nextInt();
            if (itemNumber == 0) {
                break;
            } else if (itemNumber >= 1 && itemNumber <= 4) {
                grossSales += item[itemNumber - 1];  // Add the price of the selected item
            } else {
                System.out.println("Invalid number. Item number must be between 1 and 4.");
            }
        }

        double earnings = BASE_MONEY + grossSales * COMMISSION_RATE;
        System.out.printf("Total earnings: $%.2f%n", earnings);
        
        input.close();
    }

    // Main method to run the application
    public static void main(String[] args) {
        SalesCommission calculator = new SalesCommission();
        calculator.calculate();
    }
}
