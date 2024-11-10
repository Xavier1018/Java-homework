package ch3_13;

public class Car {
    private String model;
    private String year;
    private double price;

    // Constructor
    public Car(String model, String year, double price) {
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0; // Set to 0 if the price is invalid
        }
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Method to apply discount
    public void discount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage < 100) {
            price -= price * (discountPercentage / 100);
        }
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "2000", 20000);
        Car c2 = new Car("Benz", "1999", 25000);

       System.out.println("Car 1's original price: $" +c1.getPrice());
       System.out.println("Car 2's original price: $" +c2.getPrice());;

        // Apply discounts
        c1.discount(5);
        c2.discount(7);

       System.out.println("Car 1's price after discount: $" +c1.getPrice());
       System.out.println("Car 2's price after disocunt: $" +c2.getPrice());
    }
}
