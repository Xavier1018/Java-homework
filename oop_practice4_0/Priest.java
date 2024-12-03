package oop_practice4_0;

public class Priest extends ROLE implements LifeRecoverable, MagicRecoverable {

    // Constructor to initialize Priest with default values
    public Priest(String name) {
        super(name, 340, 160); // Default life = 340, magic = 160
    }

    // Implement the attack method for Priest
    @Override
    public void attack(ROLE target) {
        if (getMagic() >= 20) {
            reduceMagic(20); // Deduct 20 magic for each attack
            target.reduceLife(30); // Cause 30 damage to target
            System.out.println(getName() + " attacked " + target.getName() + " with Dark.");
        } else {
            System.out.println("Not enough magic for Dark.");
        }
    }

    // Priest's auto recovery for life
    @Override
    public double recoverLife() {
        double recoveredLife = LIFERATE; // Recover 10 life points automatically
        setLife(getLife() + (int) recoveredLife);
        return recoveredLife;
    }

    // Priest's auto recovery for magic
    @Override
    public double recoverMagic() {
        double recoveredMagic = MAGICRATE; // Recover 4 magic points automatically
        setMagic(getMagic() + (int) recoveredMagic);
        return recoveredMagic;
    }

    // Priest's auto drink method (if needed, for health or magic recovery)
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
