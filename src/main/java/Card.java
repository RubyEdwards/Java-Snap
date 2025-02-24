package main.java;

public class Card {
    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = switch (symbol) {
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> 2;
        };
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return symbol + " of " + suit;
    }

}