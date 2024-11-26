package oop_practice3;

import java.util.Random;

public class BattleGame {
 public static void main(String[] args) {
     // Create a new warrior character with initial life and magic points.
     ROLE warrior = new ROLE("Warrior", 80, 50);
     Random random = new Random();

     // Create various RedDrugs and BlueDrugs with different sizes.
     RedDrug smallRed = new RedDrug("Small", 50);
     RedDrug mediumRed = new RedDrug("Medium", 80);
     RedDrug largeRed = new RedDrug("Large", 120);

     BlueDrug smallBlue = new BlueDrug("Small", 30);
     BlueDrug mediumBlue = new BlueDrug("Medium", 60);
     BlueDrug largeBlue = new BlueDrug("Large", 100);

     // Continue the loop while the warrior's life is less than 100 or magic is less than 70.
     while (warrior.getLife() < 100 || warrior.getMagic() < 70) {
         int chance = random.nextInt(100); // Generate a random chance for drinking the drug

         // If warrior's life is less than 100, drink a RedDrug
         if (warrior.getLife() < 100) {
             if (chance < 10) {
                 warrior.Drink(largeRed); // Drink large RedDrug
             } else if (chance < 40) {
                 warrior.Drink(mediumRed); // Drink medium RedDrug
             } else if (chance < 80) {
                 warrior.Drink(smallRed); // Drink small RedDrug
             } else {
                 System.out.println(warrior.getName() + " did not drink anything this time.");
             }
         }

         // If warrior's magic is less than 70, drink a BlueDrug
         if (warrior.getMagic() < 70) {
             chance = random.nextInt(100); // Generate a new random chance for BlueDrug

             if (chance < 10) {
                 warrior.Drink(largeBlue); // Drink large BlueDrug
             } else if (chance < 40) {
                 warrior.Drink(mediumBlue); // Drink medium BlueDrug
             } else if (chance < 80) {
                 warrior.Drink(smallBlue); // Drink small BlueDrug
             } else {
                 System.out.println(warrior.getName() + " did not drink anything this time.");
             }
         }

         // Print the current status after each drink
         System.out.println("Current Status: " + warrior);
     }

     // Print the final status once the conditions are met
     System.out.println("\nFinal Status: " + warrior);
 }
}

