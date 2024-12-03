package oop_practice4_0;

public class Warrior extends ROLE implements LifeRecoverable, MagicRecoverable {

    // Constructor to initialize Warrior with default values
    public Warrior(String name) {
        super(name, 400, 100); // Default life = 400, magic = 100
    }

    // Implement the attack method for Warrior
    @Override
    public void attack(ROLE target) {
        if (getMagic() >= 15) {
            reduceMagic(15); // Deduct 15 magic for each attack
            target.reduceLife(25); // Cause 25 damage to target
            System.out.println(getName() + " attacked " + target.getName() + " with NewMoon.");
        } else {
            System.out.println("Not enough magic for NewMoon.");
        }
    }

    // Warrior's auto recovery for life
    @Override
    public double recoverLife() {
        double recoveredLife = LIFERATE; // Recover 10 life points automatically
        setLife(getLife() + (int) recoveredLife);
        return recoveredLife;
    }

    // Warrior's auto recovery for magic
    @Override
    public double recoverMagic() {
        double recoveredMagic = MAGICRATE; // Recover 4 magic points automatically
        setMagic(getMagic() + (int) recoveredMagic);
        return recoveredMagic;
    }

    // Warrior's auto drink method (if needed, for health or magic recovery)
    public void autoDrink() {
        if (getLife() < 100) {
            setLife(getLife() + 50); // Recover life if needed
            System.out.println(getName() + " drank a potion and recovered 50 life.");
        }
        if (getMagic() < 50) {
            setMagic(getMagic() + 30); // Recover magic if needed
            System.out.println(getName() + " drank a potion and recovered 30 magic.");
        }
    }
}


