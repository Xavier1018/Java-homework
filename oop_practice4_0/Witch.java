package oop_practice4_0;

//Witch class extends ROLE and implements MagicRecoverable for magic recovery
public class Witch extends ROLE implements MagicRecoverable {

 // Default constructor
 public Witch() {
     super("Witch", 280, 200); // Default life = 280, magic = 200
 }

 // Constructor with custom name
 public Witch(String name) {
     super(name, 280, 200); // Default life = 280, magic = 200
 }

 // Implementing the recoverMagic method from MagicRecoverable interface
 @Override
 public double recoverMagic() {
     magic += MAGICRATE; // Recover magic
     if (magic > 200) {  // Ensure magic doesn't exceed maximum value
         magic = 200;
     }
     return magic;
 }

 // Method for attacking with SmallFire
 public void SmallFire(ROLE target) {
     if (magic >= 25) {
         magic -= 25; // Deduct 25 magic for each attack
         if (target instanceof Warrior) {
             target.life -= 40; // Attack a warrior
         } else if (target instanceof Witch) {
             target.life -= 60; // Attack a witch
         } else if (target instanceof Priest) {
             target.life -= 50; // Attack a priest
         }

         // Check if the target has died
         if (target.getLife() <= 0) {
             System.out.println(target.getName() + " has died.");
         }
     } else {
         System.out.println("Not enough magic for spell.");
     }
 }
}

