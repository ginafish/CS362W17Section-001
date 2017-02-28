package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class SmithyTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game
			cards = new ArrayList<Card>(Card.createCards());
		  	state = new GameState(cards);
//
		  	Player player = new Player(state, "player-1");
		  	player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		  	state.addPlayer(player);
		  	player = new Player(state, "player-2");
		  	state.addPlayer(player);

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
