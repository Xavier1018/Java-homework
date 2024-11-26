package oop_practice3;

public class ROLE {
    private String name;
    private int life;
    private int magic;

    // Constructor to initialize the character's name, life, and magic points.
    public ROLE(String name, int life, int magic) {
        this.name = name;
        this.life = life;
        this.magic = magic;
    }

    // Getter method for the character's name.
    public String getName() {
        return name;
    }

    // Getter method for the character's current life points.
    public int getLife() {
        return life;
    }

    // Getter method for the character's current magic points.
    public int getMagic() {
        return magic;
    }

    // The Drink method allows a character to drink a drug (either RedDrug or BlueDrug).
    // It updates the character's life or magic based on the drug's size.
    public void Drink(Drug drug) {
        if (drug instanceof RedDrug) { // If the drug is of type RedDrug
            RedDrug redDrug = (RedDrug) drug;
            switch (redDrug.getSize()) {
                case "Large":
                    life += 120; // Increase life by 120 for Large RedDrug
                    break;
                case "Medium":
                    life += 80; // Increase life by 80 for Medium RedDrug
                    break;
                case "Small":
                    life += 50; // Increase life by 50 for Small RedDrug
                    break;
            }
        } else if (drug instanceof BlueDrug) { // If the drug is of type BlueDrug
            BlueDrug blueDrug = (BlueDrug) drug;
            switch (blueDrug.getSize()) {
                case "Large":
                    magic += 100; // Increase magic by 100 for Large BlueDrug
                    break;
                case "Medium":
                    magic += 60; // Increase magic by 60 for Medium BlueDrug
                    break;
                case "Small":
                    magic += 30; // Increase magic by 30 for Small BlueDrug
                    break;
            }
        }

        // Ensures that life does not exceed 100 and magic does not exceed 70
        if (life > 100) {
            life = 100; // Cap life at 100
        }

        if (magic > 70) {
            magic = 70; // Cap magic at 70
        }

        // Output the action of drinking the drug
        System.out.println(name + " drank a " + drug.getSize() + " bottle.");
    }

    // Overriding toString() to print the current status of the character
    @Override
    public String toString() {
        return "Name: " + name + ", Life: " + life + ", Magic: " + magic;
    }
}


