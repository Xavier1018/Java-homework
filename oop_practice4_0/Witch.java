package oop_practice4_0;

public class Witch extends ROLE implements LifeRecoverable, MagicRecoverable {

    // Constructor to initialize Witch with default values
    public Witch(String name) {
        super(name, 280, 200); // Default life = 280, magic = 200
    }

    // Implement the attack method for Witch
    @Override
    public void attack(ROLE target) {
        if (getMagic() >= 10) {
            reduceMagic(10); // Deduct 10 magic for each attack
            target.reduceLife(20); // Cause 20 damage to target
            System.out.println(getName() + " attacked " + target.getName() + " with SmallFire.");
        } else {
            System.out.println("Not enough magic for SmallFire.");
        }
    }

    // Witch's auto recovery for life
    @Override
    public double recoverLife() {
        double recoveredLife = LIFERATE; // Recover 10 life points automatically
        setLife(getLife() + (int) recoveredLife);
        return recoveredLife;
    }

    // Witch's auto recovery for magic
    @Override
    public double recoverMagic() {
        double recoveredMagic = MAGICRATE; // Recover 4 magic points automatically
        setMagic(getMagic() + (int) recoveredMagic);
        return recoveredMagic;
    }

    // Witch's auto drink method (if needed, for health or magic recovery)
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
