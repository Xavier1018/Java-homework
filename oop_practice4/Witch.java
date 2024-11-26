package oop_practice4;

class Witch extends ROLE {
    // Constructor initializing Witch's specific attributes
    public Witch(String name) {
        super(name, 280, 200); // Initial life: 280, Initial magic: 200
    }
    
    public Witch() {
        super("Witch", 280, 200); 
    }

    // Method to perform the SmallFire attack
    public void SmallFire(ROLE target) {
        // Check if there is enough magic
        if (magic < 25) {
            System.out.println(name + " does not have enough magic to cast SmallFire.");
            return;
        }

        // Deduct magic points
        magic -= 25;

        // Attack logic based on the target type
        if (target instanceof Warrior) {
            target.life -= 40; // Deduct 40 life points if target is a Warrior
        } else if (target instanceof Witch) {
            target.life -= 60; // Deduct 60 life points if target is a Witch
        } else if (target instanceof Priest) {
            target.life -= 50; // Deduct 50 life points if target is a Priest
        }

        // Check if the target is dead
        if (target.life <= 0) {
            System.out.println(target.getName() + " has died.");
        }
    }
}
