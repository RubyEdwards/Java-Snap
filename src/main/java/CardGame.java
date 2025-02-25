package main.java;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    private String name;
    protected ArrayList<Card> deckOfCards;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = createDeck();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> createDeck() {
        ArrayList<Card> newDeck = new ArrayList<Card>();
        String[] suits = { "HEARTS", "CLUBS", "DIAMONDS", "SPADES" };
        String[] symbols = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        for (String suit : suits) {
            for (String symbol : symbols) {
                newDeck.add(new Card(suit, symbol));
            }
        }
        return newDeck;
    }

    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
        System.out.println("-".repeat(20));
    }

    public Card dealCard() {
        Card cardToDeal = deckOfCards.get(0);
        deckOfCards.remove(0);
        System.out.println("Dealt " + cardToDeal);
        System.out.println("-".repeat(20));
        return cardToDeal;
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
        deckOfCards.sort((card1, card2) -> Integer.compare(card1.getValue(), card2.getValue()));
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        sortDeckInNumberOrder();
        deckOfCards.sort((card1, card2) -> card1.getSuit().compareTo(card2.getSuit()));
        return deckOfCards;
    }

}
