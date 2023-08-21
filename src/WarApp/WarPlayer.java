package WarApp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WarPlayer extends Player {
    private Queue<WarCard> hand;

    public WarPlayer(String name) {
        super(name);
        hand = new LinkedList<>();
    }

    public void addToHand(WarCard card) {
        hand.add(card);
    }

    public WarCard playCard() {
        return hand.poll();
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

  
    public WarCard getPlayableCard() {
        // Display player's hand and prompt for card selection
        System.out.println(getName() + "'s Hand: " + hand);
        Scanner scanner = new Scanner(System.in);
        int selectedCardIndex;
        do {
            System.out.print("Select a card (1-" + hand.size() + "): ");
            selectedCardIndex = scanner.nextInt() - 1;
    
            // Consume the newline character
            scanner.nextLine();
        } while (selectedCardIndex < 0 || selectedCardIndex >= hand.size());
        return hand.toArray(new WarCard[0])[selectedCardIndex];
    }
    

    @Override
    public void play() {
        // Implement game-specific player logic here
    }
}
