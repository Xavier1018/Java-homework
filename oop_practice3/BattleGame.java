package oop_practice3;

import java.util.Random;

public class BattleGame {
    public static void main(String[] args) {
        Warrior[] warriors = {
            new Warrior("Warrior1"),
            new Warrior("Warrior2"),
            new Warrior("Warrior3")
        };

        Witch[] witches = {
            new Witch("Witch1"),
            new Witch("Witch2"),
            new Witch("Witch3")
        };

        Random random = new Random();

        while (true) {
            // Randomly select a Warrior and a Witch
            Warrior selectedWarrior = warriors[random.nextInt(warriors.length)];
            Witch selectedWitch = witches[random.nextInt(witches.length)];

            // Warrior attacks
            selectedWarrior.NewMoon(selectedWitch);
            System.out.println(selectedWitch.getName() + " Status: Life = " + selectedWitch.getLife() + ", Magic = " + selectedWitch.getMagic());

            // Witch drinks drugs if needed
            selectedWitch.autoDrink();

            // Check if Witch is defeated
            if (selectedWitch.getLife() == 0) {
                System.out.println(selectedWitch.getName() + " has been defeated.");
                break;
            }

            // Witch attacks
            selectedWitch.SmallFire(selectedWarrior);
            System.out.println(selectedWarrior.getName() + " Status: Life = " + selectedWarrior.getLife() + ", Magic = " + selectedWarrior.getMagic());

            // Warrior drinks drugs if needed
            selectedWarrior.autoDrink();

            // Check if Warrior is defeated
            if (selectedWarrior.getLife() == 0) {
                System.out.println(selectedWarrior.getName() + " has been defeated.");
                break;
            }
        }

        System.out.println("\nGame Over!");
    }
}


