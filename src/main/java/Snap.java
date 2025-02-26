package main.java;

import java.util.Timer;
import java.util.TimerTask;

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

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void play() {
        int count = 0;
        Card previous = this.dealCard();
        String prevSuit = previous.getSuit();

        String input = System.console().readLine("Hit enter to play! ");

        while (deckOfCards.size() > 0) {
            if (input.length() != 0) {
                input = System.console().readLine("Invalid character! Please hit enter to play! ");
            } else {
                count++;
                System.out.print("Turn " + count + ": ");
                Card current = this.dealCard();
                String currSuit = current.getSuit();
                if (currSuit == prevSuit) {
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
        String currentPlayer = playerOne.getName();
        Card previous = this.dealCard();
        String prevSuit = previous.getSuit();

        String input = System.console().readLine("Hit enter to play! ");

        while (deckOfCards.size() > 0) {
            if (input.length() != 0) {
                input = System.console().readLine("Invalid character! Please hit enter to play! ");
            } else {
                count++;
                if (count % 2 == 1) {
                    currentPlayer = playerOne.getName();
                } else {
                    currentPlayer = playerTwo.getName();
                }
                System.out.print("Turn " + count + " (" + currentPlayer + "): ");
                Card current = this.dealCard();
                String currSuit = current.getSuit();

                if (currSuit == prevSuit) {
                    String winner = currentPlayer;
                    TimerTask shutdown = new TimerTask() {
                        public void run() {
                            System.out.println(winner + " loses! Snap with " + current.getSuit()
                                    + " but you ran out of time :(");
                            System.exit(0);
                        }
                    };
                    Timer timer = new Timer();
                    timer.schedule(shutdown, 2000);
                    String snapEntry = System.console().readLine();
                    if (snapEntry.equals("snap")) {
                        System.out.println(currentPlayer + " wins! Snap with " + current.getSuit());
                        System.exit(0);
                    } else {
                        System.out.println(winner + " loses! Snap with " + current.getSuit()
                                + " but you didn't enter snap :(");
                        System.exit(0);
                    }
                } else {
                    previous = current;
                    prevSuit = currSuit;
                    input = System.console().readLine();
                }
            }
        }

        if (deckOfCards.size() == 0) {
            System.out.println("No snap in this deck! Please try again");
        }
    }

}
