import main.java.CardGame;
import main.java.Player;
import main.java.Snap;

public class Main {

    public static void main(String[] args) {
        // CardGame snap = new CardGame("snap");
        // snap.getDeck();
        // snap.dealCard();
        // snap.getDeck();
        // snap.sortDeckInNumberOrder();
        // snap.getDeck();
        // snap.sortDeckIntoSuits();
        // snap.getDeck();
        // snap.shuffleDeck();
        // snap.getDeck();

        // Snap newSnap = new Snap("snap");
        // newSnap.shuffleDeck();
        // newSnap.play();

        Player playerOne = new Player("Ruby");
        Player playerTwo = new Player("Bob");
        Snap multiplayerSnap = new Snap("snap", playerOne, playerTwo);
        multiplayerSnap.shuffleDeck();
        multiplayerSnap.play(playerOne, playerTwo);
    }
}