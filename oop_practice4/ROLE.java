package oop_practice4;

public class ROLE {
    protected String name;
    protected int life;
    protected int magic;

    // Constructor to initialize common attributes: name, life, and magic
    public ROLE(String name, int life, int magic) {
        this.name = name;
        this.life = life;
        this.magic = magic;
    }

    // Default constructor
    public ROLE() {
        this.name = "";
        this.life = 0;
        this.magic = 0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for life points
    public int getLife() {
        return life;
    }

    // Getter for magic points
    public int getMagic() {
        return magic;
    }

    // Method to check if the character is alive (life > 0)
    public boolean isAlive() {
        return life > 0;
    }

    // Override toString() to display the character's details
    @Override
    public String toString() {
        return name + " - Life: " + life + ", Magic: " + magic;
    }
}

