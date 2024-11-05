package ch7_31;

import java.util.ArrayList;
import java.util.HashMap;

public class HandEvaluator {
    public String evaluate(ArrayList<Card> hand) {
        HashMap<String, Integer> rankCount = new HashMap<>();
        
        for (Card card : hand) {
            String rank = card.getRank();
            rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }

        boolean hasPair = rankCount.containsValue(2);
        boolean hasTwoPair = rankCount.values().stream().filter(count -> count == 2).count() == 2;
        boolean hasThreeOfAKind = rankCount.containsValue(3);
        boolean hasFourOfAKind = rankCount.containsValue(4);
        boolean hasFullHouse = hasPair && hasThreeOfAKind;

        if (hasFourOfAKind) return "Four of a Kind";
        if (hasFullHouse) return "Full House";
        if (hasThreeOfAKind) return "Three of a Kind";
        if (hasTwoPair) return "Two Pair";
        if (hasPair) return "One Pair";

        return "High Card";
    }
}
