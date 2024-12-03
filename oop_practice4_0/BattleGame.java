package oop_practice4_0;
public class BattleGame {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior");
        Witch witch = new Witch("Witch");
        Priest priest = new Priest("Priest");

        // Example of polymorphism: calling the attack methods
        warrior.attack(witch);   // Warrior attacks Witch
        witch.attack(priest);    // Witch attacks Priest
        priest.attack(warrior);  // Priest attacks Warrior

        // Print final statuses
        System.out.println("\nFinal Statuses:");
        System.out.println(warrior.name + " - Life: " + warrior.life + ", Magic: " + warrior.magic);
        System.out.println(witch.name + " - Life: " + witch.life + ", Magic: " + witch.magic);
        System.out.println(priest.name + " - Life: " + priest.life + ", Magic: " + priest.magic);
    }
}
