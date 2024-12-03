package oop_practice3;
import java.util.Random;

public abstract class ROLE {
    private String name;
    private int life;
    private int magic;

    public ROLE(String name, int life, int magic) {
        this.name = name;
        this.life = life;
        this.magic = magic;
    }
    
    public ROLE() {
    	this.name="";
    	this.life=0;
    	this.magic=0;
    }



    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getMagic() {
        return magic;
    }

    public void reduceLife(int amount) {
        life = Math.max(0, life - amount);
    }

    public void reduceMagic(int amount) {
        magic = Math.max(0, magic - amount);
    }

    public boolean isAlive() {
        return life > 0;
    }

    public void autoDrink() {
        Random random = new Random();
        if (getLife() < 100) {
            int chance = random.nextInt(100);
            if (chance < 10) {
                System.out.println(getName() + " drinks a large red drug.");
                life += 120;
            } else if (chance < 40) {
                System.out.println(getName() + " drinks a medium red drug.");
                life += 80;
            } else if (chance < 80) {
                System.out.println(getName() + " drinks a small red drug.");
                life += 50;
            } else {
                System.out.println(getName() + " couldn't find a red drug to drink.");
            }
        }

        if (getMagic() < 70) {
            int chance = random.nextInt(100);
            if (chance < 10) {
                System.out.println(getName() + " drinks a large blue drug.");
                magic += 100;
            } else if (chance < 40) {
                System.out.println(getName() + " drinks a medium blue drug.");
                magic += 60;
            } else if (chance < 80) {
                System.out.println(getName() + " drinks a small blue drug.");
                magic += 30;
            } else {
                System.out.println(getName() + " couldn't find a blue drug to drink.");
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Life: " + life + ", Magic: " + magic;
    }
}



