package dominion;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PlayerTest{
  private GameState g;
  private Player a;
  private Player b;

  @Before
  public void initPlayer(){
    g = new GameState();
  }

  @Test
  public void testAdders(){
    Player a = new Player("Amy", g);
    // addMoney
    assertEquals(0, a.getMoney());
    assertEquals(1, a.addMoney(1));
    assertEquals(1, a.getMoney());
    assertEquals(0, a.addMoney(-1));
    assertEquals(0, a.getMoney());
    // addActions
    assertEquals(1, a.getActions());
    assertEquals(2, a.addActions(1));
    assertEquals(2, a.getActions());
    // addBuys
    assertEquals(1, a.getBuys());
    assertEquals(2, a.addBuys(1));
    assertEquals(2, a.getBuys());
  }

  @Test
  public void testActionPhase(){
    Player a = new Player("Amy", g, true);
    assertEquals(10, a.countAllCards());
    a.newTurn();
    assertEquals(11, a.countAllCards());
    for(int i=0; i<5; i++) assertTrue(a.discardFromHand());
    assertEquals(a.putInHand(Card.VILLAGE), true);
    assertEquals(0, a.addActions(-1));
    assertEquals(0, a.addBuys(-1));
  }

  @Test
  public void testBuyCard(){
    Player a = new Player("Amy", g, true);
    for(int i=0; i<5; i++) assertTrue(a.discardFromHand());
    assertEquals(10, a.countAllCards());
    // a.newTurn();
    // assertEquals(11, a.countAllCards());
    // assertEquals(0, a.getBuys());
    // a.buyCard(Card.COPPER);
    // assertEquals(11, a.countAllCards());
    // assertEquals(0, a.getBuys());
  }

  @Test
  public void testChooseHand(){
    Player a = new Player("Amy", g, true);
    for(int i=0; i<5; i++){
      assertNotNull(a.chooseHand());
    }
    assertNull(a.chooseHand());
  }

  @Test
  public void testNewPlayer(){
    Player a = new Player("Amy", g);
    assertEquals(a.getActions(), 1);
    assertEquals(a.getBuys(), 1);
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.getMoney(), 0);
    assertEquals(a.getName(), "Amy");
    assertEquals(a.countAllCards(), 10);
    assertEquals(a.countVictoryPoints(), 3);
  }

  @Test
  public void testDiscardFromHand(){
    Player a = new Player("Amy", g);
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.countAllCards(), 10);
    assertTrue(a.discardFromHand(Card.COPPER));
    assertEquals(a.getHandSize(), 4);
    assertEquals(a.countAllCards(), 10);
    assertTrue(a.discardFromHand(Card.COPPER));
    assertTrue(a.discardFromHand());
    assertTrue(a.discardFromHand());
    assertEquals(a.getHandSize(), 1);
    assertTrue(a.discardFromHand());
    assertEquals(a.getHandSize(), 0);
    assertFalse(a.discardFromHand());
    assertEquals(a.getHandSize(), 0);
    assertEquals(a.countAllCards(), 10);
  }

  @Test
  public void testReturnCardToShared(){
    Player a = new Player("Amy", g);
    assertTrue(a.returnCardToShared(Card.COPPER));
  }

  @Test
  public void testTakeFreeCard(){
    Player a = new Player("Amy", g);
    for(int i=0; i<10; i++) assertEquals(g.takeCard(Card.CURSE), Card.CURSE);
    assertFalse(a.takeFreeCard(Card.CURSE));
  }

  @Test
  public void testPlayCard(){
    Player a = new Player("Amy", g);
    assertTrue(a.playCard(Card.EMBARGO));
    a.addActions(-1);
    assertFalse(a.playCard(Card.EMBARGO));
    a.putInHand(Card.VILLAGE);
  }

  @Test
  public void testPutInHand(){
    Player a = new Player("Amy", g);
    assertEquals(a.putInHand(Card.SILVER), true);
  }
}
