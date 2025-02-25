import main.java.CardGame;

public class Main {

    public static void main(String[] args) {
        CardGame snap = new CardGame("snap");
        snap.getDeck();
        snap.dealCard();
        snap.getDeck();
        snap.sortDeckInNumberOrder();
        snap.getDeck();
        snap.sortDeckIntoSuits();
        snap.getDeck();
    }
}