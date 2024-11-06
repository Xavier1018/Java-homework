package ch3_14;

public class Clock {
    // Instance variables to store hour, minute, and second values
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize hour, minute, and second
    // The constructor calls setter methods to validate the input values
    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // Setter method for the hour
    // If the hour is not between 0 and 23 (inclusive), it sets hour to 0
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            this.hour = 0; // Invalid values are set to 0
        }
    }

    // Setter method for the minute
    // If the minute is not between 0 and 59, it sets minute to 0
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            this.minute = 0; // Invalid values are set to 0
        }
    }

    // Setter method for the second
    // If the second is not between 0 and 59, it sets second to 0
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            this.second = 0; // Invalid values are set to 0
        }
    }

    // Getter method for the hour
    public int getHour() {
        return hour;
    }

    // Getter method for the minute
    public int getMinute() {
        return minute;
    }

    // Getter method for the second
    public int getSecond() {
        return second;
    }

    // Method to display the time in "hh:mm:ss" format
    public String displayTime() {
        // String.format is used to ensure two digits for each time unit
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


    public static void main(String[] args) {
        // Create a Clock object with valid time values
        Clock clock1 = new Clock(15, 30, 45);
        System.out.println("Clock 1 Initial Time: " + clock1.displayTime()); // Expected output: 15:30:45

        // Modify the time to invalid values
        clock1.setHour(25); // Invalid hour, sets it to 0
        clock1.setMinute(70); // Invalid minute, sets it to 0
        clock1.setSecond(61); // Invalid second, sets it to 0

        // Display the updated time, which should show "00:00:00" due to invalid values
        System.out.println("Clock 1 After Setting Invalid Values: " + clock1.displayTime());

        // Create another Clock object with invalid values for hour, minute, and second
        Clock clock2 = new Clock(25, 70, 80);
        // Display the time for clock2, which should show "00:00:00" since all values were invalid
        System.out.println("Clock 2 Initial Time (incorrect values): " + clock2.displayTime());

        // Set clock2 to valid time values
        clock2.setHour(10);
        clock2.setMinute(45);
        clock2.setSecond(50);
        // Display the updated time for clock2
        System.out.println("Clock 2 After Setting Valid Values: " + clock2.displayTime()); // Expected output: 10:45:50
    }
}
