/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 09:03:30 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "z/SQ1Z?oA@J@2y1");
      player0.playedCards = gameState0.cards;
      player0.endTurn();
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(6, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.valueOf("Remodle");
      assertEquals(Card.CardName.Remodle, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card.Type[] card_TypeArray0 = Card.Type.values();
      assertNotNull(card_TypeArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.Type.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName[] card_CardNameArray0 = Card.CardName.values();
      assertNotNull(card_CardNameArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(2, card0.getCost());
      assertEquals(1, int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(0, card0.getCost());
      assertEquals((-1), int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getCost();
      assertEquals(0, card0.score());
      assertEquals(1, card0.getTreasureValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(treeSet0, card_Type0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Province;
      Card card1 = Card.getCard(list0, card_CardName1);
      int int0 = card0.compareTo(card1);
      assertEquals(6, card1.score());
      assertEquals(2, int0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card1.getTreasureValue());
      assertEquals(1, card0.score());
      assertEquals(8, card1.getCost());
      assertEquals(2, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Remodle;
      Card card1 = Card.getCard(list0, card_CardName1);
      int int0 = card0.compareTo(card1);
      assertEquals(0, card1.getTreasureValue());
      assertEquals((-4), int0);
      assertEquals(4, card1.getCost());
      assertEquals(0, card1.score());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card card1 = (Card)card0.clone();
      assertEquals(0, card1.getTreasureValue());
      assertEquals(0, card1.getCost());
      assertEquals(-1, card1.score());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.Type card_Type0 = card0.getType();
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card card0 = Card.getCard(list0, card_CardName0);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      boolean boolean0 = card0.equals(list0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertFalse(boolean0);
      assertEquals(-1, card0.score());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.equals(card0);
      assertEquals(6, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card card0 = Card.getCard(vector0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      String string0 = card0.toString();
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(" \n\tFeast", string0);
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getCardName();
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodle;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState1.useingCards = gameState1.cards;
      Player player0 = new Player(gameState1, "z/SQ1Z?oA@J@2y1");
      player0.hand = gameState1.useingCards;
      // Undeclared exception!
      try { 
        card0.play(player0, gameState1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodle;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = new GameState(list0);
      gameState1.useingCards = gameState1.cards;
      Player player0 = new Player(gameState1, "z/SQ1Z?oA@J@2qy1");
      player0.playedCards = gameState0.cards;
      player0.endTurn();
      card0.play(player0, gameState1);
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodle;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = new GameState(list0);
      gameState1.useingCards = gameState1.cards;
      Player player0 = new Player(gameState1, "z/SQ1Z?oA@J@2qy1");
      player0.playedCards = gameState0.cards;
      player0.hand = gameState1.useingCards;
      card0.play(player0, gameState1);
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      gameState0.useingCards = gameState0.cards;
      Player player0 = new Player(gameState0, "Op(LZ9>gh^O=M^Ya8HJ");
      player0.hand = gameState0.useingCards;
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "z/SQ1Z?oA@J@2y1");
      player0.playedCards = list0;
      player0.endTurn();
      assertTrue(list0.isEmpty());
      
      card0.play(player0, gameState0);
      assertEquals(5, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState1.useingCards = gameState1.cards;
      Player player0 = new Player(gameState1, "z/SQ1Z?oA@J@2y1");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " \n\t");
      gameState0.addPlayer(player0);
      GameState gameState1 = gameState0.clone();
      player0.hand = gameState1.cards;
      Player player1 = new Player(gameState1, " \n\t");
      card0.play(player1, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " \n\t");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, " \n\t");
      card0.play(player1, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " \n\t");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "");
      card0.play(player1, gameState0);
      assertEquals(5, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(5, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState1.useingCards = gameState1.cards;
      Player player0 = new Player(gameState1, "z/SQ1Z?oA@J@2y1");
      player0.hand = gameState1.useingCards;
      card0.play(player0, gameState1);
      assertEquals(0, card0.score());
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list1 = Card.filter(list0, card_Type0);
      GameState gameState0 = new GameState(list1);
      Player player0 = new Player(gameState0, " \n\tAmbassador");
      player0.hand = list1;
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " \n\tAmbassador");
      player0.hand = list0;
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "cX^N/zkO/am6(Ms");
      Player player1 = player0.clone();
      GameState gameState0 = new GameState(list0);
      player1.discard = list0;
      card0.play(player1, gameState0);
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "");
      card0.play(player0, (GameState) null);
      assertEquals(1, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " ");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "");
      card0.play(player0, (GameState) null);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "z/SQ1Z?oA@J@2y1");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(5, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "Mine");
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(1, card0.score());
      assertEquals(3, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "0u");
      card0.play(player0, gameState0);
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "z/SQ1Z?oA@J@2y1");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " \n\tAmbassador");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(3, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodle;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.compareTo(card0);
      assertEquals(0, card0.score());
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      int int0 = card0.getCost();
      assertEquals(0, card0.score());
      assertEquals(3, int0);
      assertEquals(0, card0.getTreasureValue());
  }
}