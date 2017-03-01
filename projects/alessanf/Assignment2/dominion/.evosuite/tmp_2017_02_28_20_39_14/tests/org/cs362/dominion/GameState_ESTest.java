/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 01 04:45:20 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, "", 0);
      List<Card> list1 = player0.playedCards;
      player0.drawCard();
      gameState0.addPlayer(player0);
      hashMap0.put(card0, (Integer) 0);
      gameState0.gameBoard = hashMap0;
      gameState0.embargo = (-933);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Player player0 = new Player(gameState0, "", 0);
      Player player1 = player0.clone();
      player1.drawCard();
      hashMap0.put((Card) null, (Integer) null);
      hashMap0.entrySet();
      gameState0.gameBoard = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Stack<Player> stack0 = new Stack<Player>();
      gameState0.players = (List<Player>) stack0;
      Player player0 = new Player(gameState0, "C0o\"E0sgX5r+/", 30);
      gameState0.play();
      Player player1 = player0.clone();
      player0.numAdventurer = 4;
      player1.hand = list0;
      gameState0.addPlayer(player1);
      GameState gameState1 = gameState0.clone();
      gameState1.getWinners();
      gameState0.getWinners();
      gameState0.isGameOver();
      List<Player> list1 = gameState1.players;
      gameState0.addPlayer(player1);
      gameState1.isGameOver();
      gameState1.isGameOver();
      // Undeclared exception!
      try { 
        Card.CardName.valueOf("@} Wk-k7q#PZv");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.CardName.@} Wk-k7q#PZv
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      gameState0.players = (List<Player>) linkedList0;
      Player player0 = new Player(gameState0, "Cutpurse", 0);
      gameState0.addPlayer(player0);
      GameState gameState1 = gameState0.clone();
      GameState gameState2 = new GameState(gameState0.cards);
      Player player1 = new Player(gameState2, "", 0);
      gameState1.addPlayer(player1);
      GameState gameState3 = gameState1.clone();
      // Undeclared exception!
      try { 
        gameState3.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.cards = null;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Card.CardName.values();
      gameState0.embargo = 0;
      gameState0.getWinners();
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(arrayList0, card_Type0);
      GameState gameState0 = new GameState(list0);
      gameState0.play();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.getWinners();
      gameState0.getWinners();
      int int0 = gameState0.embargo;
      GameState gameState1 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "", (-2126));
      gameState1.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState1.play();
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
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.cards = null;
      gameState0.cards = null;
      gameState0.toString();
      Player player0 = new Player(gameState0, "The board game is embty you need to intialize the game!!!!", 0);
      GameState gameState1 = new GameState((List<Card>) null);
      player0.buyCard(gameState1, (Card) null);
      gameState0.addPlayer(player0);
      gameState0.embargo = 5;
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      GameState gameState1 = gameState0.clone();
      gameState1.getWinners();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "", 0);
      gameState0.addPlayer(player0);
      gameState0.play();
      // Undeclared exception!
      try { 
        Card.Type.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, "", 0);
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName1 = Card.CardName.Curse;
      Card.getCard(list1, card_CardName1);
      gameState0.addPlayer(player0);
      hashMap0.put(card0, (Integer) 0);
      gameState0.gameBoard = hashMap0;
      gameState0.embargo = (-933);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      // Undeclared exception!
      try { 
        Card.Type.valueOf(">dMv&7m1xGe3(W}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.>dMv&7m1xGe3(W}
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Stack<Player> stack0 = new Stack<Player>();
      gameState0.players = (List<Player>) stack0;
      Player player0 = new Player(gameState0, "", (-870));
      player0.playedCards = list0;
      stack0.add(player0);
      Player player1 = new Player(gameState0, "C0o\"E0sgX5r+/", 30);
      gameState0.play();
      Player player2 = player1.clone();
      player1.numAdventurer = 4;
      gameState0.addPlayer(player2);
      GameState gameState1 = gameState0.clone();
      gameState1.getWinners();
      gameState0.getWinners();
      gameState0.isGameOver();
      List<Player> list1 = gameState1.players;
      gameState1.addPlayer(player0);
      player2.printStateGame();
      // Undeclared exception!
      try { 
        gameState1.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}
