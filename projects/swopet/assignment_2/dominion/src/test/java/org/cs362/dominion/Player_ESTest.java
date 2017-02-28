/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:17:09 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.cs362.dominion.Card;
import org.cs362.dominion.Estate;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      gameState0.printWinner();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isToken();
      Player player0 = new Player(boolean0);
      player0.numCards = 0;
      int int0 = player0.getVictoryPoints();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Boolean boolean0 = new Boolean(true);
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, 29);
      player0.takeTurn(gameState0);
      player0.takeTurn(gameState0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isAttack();
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, 3);
      gameState0.actions = (-1150);
      player0.takeTurn(gameState0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isTreasure();
      Player player0 = new Player(boolean0);
      player0.getVictoryPoints();
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      player0.discard(8);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      Player player0 = new Player(boolean0);
      // Undeclared exception!
      try { 
        player0.takeTurn((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.revealHand();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((Boolean) null);
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.getVictoryPoints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((Boolean) null);
      // Undeclared exception!
      try { 
        player0.gainFrom((List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      Player player0 = new Player(boolean0);
      // Undeclared exception!
      try { 
        player0.drawCards(6, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, (-534));
      player0.takeTurn(gameState0);
      player0.discard = null;
      // Undeclared exception!
      try { 
        player0.discard(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isTreasure();
      Player player0 = new Player(boolean0);
      // Undeclared exception!
      try { 
        player0.discard((-2038));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isTreasure();
      Player player0 = new Player(boolean0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add(card0);
      player0.gainFrom(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isCurse();
      Player player0 = new Player(boolean0);
      List<Card> list0 = player0.deck;
      player0.discard = list0;
      MockRandom mockRandom0 = new MockRandom();
      Card card1 = player0.drawCard(mockRandom0);
      assertNull(card1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isCurse();
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom();
      Estate estate0 = (Estate)player0.drawCard(mockRandom0);
      assertNotNull(estate0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((Boolean) null);
      player0.getVictoryPoints();
      MockRandom mockRandom0 = new MockRandom();
      Estate estate0 = (Estate)player0.drawCard(mockRandom0);
      assertNotNull(estate0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isTreasure();
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom();
      List<Card> list0 = player0.drawCards((-501), mockRandom0);
      assertNotNull(list0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isTreasure();
      Player player0 = new Player(boolean0);
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      int int0 = player0.getVictoryPoints();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.play((GameState) null);
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, 3);
      List<Card> list0 = gameState0.trashMat;
      Card card1 = player0.gainFrom(list0);
      assertNull(card1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, (-534));
      player0.takeTurn(gameState0);
      player0.revealHand();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((Boolean) null);
      MockRandom mockRandom0 = new MockRandom();
      List<Card> list0 = player0.drawCards(400, mockRandom0);
      assertEquals(10, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, (-534));
      gameState0.buys = 3;
      player0.takeTurn(gameState0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      List<List<Card>> list0 = gameState0.victoryCards;
      gameState0.treasureCards = list0;
      Boolean boolean0 = gameState0.turn();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.treasure;
      Player player0 = new Player(boolean0);
      GameState gameState0 = new GameState(3, 3);
      player0.takeTurn(gameState0);
      player0.takeTurn(gameState0);
      player0.discard = null;
      MockRandom mockRandom0 = (MockRandom)gameState0.rand;
      // Undeclared exception!
      try { 
        player0.drawCard(mockRandom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      Boolean boolean0 = gameState0.turn();
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom();
      Estate estate0 = (Estate)player0.drawCard(mockRandom0);
      player0.trash(estate0, gameState0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.treasure;
      Player player0 = new Player(boolean0);
      // Undeclared exception!
      try { 
        player0.trash(card0, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      // Undeclared exception!
      try { 
        player0.discard(3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}