/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:53:07 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.valueOf("VICTORY");
      assertEquals(Card.Type.VICTORY, card_Type0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.valueOf("Estate");
      assertEquals(Card.CardName.Estate, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card.Type[] card_TypeArray0 = Card.Type.values();
      assertNotNull(card_TypeArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName[] card_CardNameArray0 = Card.CardName.values();
      assertNotNull(card_CardNameArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Minion;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 12);
      int int0 = card0.score();
      assertEquals(0, card0.getCost());
      assertEquals(0, int0);
      assertEquals(12, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Minion;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, card0.score());
      assertEquals(5, card0.getCost());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 4200, 4200, (-772));
      int int0 = card0.getTreasureValue();
      assertEquals(4200, card0.score());
      assertEquals(4200, card0.getCost());
      assertEquals((-772), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 39, 938);
      int int0 = card0.getCost();
      assertEquals(39, card0.score());
      assertEquals(938, card0.getTreasureValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 2456, 0, 30);
      int int0 = card0.getCost();
      assertEquals(2456, int0);
      assertEquals(0, card0.score());
      assertEquals(30, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(1, int0);
      assertEquals(2, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertEquals(-1, card0.score());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.filter(list0, card_Type0);
      Card.Type card_Type1 = Card.Type.TREASURE;
      Card.filter(list1, card_Type1);
      assertEquals(13, list1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 8, (-1), 2404);
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName1 = Card.CardName.Mine;
      Card card1 = Card.getCard(list0, card_CardName1);
      int int0 = card1.compareTo(card0);
      assertEquals(2404, card0.getTreasureValue());
      assertEquals(5, card1.getCost());
      assertEquals(5, int0);
      assertEquals(-1, card0.score());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 8, (-1), 2404);
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName1 = Card.CardName.Mine;
      Card card1 = Card.getCard(list0, card_CardName1);
      int int0 = card0.compareTo(card1);
      assertEquals(5, card1.getCost());
      assertEquals(-1, card0.score());
      assertEquals(2404, card0.getTreasureValue());
      assertEquals((-5), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card card1 = card0.clone();
      assertEquals(0, card1.getTreasureValue());
      assertEquals(6, card1.getCost());
      assertEquals(0, card1.score());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 39, 938);
      Card card1 = card0.clone();
      assertEquals(938, card1.getTreasureValue());
      assertEquals(39, card1.score());
      assertEquals(0, card1.getCost());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 4200, 4200, (-772));
      Card card1 = card0.clone();
      assertEquals(-772, card1.getTreasureValue());
      assertEquals(4200, card1.getCost());
      assertEquals(4200, card1.score());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 8, (-1), 2404);
      // Undeclared exception!
      try {
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      // Undeclared exception!
      try {
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
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
  public void test20()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card card0 = new Card(card_CardName0, card_Type0, (-1819), 0, 0);
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
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getCardName();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
      assertEquals(6, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 2456, 0, 30);
      boolean boolean0 = card0.equals(card0);
      assertEquals(0, card0.score());
      assertTrue(boolean0);
      assertEquals(30, card0.getTreasureValue());
      assertEquals(2456, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 4200, 4200, (-772));
      boolean boolean0 = card0.equals(" \tBaron-TREASURE   \t Cost: 4200 \t Score: 4200 \tTreasure Value: -772");
      assertEquals(-772, card0.getTreasureValue());
      assertFalse(boolean0);
      assertEquals(4200, card0.getCost());
      assertEquals(4200, card0.score());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list1 = Card.filter(list0, card_Type0);
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card card0 = Card.getCard(list1, card_CardName0);
      assertEquals(5, list1.size());
      assertNull(card0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-597), (-597), 2427);
      int int0 = card0.score();
      assertEquals((-597), int0);
      assertEquals(-597, card0.getCost());
      assertEquals(2427, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-597), (-597), 2427);
      String string0 = card0.toString();
      assertEquals(" \tMine-ACTION   \t Cost: -597 \t Score: -597 \tTreasure Value: 2427", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-597), (-597), 2427);
      int int0 = card0.getTreasureValue();
      assertEquals(-597, card0.getCost());
      assertEquals(-597, card0.score());
      assertEquals(2427, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-597), (-597), 2427);
      Card card1 = card0.clone();
      assertEquals(-597, card1.getCost());
      assertEquals(-597, card1.score());
      assertEquals(2427, card1.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);

      card0.getType();
      assertEquals(1, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 4200, 4200, (-772));
      card0.compareTo(card0);
      assertEquals(4200, card0.getCost());
      assertEquals(4200, card0.score());
      assertEquals(-772, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-597), (-597), 2427);
      int int0 = card0.getCost();
      assertEquals(2427, card0.getTreasureValue());
      assertEquals((-597), int0);
      assertEquals(-597, card0.score());
  }
}
