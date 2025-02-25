package main.java;

public class Snap extends CardGame {

    public Snap(String name) {
        super(name);
    }

    public void play() {
        int count = 0;
        String input = System.console().readLine("Hit enter to play!");

        while (deckOfCards.size() > 0) {
            if (input.length() != 0) {
                input = System.console().readLine("Invalid character! Please hit enter to play!");
            } else {
                count++;
                System.out.print("Turn " + count + ": ");
                this.dealCard();
                input = System.console().readLine();
            }
        }

        System.out.println("No more cards to play!");

    }

}
