package oop_practice3;


public class Warrior extends ROLE {
    public Warrior(String name) {
        super(name, 400, 100); 
    }

    public Warrior() {
        super("unknown", 400, 100); 
    }

    
    public void NewMoon(ROLE target) {
        if (target == null) {
            System.out.println("Target is null. No action performed.");
            return;
        }

        if (getMagic() < 10) {
            System.out.println(getName() + " does not have enough magic to attack.");
            return;
        }

        reduceMagic(10); 

        
        int damage = (target instanceof Witch) ? 40 : 25;
        target.reduceLife(damage);

        System.out.println(getName() + " attacks " + target.getName() + " with New Moon Sword.");
        if (!target.isAlive()) {
            System.out.println(target.getName() + " has died.");
        }
    }

}


