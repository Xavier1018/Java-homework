package oop_practice2_0;

//The BattleGame class simulates a battle between characters (Warriors and Witches)
import java.util.Random;

public class BattleGame {

 public static void main(String[] args) {

     // Create an array of characters (Warriors and Witches) with different life and magic values
     ROLE[] characters = {
         new Warrior("Warrior1"),
         new Warrior("Warrior2"),
         new Warrior("Warrior3"),
         new Witch("Witch1"),
         new Witch("Witch2"),
         new Witch("Witch3")
     };

     Random random = new Random();

     // Infinite loop simulating continuous battles until one character is defeated
     while (true) {
         int idx1, idx2;

         // Select the first character (attacker) that can attack
         do {
             idx1 = random.nextInt(characters.length);
         } while (!canAttack(characters[idx1])); 

         // Select the second character (target) for the attack
         do {
             idx2 = random.nextInt(characters.length);
         } while (idx1 == idx2);  // Make sure the attacker and target are different

         ROLE attacker = characters[idx1];
         ROLE target = characters[idx2];

         // Execute the attack based on the type of character (Warrior or Witch)
         if (attacker instanceof Warrior) {
             ((Warrior) attacker).NewMoon(target);
         } else if (attacker instanceof Witch) {
             ((Witch) attacker).SmallFire(target);
         }

         // Print the target's status after the attack
         System.out.println(target.getName() + " Status: life = " + target.getLife() + ", Magic = " + target.getMagic());

         // Check if the target has been defeated (life points == 0)
         if (target.getLife() == 0) {
             System.out.println(target.getName() + " has been defeated by " + attacker.getName() + ".");
             break;  // End the game once a character is defeated
         }
     }
     System.out.println("\nGame Over");
 }

 // Method to check if a character can attack based on their magic points
 private static boolean canAttack(ROLE character) {
     if (character instanceof Warrior) {
         return character.getMagic() >= 10;  // Warriors need at least 10 magic points to attack
     } else if (character instanceof Witch) {
         return character.getMagic() >= 25;  // Witches need at least 25 magic points to attack
     }
     return false;
 }
}
