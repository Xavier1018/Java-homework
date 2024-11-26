package oop_practice4_0;

import java.util.Random;

public class BattleGame {
    public static void main(String[] args) {
        // Create characters using default constructors
        Warrior warrior = new Warrior();
        Witch witch = new Witch();
        Priest priest = new Priest();

        Random random = new Random();

        // Simulate the battle
        while (warrior.getLife() > 0 && witch.getLife() > 0 && priest.getLife() > 0) {
            // Warrior attacks Witch
            int chance = random.nextInt(100);
            if (warrior.getMagic() >= 10 && chance < 50) {
                warrior.NewMoon(witch); // Warrior attacks witch
            }

            // Witch attacks Priest
            chance = random.nextInt(100);
            if (witch.getMagic() >= 25 && chance < 50) {
                witch.SmallFire(priest); // Witch attacks priest
            }

            // Priest attacks Warrior
            chance = random.nextInt(100);
            if (priest.getMagic() >= 20 && chance < 50) {
                priest.Dark(warrior); // Priest attacks warrior
            }

            // Automatic life and magic recovery
            warrior.recoverLife();
            witch.recoverMagic();

            // Print the current status of each character
            System.out.println("Current Status: ");
            System.out.println(warrior);
            System.out.println(witch);
            System.out.println(priest);
            System.out.println();

            // Check if all characters are dead
            if (warrior.getLife() <= 0 || witch.getLife() <= 0 || priest.getLife() <= 0) {
                break;
            }
        }

        // Print the final status after the battle
        System.out.println("Final Statuses: ");
        System.out.println(warrior);
        System.out.println(witch);
        System.out.println(priest);
    }
}

