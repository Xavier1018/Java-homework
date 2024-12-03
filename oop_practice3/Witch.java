package oop_practice3;

public class Witch extends ROLE {
    public Witch(String name) {
        super(name, 280, 200); 
    }

    @Override
    public void NewMoon(ROLE target) {
        
        System.out.println(getName() + " cannot use New Moon.");
    }

    @Override
    public void SmallFire(ROLE target) {
        if (target == null) {
            System.out.println("Target is null. No action performed.");
            return;
        }

        if (getMagic() < 25) {
            System.out.println(getName() + " does not have enough magic to cast Small Fireball.");
            return;
        }

        reduceMagic(25); 
        
        int damage = (target instanceof Warrior) ? 40 : 60;
        target.reduceLife(damage);

        System.out.println(getName() + " attacks " + target.getName() + " with Small Fireball.");
        if (!target.isAlive()) {
            System.out.println(target.getName() + " has died.");
        }
    }

}





