public class Game {

    boolean PlayerHasDuplicate(Player player) {
        boolean hasDuplicate = false;

        for (int i = 0; i < player.hand.size(); i++) {
            for (int j = i + 1; j < player.hand.size(); j++) {
                if (player.hand.get(i).equals(player.hand.get(j))) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate)
                break;
        }

        return hasDuplicate;
    }

    boolean HouseHasDuplicate(Player house) {
        boolean hasDuplicate = false;

        for (int i = 0; i < house.hand.size(); i++) {
            for (int j = i + 1; j < house.hand.size(); j++) {
                if (house.hand.get(i).equals(house.hand.get(j))) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate)
                break;
        }

        return hasDuplicate;
    }

    int Round1(Player player, Player house) {
        if (PlayerHasDuplicate(player) == true && HouseHasDuplicate(house) == false) {
            return 0;
        } else if (PlayerHasDuplicate(player) == false && HouseHasDuplicate(house) == true) {
            return 1;
        } else {
            return 2;
        }
    }

    int Round2(Player house, Player player, Deck deck) {
        deck.AddAces();
        boolean isWinner = false;
        while (isWinner == false) {
            if (deck.DistributeHouse(house) == 1) {
                isWinner = true;
                System.out.println("ACE!!");
                return 1;
            }
            if (HouseHasDuplicate(house) == true) {
                isWinner = true;
                return 1;
            }
            if (deck.DistributePlayer(player) == 1) {
                isWinner = true;
                System.out.println("ACE!!");
                return 1;
            }
            if (PlayerHasDuplicate(player) == true) {
                isWinner = true;
                return 0;
            }
        }
        return 2;
    }
}
