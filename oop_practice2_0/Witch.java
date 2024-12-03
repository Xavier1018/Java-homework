package oop_practice2_0;

//The Witch class extends the ROLE class and represents a witch character in the game
class Witch extends ROLE {

 // Constructor that sets the witch's name and initializes life and magic points
 public Witch(String Name) {
     super(Name, 280, 200);  // Witches start with 280 life and 200 magic points
 }

 // Default constructor that calls the ROLE constructor
 public Witch() {
     super();
 }

 // Method that performs the Small Fire attack on a target character
 public void SmallFire(ROLE target) {
     if (getMagic() < 25) {
         System.out.println(getName() + " does not have enough magic to cast Small Fire.");
         return;
     }
     reduceMagic(25);  // Deduct 25 magic points for the attack

     // Deal different damage depending on the type of the target (Warrior or Witch)
     int damage = (target instanceof Warrior) ? 40 : 60;
     target.reduceLife(damage);  // Reduce target's life points

     System.out.println(getName() + " attacks " + target.getName() + " with Small Fire.");

     // Check if the target has died
     if (target.getLife() <= 0) {
         System.out.println(target.getName() + " has died.");
     }
 }

 // Override the toString method to include the character type (Witch) and their details
 @Override
 public String toString() {
     return "Witch -> " + super.toString();
 }
}

