package oop_practice4_0;

//Warrior class extends ROLE and implements LifeRecoverable for life recovery
public class Warrior extends ROLE implements LifeRecoverable {
 
 // Default constructor
 public Warrior() {
     super("Warrior", 400, 100); // Default life = 400, magic = 100
 }

 // Constructor with custom name
 public Warrior(String name) {
     super(name, 400, 100); // Default life = 400, magic = 100
 }

 // Implementing the recoverLife method from LifeRecoverable interface
 @Override
 public double recoverLife() {
     life += LIFERATE; // Recover life
     if (life > 400) {  // Ensure life doesn't exceed maximum value
         life = 400;
     }
     return life;
 }

 // Method for attacking with NewMoon
 public void NewMoon(ROLE target) {
     if (magic >= 10) {
         magic -= 10; // Deduct 10 magic for each attack
         if (target instanceof Warrior) {
             target.life -= 25; // Attack a warrior
         } else if (target instanceof Witch) {
             target.life -= 40; // Attack a witch
         } else if (target instanceof Priest) {
             target.life -= 30; // Attack a priest
         }

         // Check if the target has died
         if (target.getLife() <= 0) {
             System.out.println(target.getName() + " has died.");
         }
     } else {
         System.out.println("Not enough magic for attack.");
     }
 }
}


