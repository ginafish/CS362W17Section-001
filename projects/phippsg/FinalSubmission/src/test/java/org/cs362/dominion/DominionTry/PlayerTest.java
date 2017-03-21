package org.cs362.dominion.DominionTry;

import static org.junit.Assert.*;  
  
import org.junit.Test;  
  
public class PlayerTest {  
  
  @Test (timeout = 4000)
  public void testConstructor() {
    Player testPlayer = new Player();
    assertEquals(0, testPlayer.getHandSize());
  }
    
  @Test (timeout = 4000)
  public void testGain() {
    Player testPlayer = new Player();
    testPlayer.gain(new Card("Copper"));  
    assertEquals(0, testPlayer.getHandSize());  
    testPlayer.gainToHand(new Card("Silver"));  
    assertEquals(1, testPlayer.getHandSize());  
  }
    
  @Test (timeout = 4000)
  public void testInitialize() {  
    Player testPlayer = new Player(); 
    assertEquals(0, testPlayer.getHandSize());
    testPlayer.initilizeDeck();  
    assertEquals(5, testPlayer.getHandSize());  
  }
  
	/*@Test (timeout = 4000)
	public void testHandPlay() {
		Player testPlayer = new Player();
		testPlayer.initilizeDeck();
		testPlayer.printHand();
		assertEquals(5, testPlayer.getHandSize());
		testPlayer.playAction();
		assertEquals(4, testPlayer.getHandSize());
	}
	
	@Test (timeout = 4000)
	public void testHandRefresh() {
		Player testPlayer = new Player();
		testPlayer.initilizeDeck();
		for(int i = 0; i < 5; ++i) {
			testPlayer.playAction();
		}
		testPlayer.drawCard(1);
		assertEquals(1, testPlayer.getHandSize());
	}*/
}
