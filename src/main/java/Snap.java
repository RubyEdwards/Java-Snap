package main.java;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);
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

}
