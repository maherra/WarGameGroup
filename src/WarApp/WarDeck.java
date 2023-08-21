package WarApp;

import java.util.ArrayList;

// Class representing a deck of cards used in the War card game
public class WarDeck extends GroupOfCards {

    // Constructor to create a WarDeck instance
    public WarDeck() {
        super(52); // Call the constructor of the parent class GroupOfCards with size 52
        this.cards = new ArrayList<>(); // Initialize the cards ArrayList

        // Generate cards for all combinations of suits and ranks
        for (WarCard.Suit suit : WarCard.Suit.values()) {
            for (WarCard.Rank rank : WarCard.Rank.values()) {
                cards.add(new WarCard(suit, rank)); // Add a new WarCard to the cards list
            }
        }
    }
}
