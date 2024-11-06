package ch3_14;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock1 = new Clock(15, 30, 45);
        System.out.println("Clock 1 initial time: " + clock1.displayTime());

        clock1.setHour(25);
        clock1.setMinute(60);
        clock1.setSecond(67);
        System.out.println("Clock 1 after setting invalid time: " + clock1.displayTime());

        Clock clock2 = new Clock(25, 70, 80);
        System.out.println("Clock 2 initial time: " + clock2.displayTime());

        clock1.setHour(10);
        clock1.setMinute(20);
        clock1.setSecond(30);
        System.out.println("Clock 1 after setting valid time: " + clock1.displayTime());
    }
}
