package ch7_31;

// Class representing a playing card
public class Card {
    private String suit, rank;

    public Card(String suit, String rank) {
        this.suit = suit; 
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
