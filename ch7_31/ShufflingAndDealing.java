package ch7_31;

import java.util.ArrayList;

public class ShufflingAndDealing {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        ArrayList<Card> dealerHand = deck.dealHand(5);
        System.out.println("Dealer's hand (face down): [Hidden]");

        HandEvaluator evaluator = new HandEvaluator();
        String dealerEvaluation = evaluator.evaluate(dealerHand);

        // Display the dealer's hand for debugging purposes
        System.out.println("Dealer's hand: " + dealerHand);
        System.out.println("Dealer's hand evaluation: " + dealerEvaluation);
    }
}

