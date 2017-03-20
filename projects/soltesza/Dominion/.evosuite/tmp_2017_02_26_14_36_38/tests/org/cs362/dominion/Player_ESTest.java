/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 22:44:47 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.cs362.dominion.Card;
import org.cs362.dominion.Deck;
import org.cs362.dominion.DominionBoard;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player("mv.?moBo9F;>e+smK", (DominionBoard) null);
      player0.deck = null;
      player0.GetName();
      player0.AddCoins(0);
      player0.GetName();
      // Undeclared exception!
      try { 
        player0.GetScore();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Random.setNextRandom(Integer.MAX_VALUE);
      Player player0 = null;
      try {
        player0 = new Player((String) null, (DominionBoard) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      GameState gameState0 = new GameState(dominionBoard0, 1);
      Player player0 = gameState0.currentPlayer;
      player0.Buy(58, 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player((String) null, dominionBoard0);
      player0.GetName();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.BuyCurse();
      dominionBoard0.GameOver();
      Player player0 = new Player("k'hu%ts0VF!-KS", dominionBoard0);
      dominionBoard0.PrintBoard();
      player0.AddBuys(1913);
      player0.AddActions(2701);
      player0.GetScore();
      DominionBoard dominionBoard1 = new DominionBoard();
      dominionBoard1.BuyCurse();
      Player player1 = new Player("k'hu%ts0VF!-KS", dominionBoard1);
      player1.GainCurse();
      player1.Buy((-1476), 0);
      dominionBoard1.GetBuyable(0);
      player1.EmbargoPile();
      player0.AddBuys(3);
      Player player2 = new Player("k'hu%ts0VF!-KS", dominionBoard0);
      // Undeclared exception!
      try { 
        player1.Buy(2701, 1913);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player("9pw%m*<{", dominionBoard0);
      player0.AddCoins((-1814));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player("~>@76=5t])3VHNIC%i", (DominionBoard) null);
      player0.GetScore();
      player0.deck = null;
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.EmbargoPile();
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
      Player player0 = new Player("mv.?moBo9F;>e+smK", (DominionBoard) null);
      player0.GetName();
      player0.AddCoins(0);
      player0.AddCoins(0);
      player0.GetName();
      player0.GetScore();
      // Undeclared exception!
      try { 
        player0.GainCurse();
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
      Player player0 = new Player("nJCY+t2~@+zocui", (DominionBoard) null);
      // Undeclared exception!
      try { 
        player0.TakeTurn((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.BuyCurse();
      Player player0 = new Player("", dominionBoard0);
      player0.GetName();
      GameState gameState0 = null;
      try {
        gameState0 = new GameState(dominionBoard0, (-2353));
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player("P|g20?", dominionBoard0);
      Deck deck0 = new Deck();
      player0.deck = deck0;
      player0.GetScore();
      player0.EmbargoPile();
      player0.EmbargoPile();
      player0.AddActions((-2279));
      player0.TrashFromHand();
      player0.GetName();
      player0.AddBuys(40);
      deck0.PlayTreasures();
      // Undeclared exception!
      try { 
        player0.TakeTurn((GameState) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player(" played ", dominionBoard0);
      player0.TrashFromHand();
      player0.GetScore();
      player0.AddActions(1598);
      player0.GetScore();
      player0.TrashFromHand();
      player0.AddBuys(3);
      player0.Buy(3, 0);
      player0.AddBuys(3);
      Deck deck0 = player0.deck;
      player0.deck = deck0;
      player0.AddActions(0);
      player0.AddCoins(0);
      player0.EmbargoPile();
      player0.deck = deck0;
      player0.GetScore();
      player0.EmbargoPile();
      player0.TrashFromHand();
      player0.GetScore();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player("Bao", dominionBoard0);
      player0.AddCoins(0);
      player0.GainCurse();
      player0.GetScore();
      player0.GainCurse();
      player0.TrashFromHand();
      player0.deck = null;
      // Undeclared exception!
      try { 
        player0.TrashFromHand();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      GameState gameState0 = new GameState(dominionBoard0, 4);
      Player player0 = gameState0.currentPlayer;
      player0.AddBuys(4);
      player0.Buy(4, 12);
      player0.TrashFromHand();
      player0.GainCurse();
      player0.AddBuys((-2080));
      dominionBoard0.PrintBoard();
      player0.Buy(4, (-2080));
      gameState0.currentPlayer.AddActions((-2809));
      gameState0.currentPlayer.Buy(0, 12);
      gameState0.currentPlayer.TrashFromHand();
      gameState0.currentPlayer.GetScore();
      player0.GetName();
      gameState0.PrintScore();
      gameState0.currentPlayer.GainCurse();
      Player player1 = new Player("Player 1", dominionBoard0);
      DominionBoard dominionBoard1 = new DominionBoard();
      Player player2 = new Player("Player 1", dominionBoard1);
      player2.Buy((-2809), 12);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player("_68Pz^H5A<m|", dominionBoard0);
      player0.GetName();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player("", dominionBoard0);
      // Undeclared exception!
      try { 
        player0.Buy(1519, 1519);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      GameState gameState0 = new GameState(dominionBoard0, 90);
      gameState0.TakeTurn();
      gameState0.currentPlayer.GetScore();
      gameState0.PrintScore();
      gameState0.DrawCards(gameState0.currentPlayer, 90);
      gameState0.currentPlayer.TrashFromHand();
      gameState0.currentPlayer.TakeTurn(gameState0);
      GameState gameState1 = new GameState(dominionBoard0, 90);
      gameState1.DrawCards(gameState0.currentPlayer, 90);
      gameState0.currentPlayer.AddActions(3);
      gameState1.currentPlayer.GainCurse();
      gameState1.DrawCards(gameState1.currentPlayer, 90);
      gameState0.currentPlayer.TakeTurn(gameState1);
      gameState0.currentPlayer.GainCurse();
      assertFalse(gameState0.equals((Object)gameState1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player("mv.?moBo9F;>e+smK", (DominionBoard) null);
      player0.AddCoins(0);
      assertEquals("mv.?moBo9F;>e+smK", player0.GetName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      Player player0 = new Player("P|g20?", dominionBoard0);
      Deck deck0 = new Deck();
      player0.EmbargoPile();
      player0.deck = deck0;
      player0.AddBuys((-2279));
      Card card0 = player0.TrashFromHand();
      assertNull(card0);
  }
}