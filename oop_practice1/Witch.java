package oop_practice1;

public class Witch {
    private String name;
    private int life;
    private int magic;

    // Constructor
    public Witch(String name) {
        this.name = name;
        this.life = 280;  // Witch's initial life
        this.magic = 200; // Witch's initial magic
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for life
    public int getLife() {
        return life;
    }

    // Method to reduce life
    public void reduceLife(int damage) {
        this.life -= damage;
    }

    // Witch attacks Warrior using Small Fireball
    public void SmallFire(Warrior warrior) {
        if (magic < 25) {
            System.out.println(name + " does not have enough magic to cast Small Fireball.");
            return;
        }
        magic -= 25;  // Attack consumes 25 magic points

        warrior.reduceLife(40);  // Warrior loses 40 life points
        System.out.println(name + " attacks " + warrior.getName() + " with Small Fireball.");
        if (warrior.getLife() <= 0) {
            System.out.println(warrior.getName() + " has died!");
        }
    }
}








