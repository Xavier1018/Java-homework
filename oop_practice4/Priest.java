package oop_practice4;

class Priest extends ROLE {
    // Constructor initializing Priest's specific attributes
    public Priest(String name) {
        super(name, 340, 160); // Initial life: 340, Initial magic: 160
    }

    // Default constructor for Priest
    public Priest() {
        super("Priest", 340, 160); 
    }

    // Method to perform the Dark attack on a target (can be Warrior, Witch, or Priest)
    public void Dark(ROLE target) {
        // Check if the Priest is alive before attacking
        if (!this.isAlive()) {
            System.out.println(this.getName() + " is dead and cannot attack.");
            return;
        }

        // Check if there is enough magic for the attack
        if (magic < 20) {
            System.out.println(name + " does not have enough magic to cast Dark.");
            return;
        }

        // Deduct magic points
        magic -= 20;

        // Attack logic based on the target's type
        if (target instanceof Warrior) {
            target.life -= 30; // Deduct 30 life points if the target is a Warrior
        } else if (target instanceof Witch) {
            target.life -= 50; // Deduct 50 life points if the target is a Witch
        } else if (target instanceof Priest) {
            target.life -= 40; // Deduct 40 life points if the target is a Priest
        }

        // If the target's life is less than or equal to 0, print death message
        if (target.life <= 0) {
            System.out.println(target.getName() + " has died.");
        }
    }
}
