package oop_practice4;

//Warrior class extends ROLE and has an attack method NewMoon
class Warrior extends ROLE {
// Constructor initializing Warrior's specific attributes
public Warrior(String name) {
   super(name, 400, 100); // Initial life: 400, Initial magic: 100
}
public Warrior() {
   super("Warrior", 400, 100); 
}
// Method to perform the NewMoon attack
public void NewMoon(ROLE target) {
   // Check if there is enough magic
   if (magic < 10) {
       System.out.println(name + " does not have enough magic to attack.");
       return;
   }

   // Deduct magic points
   magic -= 10;

   // Attack logic based on the target type
   if (target instanceof Warrior) {
       target.life -= 25; // Deduct 25 life points if target is a Warrior
   } else if (target instanceof Witch) {
       target.life -= 40; // Deduct 40 life points if target is a Witch
   } else if (target instanceof Priest) {
       target.life -= 30; // Deduct 30 life points if target is a Priest
   }

   // Check if the target is dead
   if (target.life <= 0) {
       System.out.println(target.getName() + " has died.");
   }
}
}
