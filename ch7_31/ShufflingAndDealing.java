package ch7_31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Class representing a playing card
class Card {
    private String suit, rank; // Attributes for suit and rank of the card

    // Constructor to initialize the card's suit and rank
    public Card(String suit, String rank) {
        this.suit = suit; 
        this.rank = rank;
    }

    // Returns the string representation of the card (e.g., "King of Hearts")
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

// Class representing a deck of cards
class DeckOfCards {
    private ArrayList<Card> deck = new ArrayList<>(); // List to hold the deck of cards

    // Constructor to initialize the deck with all cards
    public DeckOfCards() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Create all combinations of suits and ranks
        for (String suit : suits)
            for (String rank : ranks)
                deck.add(new Card(suit, rank));
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // Method to deal a hand of cards
    public ArrayList<Card> dealHand(int numOfCards) {
        ArrayList<Card> hand = new ArrayList<>(); // List to hold the dealt hand
        for (int i = 0; i < numOfCards; i++) 
            hand.add(deck.remove(0)); // Remove and add the top card from the deck
        return hand;
    }
}

// Class to evaluate the hand of cards
class HandEvaluator {
    // Method to evaluate the given hand of cards
    public int evaluate(ArrayList<Card> hand) {
        HashMap<String, Integer> rankCount = new HashMap<>(); // Map to count occurrences of each rank
        
        // Count the occurrences of each rank in the hand
        for (Card card : hand) {
            String rank = card.toString().split(" ")[0];  // Only consider the rank part
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }
        
        // Check if there is a pair (two cards of the same rank)
        return rankCount.containsValue(2) ? 5 : 0;  // Assume 5 points for a pair, 0 otherwise
    }
}

// Main class to run the shuffling and dealing simulation
public class ShufflingAndDealing {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards(); // Create a new deck of cards
        deck.shuffle(); // Shuffle the deck
        ArrayList<Card> dealerHand = deck.dealHand(5); // Deal 5 cards to the dealer
        System.out.println("Dealer's hand (face down): [Hidden]"); // Display dealer's hand (hidden)
        
        // Evaluate the dealer's hand
        HandEvaluator evaluator = new HandEvaluator();
        int dealerEvaluation = evaluator.evaluate(dealerHand);
        
        // Display the dealer's new hand
        System.out.println("Dealer's new hand: " + dealerHand);
    }
}
