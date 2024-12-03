package oop_practice4;

class Witch extends ROLE {
    // Constructor initializing Witch's specific attributes
    public Witch(String name) {
        super(name, 280, 200); // Initial life: 280, Initial magic: 200
    }

    // Default constructor for Witch
    public Witch() {
        super("Witch", 280, 200); 
    }

    // Method to perform the SmallFire attack on a target (can be Warrior, Witch, or Priest)
    public void SmallFire(ROLE target) {
        // Check if the Witch is alive before attacking
        if (!this.isAlive()) {
            System.out.println(this.getName() + " is dead and cannot attack.");
            return;
        }

        // Check if there is enough magic for the attack
        if (magic < 25) {
            System.out.println(name + " does not have enough magic to cast SmallFire.");
            return;
        }

        // Deduct magic points
        magic -= 25;

        // Attack logic based on the target's type
        if (target instanceof Warrior) {
            target.life -= 40; // Deduct 40 life points if the target is a Warrior
        } else if (target instanceof Witch) {
            target.life -= 60; // Deduct 60 life points if the target is a Witch
        } else if (target instanceof Priest) {
            target.life -= 50; // Deduct 50 life points if the target is a Priest
        }

        // If the target's life is less than or equal to 0, print death message
        if (target.life <= 0) {
            System.out.println(target.getName() + " has died.");
        }
    }
}
