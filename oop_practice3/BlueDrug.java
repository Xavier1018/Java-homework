package oop_practice3;

public class BlueDrug extends Drug {
    private int addMagic;

    // Constructor to initialize the size and the amount of magic added by the BlueDrug.
    public BlueDrug(String size, int addMagic) {
        super(size);
        this.addMagic = addMagic;
    }

    // Getter method for the amount of magic added by the BlueDrug.
    public int getAddMagic() {
        return addMagic;
    }
}


