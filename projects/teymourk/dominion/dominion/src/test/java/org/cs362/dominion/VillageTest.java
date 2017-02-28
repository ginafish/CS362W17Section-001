package org.cs362.dominion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by kia on 2/11/17.
 */
public class VillageTest {

    @Test
    public void villageTest() throws  Throwable{

        List<Card> cards;
        GameState state,testState;
        Randomness.reset(10);

        int newActions = 2;

        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);

        Player player = new Player(state, "Player-1");
        player.hand.add(Card.getCard(cards, Card.CardName.Village));
        state.addPlayer(player);

        player = new Player(state, "Player-1");
        state.addPlayer(player);

        state.initializeGame();

        System.out.println("\n--------Player 1 Status--------");
        System.out.println("|                              	  ");
        System.out.println("|" + state.players.get(0).hand);
        System.out.println("|Actions #:" + state.players.get(0).numActions);
        System.out.println(" ----------------------------------");

        //copy or clone the game state to a test case
        testState=(GameState) state.clone();

        //	play the game
        HashMap<Player, Integer> winners=state.play();

        System.out.println("\n--------Add One Card--------");
        System.out.println("\n--------Add 2 Action--------");

        System.out.println("\n--------Player 1 Status--------");
        System.out.println("|                              	  ");
        System.out.println("|Hand Count:" + state.players.get(0).hand.size() + ", expected = " + (testState.players.get(0).hand.size() + 1));
        System.out.println("|" + state.players.get(0).hand);
        System.out.println("|Actions #:" + state.players.get(0).numActions + ", expected = " + (testState.players.get(0).numActions - 1 + newActions));
        System.out.println(" ----------------------------------");

        assertEquals(state.players.get(0).hand.size(), (testState.players.get(0).hand.size() + 1));
        assertEquals(state.players.get(0).numActions,(testState.players.get(0).numActions - 1 + newActions));

        System.out.println("\nTEST SUCCESSFULLY COMPLETED\n");
    }
}
