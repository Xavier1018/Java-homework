package ch7_31;

// Class representing a playing card
public class Card {
 private final String suit;
 private final String face;
 
 public Card(String suit,String face) {
	this.suit = suit;
	this.face = face;
 }
 @Override
 public String toString() {
	 return face + " of " + suit;
 }
 
 public String getSuit() {
	 return suit;
 }
 
 public String getFace() {
	 return face;
 }
}

