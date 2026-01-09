public class Slow {
    Player player = new Player();
    Player house = new Player();
    Deck deck = new Deck();
    Game game = new Game();
    int playerWins = 0;
    int houseWins = 0;

    void RunTenTimes() {
        for (int i = 0; i < 10; i++) {
            PlayGame();
        }
    }

    void PlayGame() {
        deck.DistributeRound1(player, house);

                System.out.println(player.hand);
                System.out.println(house.hand);

        int round1 = game.Round1(player, house);
        if (round1 == 0) {
            playerWins++;
        } else if (round1 == 1) {
            houseWins++;
        } else {
            int round2 = game.Round2(player, house, deck);
            if(round2 == 0) {
                playerWins++;
                System.out.println("Player Wins! Player Hand: " + player.hand);
                System.out.println("House Loses! House Hand: " + house.hand);
            }
            else {
                houseWins++;
                System.out.println("Player Loses! Player Hand: " + player.hand);
                System.out.println("House Wins! House Hand: " + house.hand);

            }
        }
        deck.ResetDeck(player, house);
    }
}
