package ch7_31;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck;

    // Constructor to initialize the deck with 52 cards
    public DeckOfCards() {
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Add all 52 cards to the deck
        for (String suit : suits) {
            for (String face : faces) {
                deck.add(new Card(suit, face));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // Method to deal a specified number of cards as a hand
    public ArrayList<Card> dealHand(int numCards) {
        ArrayList<Card> hand = new ArrayList<>();
        
        // Deal cards from the deck
        for (int i = 0; i < numCards; i++) {
            hand.add(deck.remove(0));  // Remove the top card from the deck
        }
        
        return hand;
    }
}



