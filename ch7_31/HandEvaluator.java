package ch7_31;

import java.util.ArrayList;
import java.util.HashMap;

public class HandEvaluator {
    // Method to evaluate the poker hand and return its rank (e.g., "Full House").
    private String evaluate(ArrayList<Card> hand) {
        // HashMap to store the frequency of each rank in the hand.
        HashMap<String, Integer> rankCount = new HashMap<>();

        // Populate the rankCount map with the occurrences for each rank.
        for (Card card : hand) {
            String rank = card.getRank(); // Get the rank of each card.
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1); // Increment the count for each rank.
        }

        // Boolean flags to identify various hand types based on rank frequencies.
        boolean hasPair = rankCount.containsValue(2); // True if there's at least one pair.
        
        // Corrected Two Pair check: counts the pairs in the hand; true if there are exactly two pairs.
        boolean hasTwoPair = rankCount.values().stream().filter(count -> count == 2).count() == 2;
        
        boolean hasThreeOfAKind = rankCount.containsValue(3); // True if there's a three of a kind.
        boolean hasFourOfAKind = rankCount.containsValue(4); // True if there's a four of a kind.
        boolean hasFullHouse = hasThreeOfAKind && hasPair; // True if there's both a three of a kind and a pair.

        // Return the highest-ranked hand that applies.
        if (hasFourOfAKind) return "Four of a Kind";
        if (hasFullHouse) return "Full House";
        if (hasThreeOfAKind) return "Three of a Kind";
        if (hasTwoPair) return "Two Pair";
        if (hasPair) return "One Pair";

        // If none of the above hand types apply, return "High Card".
        return "High Card";
    }
}

