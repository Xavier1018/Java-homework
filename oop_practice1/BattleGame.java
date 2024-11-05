package oop_practice1;

public class BattleGame {
    public static void main(String[] args) {
        // Create arrays of 3 Warriors and 3 Witches
        Warrior[] warriors = new Warrior[3];
        Witch[] witches = new Witch[3];

        // Initialize Warriors and Witches
        warriors[0] = new Warrior("Warrior1");
        warriors[1] = new Warrior("Warrior2");
        warriors[2] = new Warrior("Warrior3");

        witches[0] = new Witch("Witch1");
        witches[1] = new Witch("Witch2");
        witches[2] = new Witch("Witch3");

        // Repeat the battle loop until a character dies
        while (true) {
            // Randomly select a Warrior and a Witch
            int warriorIndex = (int) (Math.random() * warriors.length);
            Warrior selectedWarrior = warriors[warriorIndex];

            int witchIndex = (int) (Math.random() * witches.length);
            Witch selectedWitch = witches[witchIndex];

            // Warrior attacks Witch
            selectedWarrior.NewMoon(selectedWitch);
            if (selectedWitch.getLife() <= 0) {
                System.out.println(selectedWitch.getName() + " has died!");
                break;  // Exit the loop if the Witch dies
            }

            // Randomly select a new Witch and Warrior
            witchIndex = (int) (Math.random() * witches.length);
            selectedWitch = witches[witchIndex];

            warriorIndex = (int) (Math.random() * warriors.length);
            selectedWarrior = warriors[warriorIndex];

            // Witch attacks Warrior
            selectedWitch.SmallFire(selectedWarrior);
            if (selectedWarrior.getLife() <= 0) {
                System.out.println(selectedWarrior.getName() + " has died!");
                break;  // Exit the loop if the Warrior dies
            }
        }
    }
}






