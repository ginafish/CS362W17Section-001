/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:24:05 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Card;
import dominion.GameState;
import dominion.Player;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.PROVINCE;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "coinss: ");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MILITIA;
      Vector<Card> vector0 = new Vector<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1148), (-476), (-476));
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, (String) null);
      int int0 = card0.score(player0);
      assertEquals(-1148, card0.getCost());
      assertEquals((-476), int0);
      assertEquals(-476, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.ARTISAN;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTOR7");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MERCHANT;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, int0);
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.DUCHY;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1, (-1054), (-1825));
      int int0 = card0.getTreasureValue();
      assertEquals((-1825), int0);
      assertEquals(1, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MERCHANT;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.REMODEL;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-4308), (-4308), 0);
      int int0 = card0.getCost();
      assertEquals((-4308), int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.COPPER;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1, 0, 1);
      card0.getCardName();
      assertEquals(1, card0.getCost());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.COPPER;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.BANDIT;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1589), (-1589), (-1589));
      Vector<Card> vector0 = new Vector<Card>(587, 0);
      vector0.add(card0);
      Card.getCard(vector0, card_CardName0);
      assertEquals("[ \tBANDIT-TREASURE \t\t Cost: -1589 \t\t Score: -1589 \tTreasure Value: -1589]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.ESTATE;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 2041, (-1632), (-1632));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      card0.getByType(linkedList0, card_Type0);
      assertEquals(2041, card0.getCost());
      assertEquals(-1632, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.createCards();
      Card.Type card_Type1 = Card.Type.VICTORY;
      List<Card> list1 = Card.filter(list0, card_Type1);
      List<Card> list2 = Card.filter(list1, card_Type0);
      assertTrue(list2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.VILLAGE;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 27, 0);
      Card.CardName card_CardName1 = Card.CardName.CELLAR;
      Card card1 = new Card(card_CardName1, card_Type0, 27, 27, (-1247));
      int int0 = card0.compareTo(card1);
      assertEquals(12, card0.getCost());
      assertEquals(6, int0);
      assertEquals(-1247, card1.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MERCHANT;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      Card.CardName card_CardName1 = Card.CardName.THRONE_ROOM;
      Card card1 = new Card(card_CardName1, card_Type0, 1782, 0, 0);
      int int0 = card0.compareTo(card1);
      assertEquals(1782, card1.getCost());
      assertEquals((-11), int0);
      assertEquals(0, card1.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.BANDIT;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1589), (-1589), (-1589));
      Vector<Card> vector0 = new Vector<Card>(587, 0);
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.SMITHY;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MARKET;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 40, 40, (-747));
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        card0.getByType(arrayList0, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      assertEquals(33, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.LIBRARY;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1360), (-1360), (-1360));
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.DUCHY;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1825), 1, 1);
      card0.hashCode();
      assertEquals(-1825, card0.getCost());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "Hr13wVto8FzNU|%&Yc");
      LinkedList<Card> linkedList0 = player0.deck;
      Card.CardName card_CardName0 = Card.CardName.MONEYLENDER;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 926, (-2453), (-2453));
      linkedList0.add(card0);
      assertEquals(-2453, card0.getTreasureValue());
      assertEquals(926, card0.getCost());
      
      boolean boolean0 = linkedList0.containsAll(gameState0.availCards);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.HARBINGER;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 2680, 1606, (-1435));
      boolean boolean0 = card0.equals(card0);
      assertEquals(-1435, card0.getTreasureValue());
      assertTrue(boolean0);
      assertEquals(2680, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.MERCHANT;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      card0.getType();
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CELLAR;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 396, 396, 25);
      card0.getCardName();
      assertEquals(396, card0.getCost());
      assertEquals(25, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.HARBINGER;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
      player0.discard = list0;
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.ESTATE;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1461, 0, 1461);
      Player player0 = new Player((GameState) null, (String) null);
      int int0 = card0.score(player0);
      assertEquals(1461, card0.getCost());
      assertEquals(1461, card0.getTreasureValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.DUCHY;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1825), 1, 1);
      boolean boolean0 = card0.equals(card_Type0);
      assertFalse(boolean0);
      assertEquals(-1825, card0.getCost());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "Hr13wVto8FzNU|%&Yc");
      LinkedList<Card> linkedList0 = player0.deck;
      Card.CardName card_CardName0 = Card.CardName.MONEYLENDER;
      Card card0 = Card.getCard(linkedList0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.ESTATE;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.WITCH;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTOR7");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.SENTRY;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTOR7");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.MARKET;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.LABORATORY;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTOR7");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.FESTIVAL;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.COUNCIL_ROOM;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "0ORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.BANDIT;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "0ORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.THRONE_ROOM;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "0ORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.SMITHY;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "0ORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.REMODEL;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.POACHER;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.GARDENS;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.BUREAUCRAT;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.WORKSHOP;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.VILLAGE;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.VASSAL;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.MERCHANT;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.MOAT;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.CHAPEL;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.CELLAR;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "VICTORY");
      player0.hand = list0;
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.ESTATE;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 2041, (-1632), (-1632));
      int int0 = card0.getCost();
      assertEquals(2041, int0);
      assertEquals(-1632, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.DUCHY;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1825), 1, 1);
      List<Card> list0 = Card.createCards();
      List<Card> list1 = card0.getByType(list0, card_Type0);
      assertEquals(-1825, card0.getCost());
      assertEquals(0, list1.size());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.DUCHY;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1825), 1, 1);
      int int0 = card0.getTreasureValue();
      assertEquals(1, int0);
      assertEquals(-1825, card0.getCost());
  }
}