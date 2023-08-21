package WarApp;

// Class representing a card used in the War card game
public class WarCard extends Card {

    // Enumeration for card suits
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    // Enumeration for card ranks
    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }

    // Private fields to store the suit and rank of the card
    private final Suit suit;
    private final Rank rank;

    // Constructor to initialize a card with a given suit and rank
    public WarCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter method to retrieve the suit of the card
    public Suit getSuit() {
        return suit;
    }

    // Getter method to retrieve the rank of the card
    public Rank getRank() {
        return rank;
    }

    // Override of the toString method to provide a string representation of the card
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
