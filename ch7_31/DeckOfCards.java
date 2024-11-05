package ch7_31;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck = new ArrayList<>();

    public DeckOfCards() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits)
            for (String rank : ranks)
                deck.add(new Card(suit, rank));
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public ArrayList<Card> dealHand(int numOfCards) {
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 0; i < numOfCards; i++) 
            hand.add(deck.remove(0));
        return hand;
    }
}

