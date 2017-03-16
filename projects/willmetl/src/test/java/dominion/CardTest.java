package dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CardTest{
  private GameState g;
  private Player a;
  private Player b;

  @Before
  public void initPlayer(){
    g = new GameState();
    a = new Player("Amy", g);
    g.addPlayer(a);
    b = new Player("Barney", g);
    g.addPlayer(b);
  }

  @Test
  public void testValuesCopper(){
    assertEquals(Card.COPPER.toString(), "Copper");
    assertEquals(Card.COPPER.getDesc(), "worth 1 money");
    assertEquals(Card.COPPER.getActionCost(), 0);
    assertEquals(Card.COPPER.getCost(), 0);
    // assertEquals(Card.COPPER.givesActions, 0);
    // assertEquals(Card.COPPER.givesCardDraws, 0);
    // assertEquals(Card.COPPER.givesMoney, 1);
    // assertEquals(Card.COPPER.givesVictoryPoints(), 0);
    assertEquals(Card.COPPER.getType(), Card.Type.TREASURE);
  }

  @Test
  public void testPlayCopper(){
    assertEquals(a.getMoney(), 0);
    Card.COPPER.play(a);
    assertEquals(a.getMoney(), 1);
  }

  @Test
  public void testPlayCurse(){
    assertEquals(a.getMoney(), 0);
    Card.CURSE.play(a);
    assertEquals(a.getMoney(), 0);
  }

  @Test
  public void testPlayAdventurer(){
    assertEquals(a.getHandSize(), 5);
    for(int i=0; i<5; i++) a.discardFromHand();
    assertEquals(a.getHandSize(), 0);
    assertEquals(a.countAllCards(), 10);
    assertEquals(Card.ADVENTURER.play(a), Card.ADVENTURER);
    assertEquals(a.getHandSize(), 2);
    assertTrue(a.isCardInHand(Card.COPPER));
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(a.countAllCards(), 10);
  }

  @Test
  public void testPlayAmbassador(){
    // Needs random choices enabled
    assertEquals(g.numPlayers, 2);
    assertEquals(5, a.getHandSize());
    assertEquals(5, b.getHandSize());
    assertEquals(Card.AMBASSADOR.play(a), Card.AMBASSADOR);
    assertEquals(4, a.getHandSize());
    assertEquals(5, b.getHandSize());
    assertEquals(9, a.countAllCards());
    assertEquals(11, b.countAllCards());
    for(int i=0; i<5; i++) a.discardFromHand();
    assertEquals(0, a.getHandSize());
    assertEquals(Card.AMBASSADOR.play(a), Card.AMBASSADOR);
    assertEquals(0, a.getHandSize());
    assertEquals(9, a.countAllCards());
    assertEquals(11, b.countAllCards());

    g = new GameState();
    b = new Player("Barney", g);
    g.addPlayer(b);
    a = new Player("Amy", g);
    g.addPlayer(a);
    assertEquals(Card.AMBASSADOR.play(b), Card.AMBASSADOR);
    assertEquals(4, b.getHandSize());
    assertEquals(5, a.getHandSize());
    assertEquals(9, b.countAllCards());
    assertEquals(11, a.countAllCards());
  }

  @Test
  public void testPlayBaron(){
    // Case: no Estate in hand, gain an Estate
    while(a.isCardInHand(Card.ESTATE)) a.discardFromHand(Card.ESTATE);
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(Card.BARON.play(a), Card.BARON);
    assertEquals(a.countAllCards(), 11);
    // Case: yes Estate in hand, gain 4 money
    assertEquals(a.getMoney(), 0);
    a.putInHand(Card.ESTATE);
    assertTrue(a.isCardInHand(Card.ESTATE));
    assertEquals(Card.BARON.play(a), Card.BARON);
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(a.getMoney(), 4);
  }

  @Test
  public void testPlayCouncilRoom(){
    assertEquals(a.getBuys(), 1);
    assertEquals(a.getHandSize(), 5);
    assertEquals(b.getHandSize(), 5);
    assertEquals(Card.COUNCILROOM.play(a), Card.COUNCILROOM);
    assertEquals(a.getBuys(), 2);
    assertEquals(a.getHandSize(), 9);
    assertEquals(b.getHandSize(), 6);
  }

  @Test
  public void testPlayCutpurse(){
    // case: opponent has at least one copper
    assertEquals(a.getMoney(), 0);
    b.putInHand(Card.ESTATE);
    assertEquals(b.getHandSize(), 6);
    assertEquals(Card.CUTPURSE.play(a), Card.CUTPURSE);
    assertEquals(a.getMoney(), 2);
    assertEquals(b.getHandSize(), 5);
    // case: opponent has no coppers
    while(b.isCardInHand(Card.COPPER)) b.discardFromHand(Card.COPPER);
    int i = b.getHandSize();
    a.putInHand(Card.CUTPURSE);
    assertEquals(a.playCard(Card.CUTPURSE), true);
    assertEquals(b.getHandSize(), i);
  }

  @Test
  public void testPlayEmbargo(){
    a.putInHand(Card.EMBARGO);
    assertEquals(a.getMoney(), 0);
    assertEquals(a.getHandSize(), 6);
    assertTrue(a.playCard(Card.EMBARGO));
    assertEquals(a.getMoney(), 2);
    assertEquals(a.getHandSize(), 5);
  }

  @Test
  public void testPlayFeast(){
    // assertFalse(a.playCard(Card.FEAST));
    a.putInHand(Card.FEAST);
    assertEquals(a.getHandSize(), 6);
    a.playCard(Card.FEAST);
    assertTrue(a.cardPile.contains(Card.SALVAGER));
    assertFalse(a.isCardInHand(Card.FEAST));
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.countAllCards(), 11);
    assertEquals(Card.FEAST.getCost(), 4);
  }

  @Test
  public void testPlayGardens(){
    assertEquals(a.countVictoryPoints(), 3);
    // assertFalse(a.playCard(Card.GARDENS));
    a.putInHand(Card.GARDENS);
    assertEquals(a.countAllCards(), 11);
    assertEquals(a.countVictoryPoints(), 4);
    for(int i=0; i<8; i++) a.putInHand(Card.COPPER);
    assertEquals(a.countAllCards(), 19);
    assertEquals(a.countVictoryPoints(), 4);
    a.putInHand(Card.COPPER);
    assertEquals(a.countAllCards(), 20);
    assertEquals(a.countVictoryPoints(), 5);
    a.putInHand(Card.COPPER);
    assertEquals(a.countVictoryPoints(), 5);
  }

  @Test
  public void testPlayGreatHall(){
    assertEquals(a.countVictoryPoints(), 3);
    assertEquals(a.getActions(), 1);
    assertEquals(a.getHandSize(), 5);
    a.discard(Card.GREAT_HALL.play(a));
    assertEquals(a.getActions(), 2);
    assertEquals(a.getHandSize(), 6);
    assertEquals(a.countVictoryPoints(), 4);
  }

  @Test
  public void testPlayMine(){
    while(a.isCardInHand(Card.COPPER)) a.discardFromHand(Card.COPPER);
    a.putInHand(Card.COPPER);
    assertTrue(a.isCardInHand(Card.COPPER));
    assertFalse(a.isCardInHand(Card.SILVER));
    assertFalse(a.isCardInHand(Card.GOLD));
    Card.MINE.play(a);
    assertFalse(a.isCardInHand(Card.COPPER));
    assertTrue(a.isCardInHand(Card.SILVER));
    assertFalse(a.isCardInHand(Card.GOLD));
    Card.MINE.play(a);
    assertFalse(a.isCardInHand(Card.COPPER));
    assertFalse(a.isCardInHand(Card.SILVER));
    assertTrue(a.isCardInHand(Card.GOLD));
    Card.MINE.play(a);
    assertFalse(a.isCardInHand(Card.COPPER));
    assertFalse(a.isCardInHand(Card.SILVER));
    assertTrue(a.isCardInHand(Card.GOLD));
  }

  @Test
  public void testPlaySalvager(){
    while(a.isCardInHand(Card.COPPER)) a.discardFromHand(Card.COPPER);
    while(a.isCardInHand(Card.ESTATE)) a.discardFromHand(Card.ESTATE);
    assertEquals(a.getHandSize(), 0);
    a.putInHand(Card.ESTATE);
    assertEquals(a.getBuys(), 1);
    assertEquals(a.getMoney(), 0);
    a.discard(Card.SALVAGER.play(a));
    a.seeDeck();
    assertEquals(a.getBuys(), 2);
    assertEquals(a.getMoney(), 2);
    assertFalse(a.isCardInHand(Card.ESTATE));
  }

  @Test
  public void testPlaySmithy(){
    assertEquals(a.getHandSize(), 5);
    Card.SMITHY.play(a);
    assertEquals(a.getHandSize(), 8);
  }

  @Test
  public void testPlayVillage(){
    assertEquals(a.getActions(), 1);
    assertEquals(a.getHandSize(), 5);
    Card.VILLAGE.play(a);
    assertEquals(a.getActions(), 3);
    assertEquals(a.getHandSize(), 6);
  }
}
