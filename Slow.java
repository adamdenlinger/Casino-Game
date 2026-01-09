public class Slow {
    Player player = new Player();
    Player house = new Player();
    Deck deck = new Deck();
    int playerWins = 0;
    int houseWins = 0;

    void RunTenTimes() {
        for(int i = 0; i < 10; i++) {
            PlayGame();
        }
    }
    
    void PlayGame() {
       deck.DistributeRound1(player, house); 
    }
}
