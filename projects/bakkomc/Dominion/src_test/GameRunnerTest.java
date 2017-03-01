import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;

public class GameRunnerTest {

	// Random game test
	public void testRandomGame() {
		Random rand = new Random();
		int numPlayers = rand.nextInt(3) + 2;
		
		String[] kingdomNames = {"Adventurer","Ambassador","Baron",
				"Council Room","Cutpurse","Embargo",
				"Feast","Gardens","Great Hall",
				"Mine","Smithy","Village","Sea Hag"};
		String[] kingdomsUsed = new String[10];
		int[] notUse = new int[3];
		notUse[0] = rand.nextInt(13);
		notUse[1] = rand.nextInt(13);
		while(notUse[0] == notUse[1]){
			notUse[1] = rand.nextInt(13);
		}
		notUse[2] = rand.nextInt(13);
		while(notUse[0] == notUse[2] || notUse[1] == notUse[2]){
			notUse[2] = rand.nextInt(13);
		}
		
		int kingdomCount = 0;
		for (int i=0; i<13; i++){
			if (i!=notUse[0] && i!=notUse[1] && i!=notUse[2]){
				kingdomsUsed[kingdomCount] = kingdomNames[i];
				kingdomCount++;
			}
		}
		assertEquals(kingdomsUsed.length,10);
		
		String[] playerNames = {"Grant", "Susan", "Daren", "Alison"};
		
		GameRunner game = new GameRunner(playerNames, kingdomsUsed, numPlayers);
		
		// Commands
		String apt = "Autoplay Treasures";
		String endT = "End Turn";
		String endB = "End Actions";
		String buy = "buy ";
		
		// Random test money and victories
		while(!game.isGameOver())
		{
			game.runGameMove(apt);
			//game.printSate();
			
			// Action phase
			// Try to play full hand
			for (int i=0; i<15; i++){
				game.runGameMove(Integer.toString(i));
			}
			
			// Buy phase
			int action = rand.nextInt(30);
			// Prioritize province and gold then kingdoms
			if (action < 10)
				game.runGameMove(buy + "Province");
			else if(action >= 10 && action < 15)
				game.runGameMove(buy + "Gold");
			else if(action >= 15 && action < 20)
				game.runGameMove(buy + "Silver");
			else if(action == 20)
				game.runGameMove(buy + "Copper");
			else if(action == 21)
				game.runGameMove(buy + "Duchy");
			else if(action == 22)
				game.runGameMove(buy + "Estate");
			else if(action == 24)
				game.runGameMove(buy + "Curse");
			else{	// Random buy a kingdom
				int kingdomInt = rand.nextInt(10);
				game.runGameMove(buy + kingdomsUsed[kingdomInt]);
			}
		}
		
		game.wrapUpGame();
		game.printWinner();
		
	}
	
	@Test
	public void testManyRandomGames()
	{
		for(int i=0; i<50; i++){
			testRandomGame();
		}
	}

}
