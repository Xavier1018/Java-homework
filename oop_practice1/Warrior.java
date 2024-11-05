package oop_practice1;

public class Warrior {
    private String name;
    private int life;
    private int magic;

    // Constructor
    public Warrior(String name) {
        this.name = name;
        this.life = 400;  // Warrior's initial life
        this.magic = 100; // Warrior's initial magic
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void reduceLife(int damage) {
        this.life -= damage;
    }

    public void NewMoon(Witch witch) {
        if (magic < 10) {
            System.out.println(name + " does not have enough magic to attack.");
            return;
        }
        magic -= 10;
        witch.reduceLife(40);
        System.out.println(name + " attacks " + witch.getName() + " with New Moon Sword Technique.");
        
        if (witch.getLife() <= 0) {
            System.out.println(witch.getName() + " has died!");
        }
    }
}
