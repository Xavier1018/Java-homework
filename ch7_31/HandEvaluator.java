package ch7_31;

import java.util.ArrayList;
import java.util.HashMap;

public class HandEvaluator {

    // This method evaluates the hand and returns the type of hand (e.g., "Four of a Kind", "Full House")
    private String evaluate(ArrayList<Card> hand) {
        
        // HashMap to count occurrences of each rank (card value)
        HashMap<String, Integer> rankCount = new HashMap<>();

        // Loop through each card in the hand
        for (Card card : hand) {
            String rank = card.getRank(); // Get the rank of the card (e.g., "2", "3", "A", "K")
            // Update the rank count in the map
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        // Variables to track the count of pairs, three of a kinds, and four of a kinds
        int pairCount = 0;
        boolean hasThreeOfAKind = false;
        boolean hasFourOfAKind = false;

        // Loop through the values (counts) of the card ranks
        for (int count : rankCount.values()) {
            if (count == 2) {
                pairCount++; // Increase pairCount if a card rank appears twice
            } else if (count == 3) {
                hasThreeOfAKind = true; // Set hasThreeOfAKind to true if a card rank appears three times
            } else if (count == 4) {
                hasFourOfAKind = true; // Set hasFourOfAKind to true if a card rank appears four times
            }
        }

        // Check for different hand types based on the card counts
        boolean hasTwoPair = pairCount == 2; // Two Pair exists if there are exactly two pairs
        boolean hasFullHouse = hasThreeOfAKind && pairCount == 1; // Full House exists if there is a Three of a Kind and a Pair

        // Return the hand type based on the conditions
        if (hasFourOfAKind) return "Four of a Kind";
        if (hasFullHouse) return "Full House";
        if (hasThreeOfAKind) return "Three of a Kind";
        if (hasTwoPair) return "Two Pair";
        if (pairCount == 1) return "One Pair"; // One Pair exists if there is exactly one pair

        return "High Card"; // If none of the above conditions are met, return "High Card"
    }
}
