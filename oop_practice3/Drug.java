package oop_practice3;

public abstract class Drug {
    protected String size;

    // Constructor
    public Drug(String size) {
        this.size = size;
    }

    // Abstract method to get the effect value (overridden in subclasses)
    public abstract int getEffect();

    // Getter for size
    public String getSize() {
        return size;
    }
}
