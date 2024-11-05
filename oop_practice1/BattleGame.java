package oop_practice1;

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
            // Warrior attacks Witch
            Warrior selectedWarrior = warriors[random.nextInt(warriors.length)];
            Witch selectedWitch = witches[random.nextInt(witches.length)];

            selectedWarrior.NewMoon(selectedWitch);
            if (selectedWitch.getLife() <= 0) break;

            // Witch attacks Warrior
            selectedWitch = witches[random.nextInt(witches.length)];
            selectedWarrior = warriors[random.nextInt(warriors.length)];

            selectedWitch.SmallFire(selectedWarrior);
            if (selectedWarrior.getLife() <= 0) break;
        }
    }
}




















