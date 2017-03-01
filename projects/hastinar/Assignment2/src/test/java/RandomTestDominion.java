import org.junit.Test;

import dominion.Card;
import dominion.GameState;
import dominion.Randomness;
import dominion.Player;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//Created by Arman Hastings on 2/28/2017
public class RandomTestDominion
{

    public final List<Player> players = new ArrayList<Player>(); ;

    @Test
    public void SimpleTest()
    {
        List<Card> cards;
        GameState state;
        Randomness.reset(10);
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        Random rand = new Random();
        int rand =  rand.nextInt(5);
        if(rand < 2)                                                  //////            //////
        {
            Player player = new Player(state, "player 1");
            state.addPlayer(player);

            Player player2 = new Player(state, "player 2");
            state.addPlayer(player2);

            state.initializeGame();
            System.out.println("Initializing game...\nBoard:\n" + state.toString());
            HashMap<Player, Integer> players = state.play();
            for(Player p: players.keySet())
            {
                int i  = 1;
                System.out.println("Player: " + i +" Score: " + players.get(p));
                i = i +1;
                 //System.out.println("Player: " + p.player_username + " Score: " + players.get(p));
            }


        }
        else if (rand == 2)                         //////            //////            //////
        {
            Player player = new Player(state, "player 1");
            state.addPlayer(player);

            Player player2 = new Player(state, "player 2");
            state.addPlayer(player2);

            Player player3 = new Player(state, "player 3");
            state.addPlayer(player3);

            state.initializeGame();
            System.out.println("Initializing game...\nBoard:\n" + state.toString());
            HashMap<Player, Integer> players = state.play();
            int i  = 1;
            for(Player p: players.keySet())
            {

                System.out.println("Player: " + i +" Score: " + players.get(p));
                i = i +1;
                //System.out.println("Player: " + p.player_username + " Score: " + players.get(p));
            }


        }
        else                           //////         //////            //////            //////
        {
            Player player = new Player(state, "player 1");
            state.addPlayer(player);

            Player player2 = new Player(state, "player 2");
            state.addPlayer(player2);

            Player player3 = new Player(state, "player 3");
            state.addPlayer(player3);

            Player player4 = new Player(state, "player 4");
            state.addPlayer(player4);

            state.initializeGame();
            System.out.println("Initializing game...\nBoard:\n" + state.toString());
            HashMap<Player, Integer> players = state.play();
            for(Player p: players.keySet())
            {
                int i  = 1;
                System.out.println("Player: " + i +" Score: " + players.get(p));
                i = i +1;
                //System.out.println("Player: " + p.player_username + " Score: " + players.get(p));
            }


        }
    }

}
