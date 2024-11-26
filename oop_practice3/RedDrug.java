package oop_practice3;

public class RedDrug extends Drug {
    private int addLife;

    // Constructor to initialize the size and the amount of life added by the RedDrug.
    public RedDrug(String size, int addLife) {
        super(size);
        this.addLife = addLife;
    }

    // Getter method for the amount of life added by the RedDrug.
    public int getAddLife() {
        return addLife;
    }
}


