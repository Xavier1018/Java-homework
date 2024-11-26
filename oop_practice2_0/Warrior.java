// The Warrior class extends the ROLE class and represents a warrior character in the game
class Warrior extends ROLE {

    // Constructor that sets the warrior's name and initializes life and magic points
    public Warrior(String Name) {
        super(Name, 400, 100);  // Warriors start with 400 life and 100 magic points
    }

    // Default constructor that calls the ROLE constructor
    public Warrior() {
        super();
    }

    // Method that performs the New Moon attack on a target character
    public void NewMoon(ROLE target) {
        if (getMagic() < 10) {
            System.out.println(getName() + " does not have enough magic to attack.");
            return;
        }
        reduceMagic(10);  // Deduct 10 magic points for the attack

        // Deal different damage depending on the type of the target (Warrior or Witch)
        int damage = (target instanceof Witch) ? 40 : 25;
        target.reduceLife(damage);  // Reduce target's life points

        System.out.println(getName() + " attacks " + target.getName() + " with New Moon Sword.");

        // Check if the target has died
        if (target.getLife() <= 0) {
            System.out.println(target.getName() + " has died.");
        }
    }

    // Override the toString method to include the character type (Warrior) and their details
    @Override
    public String toString() {
        return "Warrior -> " + super.toString();
    }
}
