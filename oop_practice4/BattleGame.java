package oop_practice4;

public class BattleGame {
    public static void main(String[] args) {
        // Create instances of Warrior, Witch, and Priest
        Warrior warrior = new Warrior("Warrior");
        Witch witch = new Witch("Witch");
        Priest priest = new Priest("Priest");

        // Simulate attacks
        warrior.NewMoon(witch); // Warrior attacks Witch
        witch.SmallFire(warrior); // Witch attacks Warrior
        priest.Dark(witch); // Priest attacks Witch

        // Print the final statuses of the characters
        System.out.println("\nFinal Statuses:");
        System.out.println(warrior); // Display Warrior's status
        System.out.println(witch); // Display Witch's status
        System.out.println(priest); // Display Priest's status
    }
}
