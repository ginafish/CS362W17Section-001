package org.cs362.dominion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;


public class SmithyTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   

		  List<Card> cards;
		  GameState state,testState;
		  Randomness.reset(10);

		  int newCards = 3;

		  cards = new ArrayList<Card>(Card.createCards());
		  state = new GameState(cards);

		  Random r = new Random();
		  int playersNum = r.nextInt( 4 - 2) + 4;

		  cards = new ArrayList<Card>(Card.createCards());
		  state = new GameState(cards);

		  Player player = new Player(state, "player-1");
		  player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
		  state.addPlayer(player);

		  player = new Player(state, "player-2");
		  state.addPlayer(player);

		  if (playersNum == 3) {

			  player = new Player(state, "player-3");
			  state.addPlayer(player);

		  } else if (playersNum == 4) {

			  player = new Player(state, "player-3");
			  state.addPlayer(player);

			  player = new Player(state, "player-4");
			  state.addPlayer(player);
		  }

		  System.out.println("Number Of Players is " + state.players.size());

		  	state.initializeGame();

		  	System.out.println("\n--------Player 1 Status--------");
		  	System.out.println("|                              			 ");
		  	System.out.println("|hand Count:" + state.players.get(0).hand.size());
		  	System.out.println("|" + state.players.get(0).hand);
		  	System.out.println("|Deck Count = " + state.players.get(0).deck.size());
		  	System.out.println("|" + state.players.get(0).deck);
		  	System.out.println(" -----------------------------------------");

		  	testState=(GameState) state.clone();

		  	HashMap<Player, Integer> winners=state.play();

		  	System.out.println("\n--------Player 1 Updated Status--------");
		  	System.out.println("|                              			 ");
		  	System.out.println("|hand Count:" + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards ) );
		  	System.out.println("|" + state.players.get(0).hand);
		  	System.out.println("|Deck Count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
		  	System.out.println("|" + state.players.get(0).deck);
		  	System.out.println(" -----------------------------------------");

		  	assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards ));
		  	assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ));

		  	System.out.println("\nTEST SUCCESSFULLY COMPLETED\n");
	   }
}
