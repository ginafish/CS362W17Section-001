package dominion;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class playDominionTest {

	//KEEP GETTING ERRORS ABOUT INDEX OUT OF RANGE
	@SuppressWarnings("static-access")
	public void cleanPiles(){
		for(int i = 0; i < 13; i++) // clear out action card pile
			PlayDominion.AllDecks.getActionDeck().get(i).clear();
		PlayDominion.AllDecks.getActionDeck().clear();
		for(int i = 0; i < 4; i++) // clear out VC card pile
			PlayDominion.AllDecks.getVCDeck().get(i).clear();
		PlayDominion.AllDecks.getVCDeck().clear();
		for(int i = 0; i < 3; i++) // clear out VC card pile
			PlayDominion.AllDecks.getMoneyDeck().get(i).clear();
		PlayDominion.AllDecks.getMoneyDeck().clear();
	}
	@Test
	public void testCheckEmptyPile(){
		PlayDominion.Initialize_Game();
		Deck.getActionDeck().get(0).clear();
		assertEquals(PlayDominion.CheckifPileIsEmpty(0),true);
	}

	@Test
	public void testCheckMoneyPile(){
		Deck.Build_Money_Victory();
		assertEquals(PlayDominion.CheckMoneyPile(0),false);
		Deck.getMoneyDeck().get(0).clear();
		assertEquals(PlayDominion.CheckMoneyPile(0),true);

		for(int i = 0; i < 3; i++)
			Deck.getMoneyDeck().get(i).clear();
		for(int i = 0; i < 4; i++)
			Deck.getVCDeck().get(i).clear();

		Deck.getMoneyDeck().clear();
		Deck.getVCDeck().clear();
	}


	@Test 
	public void testGenPlayers(){
		List<Player>Players = PlayDominion.genPlayers();
		assertTrue(Players.size() >= 2);
	}
	
	@Test 
	public void testinitGame(){
		Player p = PlayDominion.Initialize_Game();
		assertTrue(p.GetDeck().size() == 5);
		assertTrue(p.get_PlayHand().size() == 5);
		assertTrue(p.getDiscard().size() == 0);
		assertTrue(p.get_Player_Gold() == 7);
		assertTrue(p.Get_Player_VP() == 3);
	}
	@Test
	public void testPlayGame(){
		PlayDominion.Initialize_Game();
		assertTrue(PlayDominion.Play_Game() >= 0);
	}
	
	
	@Test
	public void testTurn(){
		Cards c = new Cards("Copper",1,0, "Money",false);
		Player p = PlayDominion.Initialize_Game();
		List<Cards>curHand = p.get_PlayHand();
		for(int i = 0; i < 8; i++)
			p.get_PlayHand().add(c);
		assertEquals(PlayDominion.PlayerTurn(p),0);
		assertEquals(p.get_PlayHand().size(), 5);
		assertEquals(p.Player_Action_Turns, 1);
		assertEquals(p.Player_Buy_Turns,1);
	}
	@Test
	public void testNoGold(){
		Player p = PlayDominion.Initialize_Game();
		p.get_PlayHand().clear();
		assertEquals(PlayDominion.PlayerTurn(p),-1);
	}
}
