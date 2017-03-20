package dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dominion.Card.CardName;
import dominion.Card.Type;

public class PlayerTest {

	private static ArrayList<Card> cards;
	private static ArrayList<Card> cards1;
	private static ArrayList<Card> cards2;
	
	private static GameState gs;
	private static GameState gs1;
	private static GameState gs2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		cards = new ArrayList<Card>(Card.createCards());
		gs = new GameState(cards);
		Randomness.reset(10);
		Player player = new Player(gs, "player-1");
		player.hand.add(Card.getCard(gs.cards, Card.CardName.Gardens));
		gs.addPlayer(player);
		player = new Player(gs, "player-2");
		gs.addPlayer(player);		      
		//Initialize the game!
		gs.initializeGame();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		cards1 = new ArrayList<Card>(Card.createCards());
		gs1 = new GameState(cards1);
		Randomness.reset(10);
		Player player = new Player(gs1, "player-1");
		gs1.addPlayer(player);
		player = new Player(gs1, "player-2");
		gs1.addPlayer(player);		      
		//Initialize the game!
		gs1.initializeGame();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWholeGame() {
		
		HashMap<Player, Integer> winners=gs.play();
		 for(Player p: winners.keySet()){
		    	System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		    }
		    
		 System.out.println(gs.toString());
		 
		 assertTrue(gs.empty_piles >= 1);
		 if(gs.empty_piles == 1)
			 assertTrue(gs.gameBoard.get(Card.getCard(gs.cards, Card.CardName.Province)) == 0);
		
	}
	
	@Test
	public void testPlayKingdomCardsBranchesTest(){
		cards1 = new ArrayList<Card>(Card.createCards());
		gs1 = new GameState(cards1);
		Randomness.reset(10);
		Player player = new Player(gs1, "player-1");
		gs1.addPlayer(player);
		player = new Player(gs1, "player-2");
		gs1.addPlayer(player);		      
		//Initialize the game!
		gs1.initializeGame();
		
		 Player p = gs1.players.get(0);

		 //Tests Mine
		 p.all_coppers();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Mine));
		 p.playKingdomCard();
		 p.playTtreasureCard();
		 assertTrue(p.hand.contains(Card.getCard(gs1.cards, Card.CardName.Silver)));
		 assertTrue(p.hand.size() >= 5);
		 p.endTurn();
		 
		 p.all_coppers();
		 p.hand.add(0, Card.getCard(gs1.cards, Card.CardName.Silver));
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Mine));
		 p.playKingdomCard();
		 p.playTtreasureCard();
		 assertTrue(p.hand.contains(Card.getCard(gs1.cards, Card.CardName.Gold)));
		 assertTrue(p.hand.size() >= 5);
		 p.endTurn();
		 
		 //Test Baron coppers
		 p.all_coppers();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Estate));
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Baron));
		 p.playTtreasureCard();
		 p.playKingdomCard();
		 assertTrue(p.coins >= 4);
		 p.endTurn();
		 
		 //Test Embargo
		 
		 p.all_coppers();
		 p.playTtreasureCard();
		 int before_coins = p.coins;
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Embargo));
		 p.playKingdomCard();
		 assertEquals(p.coins, before_coins + 2);
		 assertEquals(p.numActions, 0);
		 assertTrue(!(p.discard.contains(Card.getCard(gs1.cards, Card.CardName.Embargo))));
		 p.endTurn();
		 
		 //Test Great_Hall
		 
		 p.all_coppers();
		 p.playTtreasureCard();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Great_Hall));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.numActions, 2);
		 p.endTurn();
		 
		 //Test Village
		 p.all_coppers();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Village));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.numActions, 3);
		 p.endTurn();
		 
		 //Test Adventurer
		 p.all_coppers();
		 int hand_size = p.hand.size();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Adventurer));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.hand.size(),hand_size + 3);
		 p.endTurn();
		 
		//Test Council Room
		 p.all_coppers();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Council_Room));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.numBuys, 2);
		 p.endTurn();
		 
		//Test Feast
		 p.all_coppers();
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Feast));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.numBuys, 1);
		 p.endTurn();
		 
		 //Test Steward
		 p.all_coppers();
		 p.playTtreasureCard();
		 before_coins = p.coins;
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Steward));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.coins, before_coins + 2);
		 p.endTurn();
		 
		 //Test Cutpurse
		 p.all_coppers();
		 before_coins = p.coins;
		 p.hand.add(Card.getCard(gs1.cards, Card.CardName.Cutpurse));
		 p.hand.get(p.hand.size() - 1).play(p, gs1);
		 assertEquals(p.coins, before_coins + 2);
		 p.endTurn();
	}
	
	@Test
	public void testPlayTreasureCardsBranchesTest(){
		Player p = gs.players.get(1);
		Card c = Card.getCard(gs.cards, Card.CardName.Copper);
		p.hand.add(c);
		p.hand.add(c);
		p.hand.add(c);
		p.hand.add(c);
		
		p.playTtreasureCard();
		int cscore = 0;
		
		for(Card d : p.hand){
			cscore += d.getTreasureValue();
		}
		p.buyCard();
		assertEquals(p.coins, cscore);
	}
	
	@Test
	public void testBuyCardsBranchesTest(){
		Player p = gs1.players.get(1);
		p.endTurn();
		p.hand.clear();
		Card c = Card.getCard(gs1.cards, Card.CardName.Smithy);
		p.hand.add(c);
		p.playKingdomCard();
		assertTrue(!p.playedCards.isEmpty());
		p.endTurn();
		
		p.all_coppers();
		p.hand.add(Card.getCard(gs1.cards, Card.CardName.Gold));
		p.playTtreasureCard();
		p.buyCard();
		assertTrue(p.discard.contains(Card.getCard(gs1.cards, Card.CardName.Province)));
		p.endTurn();
		
		p.all_coppers();
		p.playTtreasureCard();
		p.coins = p.coins - 2;
		p.buyCard();
		assertEquals(p.discard.get(p.discard.size()-1), Card.getCard(gs1.cards, Card.CardName.Silver));
		
		p.all_coppers();
		int prev_supply_value = gs1.gameBoard.get(Card.getCard(gs1.cards, Card.CardName.Silver));
		p.buy_to_hand(Card.getCard(gs1.cards, Card.CardName.Silver));
		int new_supply_value = gs1.gameBoard.get(Card.getCard(gs1.cards, Card.CardName.Silver));
		assertTrue(new_supply_value  < prev_supply_value);
		
		
	}
	
	@Test
	public void testGamePlayerSizeTest(){
		cards2 = new ArrayList<Card>(Card.createCards());
		gs2 = new GameState(cards2);
		Randomness.reset(10);
		Player player = new Player(gs2, "player-1");
		gs2.addPlayer(player);
		player = new Player(gs2, "player-2");
		gs2.addPlayer(player);	
		//Initialize the game!
		gs2.initializeGame();
		
		
		
	}
}
