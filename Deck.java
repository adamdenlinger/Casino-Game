import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Deck {
    ArrayList<Integer> deck = new ArrayList<>(Arrays.asList(
        2,3,4,5,6,7,8,9,10,11,12,13,14,   // Hearts
        2,3,4,5,6,7,8,9,10,11,12,13,14,   // Clubs
        2,3,4,5,6,7,8,9,10,11,12,13,14,   // Diamonds
        2,3,4,5,6,7,8,9,10,11,12,13,14    // Spades
    ));

    void DistributeRound1(Player player, Player house) {
        int randInt = (int) (Math.random() * 48);
        player.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 47);
        house.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 46);
        player.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 45);
        house.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 44);
        player.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 43);
        house.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 42);
        player.hand.add(deck.get(randInt));
        deck.remove(randInt);
        randInt = (int) (Math.random() * 41);
        house.hand.add(deck.get(randInt));
        deck.remove(randInt);
    }

    void SetupRound2() {
        for(int i = 0; i < 4; i++) {
            deck.get(1);
        }
    }

    
}
