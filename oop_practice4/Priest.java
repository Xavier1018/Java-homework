package oop_practice4;

class Priest extends ROLE {
	public Priest() {
		super("Priest",340,160);
	}
    // Constructor initializing Priest's specific attributes
    public Priest(String name) {
        super(name, 340, 160); // Initial life: 340, Initial magic: 160
    }

    // Method to perform the Dark attack
    public void Dark(ROLE target) {
        // Check if there is enough magic
        if (magic < 20) {
            System.out.println(name + " does not have enough magic to cast Dark.");
            return;
        }

        // Deduct magic points
        magic -= 20;

        // Attack logic based on the target type
        if (target instanceof Warrior) {
            target.life -= 30; // Deduct 30 life points if target is a Warrior
        } else if (target instanceof Witch) {
            target.life -= 50; // Deduct 50 life points if target is a Witch
        } else if (target instanceof Priest) {
            target.life -= 40; // Deduct 40 life points if target is a Priest
        }

        // Check if the target is dead
        if (target.life <= 0) {
            System.out.println(target.getName() + " has died.");
        }
    }
}