package ch3_13;

public class Car {
    // Instance variables
    private String model;
    private String year;
    private double price;

    // Constructor to initialize the variables
    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    // Getter and setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter for year
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // Getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Method to apply discount
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage < 100) {
            price -= price * (discountPercentage / 100);
        }
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create two Car objects
        Car car1 = new Car("Toyota Corolla", "2022", 20000);
        Car car2 = new Car("Honda Civic", "2021", 22000);

        // Display each Car's price before applying discount
        System.out.println("Car 1 price before discount: $" + car1.getPrice());
        System.out.println("Car 2 price before discount: $" + car2.getPrice());

        // Apply discounts
        car1.applyDiscount(5);  // 5% discount on car1
        car2.applyDiscount(7);  // 7% discount on car2

        // Display each Car's price after applying discount
        System.out.println("Car 1 price after 5% discount: $" + car1.getPrice());
        System.out.println("Car 2 price after 7% discount: $" + car2.getPrice());
    }
}

