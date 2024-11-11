package ch7_31;

import java.util.ArrayList;
import java.util.HashMap;

public class HandEvaluator {
    // Method to evaluate the poker hand
    public String evaluate(ArrayList<Card> hand) {
        HashMap<String, Integer> faceCount = new HashMap<>();
        
        // Count how many times each face appears in the hand
        for (Card card : hand) {
            String face = card.getFace();
            faceCount.put(face, faceCount.getOrDefault(face, 0) + 1);
        }

        // Check for specific hand patterns
        boolean hasPair = faceCount.containsValue(2);
        boolean hasTwoPair = faceCount.values().stream().filter(count -> count == 2).count() == 2;
        boolean hasThreeOfAKind = faceCount.containsValue(3);
        boolean hasFourOfAKind = faceCount.containsValue(4);
        boolean hasFullHouse = hasPair && hasThreeOfAKind;
        
        // Return the evaluation based on the hand's patterns
        if (hasFourOfAKind) return "Four of a kind";
        if (hasFullHouse) return "Full house";
        if (hasThreeOfAKind) return "Three of a kind";
        if (hasTwoPair) return "Two pairs";
        if (hasPair) return "One pair";
        
        return "High hand";  // If no special hand, return "High hand"
    }
}



