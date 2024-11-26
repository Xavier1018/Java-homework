// The ROLE class represents a generic character in the game with attributes like name, life, and magic.
public class ROLE {
    private String Name;  // Name of the character
    private int life;     // Life points of the character
    private int Magic;    // Magic points of the character

    // Default constructor to initialize the character with default values
    public ROLE() {
        this.Name = "unknown";
        this.life = 0;
        this.Magic = 0;
    }

    // Constructor to initialize the character with a specific name, life, and magic points
    public ROLE(String Name, int life, int Magic) {
        this.Name = Name;
        this.life = life;
        this.Magic = Magic;
    }

    // Getter for the character's name
    public String getName() {
        return Name;
    }

    // Getter for the character's life points
    public int getLife() {
        return life;
    }

    // Getter for the character's magic points
    public int getMagic() {
        return Magic;
    }

    // Method to reduce the character's life points when they take damage
    public void reduceLife(int damage) {
        this.life = Math.max(0, this.life - damage);
    }

    // Method to reduce the character's magic points
    public void reduceMagic(int cost) {
        this.Magic -= cost;
    }

    // Override the toString method to provide a custom string representation of the character
    @Override
    public String toString() {
        return String.format("Name: %s, Life: %d, Magic: %d", Name, life, Magic);
    }
}


