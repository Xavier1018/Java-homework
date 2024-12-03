package oop_practice4_0;

public abstract class ROLE {
    protected String name;
    protected int life;
    protected int magic;

    // Constructor to initialize name, life, and magic values
    public ROLE(String name, int life, int magic) {
        this.name = name;
        this.life = life;
        this.magic = magic;
    }

    // Getter for life
    public int getLife() {
        return life;
    }

    // Setter for life
    public void setLife(int life) {
        this.life = life;
    }

    // Getter for magic
    public int getMagic() {
        return magic;
    }

    // Setter for magic
    public void setMagic(int magic) {
        this.magic = magic;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract method to attack
    public abstract void attack(ROLE target);

    // Method to check if the character is alive
    public boolean isAlive() {
        return life > 0;
    }

    // Method to reduce life
    public void reduceLife(int amount) {
        life -= amount;
    }

    // Method to reduce magic
    public void reduceMagic(int amount) {
        magic -= amount;
    }

    // Method to recover life (used by LifeRecoverable interface)
    public abstract double recoverLife();

    // Method to recover magic (used by MagicRecoverable interface)
    public abstract double recoverMagic();
}
