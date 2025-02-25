import main.java.CardGame;
import main.java.Snap;

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
        snap.shuffleDeck();
        snap.getDeck();

        Snap newSnap = new Snap("snap");
        newSnap.shuffleDeck();
        newSnap.play();
    }
}