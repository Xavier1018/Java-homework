package ch7_31;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    // Create an ArrayList to hold the deck of cards
    private ArrayList<Card> deck = new ArrayList<>();
    
    // Constructor to initialize the deck with 52 cards (13 ranks * 4 suits)
    public DeckOfCards() {
        // Define the four suits and thirteen ranks for a deck of cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        // Loop through each suit and rank to create a deck of 52 cards
        for (String suit : suits) {
            for (String rank : ranks) {
                // Add each card to the deck
                deck.add(new Card(suit, rank));
            }
        }
    }
    
    // Method to shuffle the deck using Collections.shuffle
    public void shuffle() {
        // Shuffle the deck randomly
        Collections.shuffle(deck);
    }
    
    // Method to deal one card from the deck
    public Card dealCard() {
        // Check if the deck is not empty
        if (!deck.isEmpty()) {
            // Remove and return the top card from the deck
            return deck.remove(0);
        } else {
            // If the deck is empty, return null
            return null;
        }
    }
}

