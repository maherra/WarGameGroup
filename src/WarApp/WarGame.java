package WarApp;

public class WarGame extends Game {

    public WarGame(String name) {
        super(name);
    }

    @Override
    public void play() {
        WarDeck deck = new WarDeck();
        deck.shuffle();

        WarPlayer player1 = new WarPlayer("Player 1");
        WarPlayer player2 = new WarPlayer("Player 2");

        getPlayers().add(player1);
        getPlayers().add(player2);

        while (deck.getSize() > 0) {
            player1.addToHand((WarCard) deck.getCards().get(0));
            deck.getCards().remove(0);
            player2.addToHand((WarCard) deck.getCards().get(0));
            deck.getCards().remove(0);
            deck.setSize(deck.getSize() - 2);
        }

        while (player1.hasCards() && player2.hasCards()) {
            System.out.println(player1.getName() + "'s turn:");
            System.out.println(player2.getName() + "'s turn:");

            // Compare cards and resolve the game logic...
        }

        declareWinner();
    }

    @Override
    public void declareWinner() {
        // Determine the winner and print the result...
    }
}
