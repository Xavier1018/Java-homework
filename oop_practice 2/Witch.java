
public class Witch extends ROLE {
    // Constructor
    public Witch(String Name) {
        super(Name,280,200);
    }

    public void SmallFireBall(ROLE target) {
        if (getMagic() < 25) {
            System.out.println(getName() + " does not have enough magic to cast Small Fireball.");
            return;
        }
        reduceMagic(25);
       
        int damage = (target instanceof Warrior)? 40:60;
        target.reduceLife(damage);
        
        System.out.println(getName() + " attacks " + target.getName() + " with Small Fireball.  ");
        
        if(target.getLife()<=0) {
        	System.out.println(target.getName() +  "has died.");
        }
    }
    
    @Override
    public String toString() {
    	return "Witch->" + super.toString();
    }
}
