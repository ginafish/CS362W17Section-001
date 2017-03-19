/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 14:09:41 PDT 2017
 */
package org.cs362.dominion;


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(1, int0);
      assertEquals(2, card0.getCost());
  }

  @Test
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, card0.score());
      assertEquals(3, int0);
      assertEquals(6, card0.getCost());
  }

  @Test
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getCost();
      assertEquals(0, card0.score());
      assertEquals(2, int0);
      assertEquals(2, card0.getTreasureValue());
  }

  @Test
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals((-1), int0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
  }

  @Test
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "");
      player0.hand = list0;
      player0.endTurn();
      Card card1 = player0.drawCard();
      int int0 = card0.compareTo(card1);
      //  // Unstable assertion: assertEquals(5, card0.getCost());
      //  // Unstable assertion: assertEquals(11, int0);
  }

  @Test
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      assertNotNull(card0);
      
      Card.CardName card_CardName1 = Card.CardName.Festival;
      Card card1 = Card.getCard(list0, card_CardName1);
      int int0 = card0.compareTo(card1);
      assertEquals(0, card0.score());
      assertEquals((-14), int0);
      assertEquals(6, card0.getCost());
      assertEquals(3, card0.getTreasureValue());
  }

  @Test
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.compareTo(card0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(5, card0.getCost());
  }

  @Test
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card card1 = (Card)card0.clone();
      assertEquals(6, card1.getCost());
      assertEquals(0, card1.getTreasureValue());
      assertEquals(0, card1.score());
  }

  @Test
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card card0 = Card.getCard(list0, card_CardName0);
      boolean boolean0 = card0.equals(card0);
      assertEquals(1, card0.score());
      assertTrue(boolean0);
      assertEquals(2, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ".rOqQ6");
      boolean boolean0 = card0.equals(player0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(3, card0.getCost());
      assertFalse(boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Player player0 = new Player((GameState) null, "");
      player0.hand = list0;
      player0.endTurn();
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNull(card0);
  }

  @Test
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getCardName();
      assertEquals(2, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(2, card0.getTreasureValue());
  }

  @Test
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getType();
      assertEquals(2, card0.getCost());
      assertEquals(2, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "W\">");
      player0.hand = gameState0.cards;
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(5, card0.getCost());
      assertEquals(20, list0.size());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "\nDiscard: ");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(4, card0.getCost());
      assertEquals(2, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "\nDiscard: ");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(5, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ".rOqQ6");
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      List<Card> list0 = Card.createCards();
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4, card0.getCost());
  }

  @Test
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "W\">");
      card0.play(player0, gameState0);
      assertEquals(5, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Card Name \t\t NumberCards: \n");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(1, card0.score());
      assertEquals(3, card0.getCost());
  }

  @Test
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "\nDiscmard: ");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(4, card0.getCost());
  }

  @Test
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Festival;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "\nDiscmard: ");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(5, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "\nDiscmard: ");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4, card0.getCost());
  }

  @Test
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "\nDiscmard: ");
      card0.play(player0, gameState0);
      assertEquals(2, card0.getTreasureValue());
      assertEquals(2, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      Player player0 = new Player(gameState0, "TSh*Q<");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ".rOqQ6");
      card0.play(player0, gameState0);
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      Player player0 = new Player(gameState0, "TSh*Q<");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, int0);
  }

  @Test
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(list0, card_CardName0);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(0, card0.score());
      assertEquals(1, card0.getTreasureValue());
  }

  @Test
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(gameState0.cards, card_Type0);
      assertEquals(13, list1.size());
  }

  @Test
  public void test35()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      List<Card> list0 = Card.createCards();
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, int0);
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      String string0 = card0.toString();
      assertEquals(" \n\tCopper", string0);
      assertEquals(1, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.score());
  }
}
