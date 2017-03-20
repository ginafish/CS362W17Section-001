package org.cs362.dominion;

import java.util.*;


public class PlayDominion {

	   public  static void main(String args[]){
		   
		    List<Card> cards;
		    GameState state;
			//Randomness.reset(10);	   

			
			//the cards  are achieved by each element/constant in the enum class 
			cards = new ArrayList<Card>(Card.createCards());
			state = new GameState(cards);
			
		      Player player = new Player(state, "Player 1");
//		      player.printStateGame();
//		         player.hand.add(Card.getCard(cards,Card.CardName.Adventurer));
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
				 state.addPlayer(player);
		      
			  player = new Player(state, "Player 2");
//		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));
//		         player.hand.add(Card.getCard(cards,Card.CardName.Village));
		      state.addPlayer(player);		      
		      //Initialize the game!
		      state.initializeGame();
		      
		      //System.out.println("Initialization DominionBoard:\n " + state.toString());
		      
		      HashMap<Player, Integer> winners = state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: " + winners.get(p) );
		      }
		      
      	      player.printStateGame();
		      
		      
			System.exit(0);  

	   }
	
	
}