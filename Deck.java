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

    void AddAces(Player deck) {

    }

    void Round2(Player house, Player player) {
        for(boolean check = false; check == false;)
        {
            int i = 44;
            int randInt = (int) (Math.random() * i);
            house.hand.add(deck.get(randInt));
            deck.remove(randInt);
            i--;
            if(CheckDeck(house.hand) == false){
                randInt = (int) (Math.random() * i);
                player.hand.add(deck.get(randInt));
                deck.remove(randInt);
                i--;
                if(CheckDeck(player.hand) == true){
                    check = true;
                }
            }
        }
    }

    public boolean CheckDeck(ArrayList<Integer> cards) {
        boolean desicion = false;
        for(int i = 0; i < cards.size(); i++) {
            
        }
        return desicion
    }

    void ResetDeck(Player player, Player house) {
        for(int i = 0; i < player.hand.size(); i++){
            deck.add(player.hand.get(0));
            player.hand.remove(0);
        }
        for(int i = 0; i < house.hand.size(); i++){
            deck.add(house.hand.get(0));
            house.hand.remove(0);
        }
    }
}
