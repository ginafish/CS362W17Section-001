package cs362.dominion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTest {
    private Random rng = new Random();
    private List<Card> supply;

    // List of all kingdom cards
    private ArrayList<Card> allkc = Card.list(
        Card.Adventurer,
        Card.Ambassador,
        Card.Baron,
        Card.CouncilRoom,
        Card.Cutpurse,
        Card.Embargo,
        Card.Feast,
        Card.Gardens,
        Card.GreatHall,
        Card.Market,
        Card.Mine,
        Card.Smithy,
        Card.Village
    );

    // Swap two elements in an array
    public static <T> void swap(List<T> arr, int i, int j) {
        if (i != j) {
            T a = arr.get(i);
            T b = arr.get(j);
            arr.set(i, b);
            arr.set(j, a);
        }
    }

    public static void main(String[] arguments) {
        new RandomTest().play();
    }

    public void play() {
        rng.setSeed(10);

        // Select 10 random kingdom cards
        ArrayList<Card> allkc = new ArrayList<Card>(this.allkc);
        ArrayList<Card> kc = new ArrayList<Card>();
        for (int i = 0; i < 10; i++) {
            int j = i + rng.nextInt(allkc.size() - i);
            swap(allkc, i, j);
            kc.add(allkc.get(i));
        }

        int seed = 1;
        int numPlayers = 2 + rng.nextInt(3);
        Game game = new Game(numPlayers, kc, seed);

        List<Card> supply = game.getSupplyCards();
        this.supply = supply;

        ////

        System.out.println("Starting game.");

        while (!game.isGameOver()) {
            printCards(game);

            while (game.getActions() > 0) {
                // Select a random card
                int pos = rng.nextInt(game.numHandCards());
                // If not an action, abort
                if (!game.handCard(pos).isAction()) {
                    break;
                }

                System.out.printf("player %d: playing %s\n", game.getCurrentPlayer(), game.handCard(pos));
                playAction(game, pos);
            }

            
            int money = playTreasures(game);
            while (game.getBuys() > 0 && game.getCoins() > 0) {
                // Select a random card to buy
                int cardx = rng.nextInt(supply.size());
                Card card = supply.get(cardx);
                if (card.cost() > game.getCoins()) {
                    // If it is too expensive, buy a Copper instead
                    card = Card.Copper;
                }
                if (game.supplyCount(card) <= 0) {
                    if (card == Card.Copper) {
                        break; // uh-oh
                    }
                    // if the card isn't available,
                    // delete it and try again
                    supply.remove(card);
                    continue;
                }
                System.out.printf("player %d: buying %s\n", game.getCurrentPlayer(), card);
                game.buyCard(card);
            }
            game.endTurn();
        }
    }

    public void playAction(Game game, int pos) {
        Card card = game.handCard(pos);
        if (card == Card.Ambassador) {
            // select a random card to reveal
            int reveal = rng.nextInt(game.numHandCards() - 1);
            if (reveal >= pos) {
                reveal++;
            }
            game.playAction(pos, game.handCard(reveal), 0);
        } else if (card == Card.Baron) {
            boolean discard = false;
            game.playAction(pos, discard);
        } else if (card == Card.Embargo) {
            // Choose a random card from the supply
            int n = rng.nextInt(this.supply.size());
            game.playAction(pos, this.supply.get(n));
        } else {
            game.playAction(pos);
        }
    }

    public static int playTreasures(Game game) {
        int money = 0;
        for (int i = 0; i < game.numHandCards(); i++) {
            if (game.handCard(i) == Card.Copper){
                game.playTreasure(i);
                money++;
                i--;
            }
            else if (game.handCard(i) == Card.Silver){
                game.playTreasure(i);
                money += 2;
                i--;
            }
            else if (game.handCard(i) == Card.Gold){
                game.playTreasure(i);
                money += 3;
                i--;
            }
        }
        return money;
    }

    public static void printCards(Game game) {
        for (int i = 0; i < game.numHandCards(); i++) {
            System.out.printf("Player %d card %d: %s\n", game.getCurrentPlayer(), i, game.handCard(i));
        }
    }
}
