/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 08:02:40 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Board;
import org.cs362.dominion.Card;
import org.cs362.dominion.CardType;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getVictoryPoints();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[3];
      Card card0 = new Card("nqbrrgX*", 170, (-4150), 170, cardTypeArray0);
      int int0 = card0.getVictoryPoints();
      assertEquals(170, card0.getTreasure());
      assertEquals((-4150), int0);
      assertEquals(170, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getTreasure();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[3];
      Card card0 = new Card("", 14, 14, 14, cardTypeArray0);
      int int0 = card0.getTreasure();
      assertEquals(14, card0.getVictoryPoints());
      assertEquals(14, card0.getCost());
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card();
      String string0 = card0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[1];
      Card card0 = new Card("6}]", (-2612), 13, (-1220), cardTypeArray0);
      int int0 = card0.getCost();
      assertEquals(13, card0.getVictoryPoints());
      assertEquals((-2612), int0);
      assertEquals(-1220, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card card0 = null;
      try {
        card0 = new Card((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card card0 = null;
      try {
        card0 = new Card("\n", Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, (CardType[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[3];
      Card card0 = new Card("nqbrrgX*", 170, (-4150), 170, cardTypeArray0);
      card0.getName();
      assertEquals(-4150, card0.getVictoryPoints());
      assertEquals(170, card0.getCost());
      assertEquals(170, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[3];
      CardType cardType0 = CardType.Treasure;
      cardTypeArray0[0] = cardType0;
      Card card0 = new Card("nqbrrgX*", 170, (-4150), 170, cardTypeArray0);
      boolean boolean0 = card0.isCardType(cardTypeArray0[2]);
      assertEquals(170, card0.getTreasure());
      assertTrue(boolean0);
      assertEquals(-4150, card0.getVictoryPoints());
      assertEquals(170, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[0];
      Card card0 = new Card("%h:%m:%s%z", 1970, 1970, 1903, cardTypeArray0);
      CardType cardType0 = CardType.Action;
      boolean boolean0 = card0.isCardType(cardType0);
      assertEquals(1970, card0.getVictoryPoints());
      assertEquals(1970, card0.getCost());
      assertFalse(boolean0);
      assertEquals(1903, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[1];
      Card card0 = new Card("6}]", (-2612), 13, (-1220), cardTypeArray0);
      Card card1 = new Card(card0);
      assertEquals(-2612, card1.getCost());
      assertEquals(13, card1.getVictoryPoints());
      assertEquals(-1220, card1.getTreasure());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[2];
      Card card0 = new Card(")2?", 995, 995, (-1399), cardTypeArray0);
      int int0 = card0.getTreasure();
      assertEquals(995, card0.getVictoryPoints());
      assertEquals(995, card0.getCost());
      assertEquals((-1399), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getCost();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[2];
      Card card0 = new Card(")2?", 995, 995, (-1399), cardTypeArray0);
      int int0 = card0.getVictoryPoints();
      assertEquals(995, int0);
      assertEquals(995, card0.getCost());
      assertEquals(-1399, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[2];
      Card card0 = new Card(")2?", 995, 995, (-1399), cardTypeArray0);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      card0.Action(arrayList0, (Player) null, board0);
      assertEquals(995, card0.getCost());
      assertEquals(-1399, card0.getTreasure());
      assertEquals(995, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[3];
      Card card0 = new Card("", 14, 14, 14, cardTypeArray0);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      card0.Attack(arrayList0, (Player) null, board0);
      assertEquals(14, card0.getVictoryPoints());
      assertEquals(14, card0.getTreasure());
      assertEquals(14, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[2];
      Card card0 = new Card(")2?", 995, 995, (-1399), cardTypeArray0);
      card0.Reaction();
      assertEquals(995, card0.getVictoryPoints());
      assertEquals(-1399, card0.getTreasure());
      assertEquals(995, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[2];
      Card card0 = new Card(")2?", 995, 995, (-1399), cardTypeArray0);
      int int0 = card0.getCost();
      assertEquals(995, card0.getVictoryPoints());
      assertEquals(-1399, card0.getTreasure());
      assertEquals(995, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CardType[] cardTypeArray0 = new CardType[2];
      Card card0 = new Card(")2?", 995, 995, (-1399), cardTypeArray0);
      card0.print();
      assertEquals(-1399, card0.getTreasure());
      assertEquals(995, card0.getVictoryPoints());
      assertEquals(995, card0.getCost());
  }
}
