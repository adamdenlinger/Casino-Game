public class Fast {
    Player player = new Player();
    Player house = new Player();
    Deck deck = new Deck();
    Game game = new Game();
    int playerWins = 0;
    int houseWins = 0;

    void RunTenKTimes() {
        for (int i = 0; i < 10000; i++) {
            PlayGame();
        }
        System.out.println("You won " + playerWins + " times!");
        System.out.println("The house won " + houseWins + " times!");
        System.out.println("You won " + (double)playerWins/(playerWins + houseWins) + "% of your games");
    }

    void PlayGame() {
        deck.DistributeRound1(player, house);
        int round1 = game.Round1(player, house);
        if (round1 == 0) {
            playerWins++;
            deck.ResetDeck(player, house);
            deck.RemoveAces();

        } else if (round1 == 1) {
            houseWins++;
            deck.ResetDeck(player, house);
            deck.RemoveAces();

        } else {
            int round2 = game.Round2(player, house, deck);
            if (round2 == 0) {
                playerWins++;
                System.out.println("Player Wins! Player Hand: " + player.hand);
            } else {
                houseWins++;
                System.out.println("House Wins! House Hand: " + house.hand);
            }
            deck.ResetDeck(player, house);
            deck.RemoveAces();
        }
    }
}

