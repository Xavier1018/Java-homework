
public class Warrior extends ROLE {
    // Constructor
    public Warrior(String Name) {
        super(Name, 400, 100); 
    }

    public void NewMoon(ROLE target) {
        if (getMagic() < 10) {
            System.out.println(getName() + " does not have enough magic to attack.");
            return;
        }
        reduceMagic(10); 

        
        int damage = (target instanceof Witch) ? 40 : 25;
        target.reduceLife(damage);

        
        System.out.println(getName() + " attacks " + target.getName() + " with New Moon Sword.");

        
        if (target.getLife() <= 0) {
            System.out.println(target.getName() + " has died.");
        }
    }

    @Override
    public String toString() {
        return "Warrior -> " + super.toString(); 
    }
}

