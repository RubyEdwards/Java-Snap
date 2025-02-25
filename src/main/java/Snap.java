package main.java;

public class Snap extends CardGame {
    private Player playerOne;
    private Player playerTwo;

    public Snap(String name) {
        super(name);
    }

    public Snap(String name, Player playerOne, Player playerTwo) {
        super(name);
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        int count = 0;
        Card previous = this.dealCard();

        String input = System.console().readLine("Hit enter to play! ");

        while (deckOfCards.size() > 0) {
            if (input.length() != 0) {
                input = System.console().readLine("Invalid character! Please hit enter to play! ");
            } else {
                count++;
                System.out.print("Turn " + count + ": ");
                Card current = this.dealCard();
                if (current.getSuit() == previous.getSuit()) {
                    System.out.println("You win! Snap with " + current.getSuit());
                    break;
                } else {
                    previous = current;
                    input = System.console().readLine();
                }
            }
        }

        if (deckOfCards.size() == 0) {
            System.out.println("No snap in this deck! Please try again");
        }

    }

    public void play(Player playerOne, Player playerTwo) {
        int count = 0;
        Player currentPlayer = playerOne;
        Card previous = this.dealCard();

        String input = System.console().readLine("Hit enter to play! ");

        while (deckOfCards.size() > 0) {
            if (input.length() != 0) {
                input = System.console().readLine("Invalid character! Please hit enter to play! ");
            } else {
                count++;
                if (count % 2 == 1) {
                    currentPlayer = playerOne;
                } else {
                    currentPlayer = playerTwo;
                }
                System.out.print("Turn " + count + " (" + currentPlayer.getName() + "): ");
                Card current = this.dealCard();
                if (current.getSuit() == previous.getSuit()) {
                    System.out.println(currentPlayer.getName() + " wins! Snap with " + current.getSuit());
                    break;
                } else {
                    previous = current;
                    input = System.console().readLine();
                }
            }
        }

        if (deckOfCards.size() == 0) {
            System.out.println("No snap in this deck! Please try again");
        }
    }

}
