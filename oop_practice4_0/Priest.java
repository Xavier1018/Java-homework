package oop_practice4_0;

//Priest class extends ROLE
public class Priest extends ROLE {

 // Default constructor
 public Priest() {
     super("Priest", 340, 160); // Default life = 340, magic = 160
 }

 // Constructor with custom name
 public Priest(String name) {
     super(name, 340, 160); // Default life = 340, magic = 160
 }

 // Method for attacking with Dark
 public void Dark(ROLE target) {
     if (magic >= 20) {
         magic -= 20; // Deduct 20 magic for each attack
         if (target instanceof Warrior) {
             target.life -= 30; // Attack a warrior
         } else if (target instanceof Witch) {
             target.life -= 50; // Attack a witch
         } else if (target instanceof Priest) {
             target.life -= 40; // Attack a priest
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
