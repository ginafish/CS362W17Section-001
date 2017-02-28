/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 22:50:37 PST 2017
 */

package real_dominion;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1311);
      GameState gameState0 = new GameState(list0, intArray0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.putIfAbsent(card0, (Integer) intArray0[0]);
      boolean boolean0 = gameState0.isGameOver();
      assertFalse(boolean0);
  }

  @Test
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.putIfAbsent(card0, (Integer) intArray0[0]);
      gameState0.updateTable(card0, (-1311));
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0, intArray0);
      gameState0.gameBoard.put((Card) null, (Integer) 3);
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

  @Test
  public void test03()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState((List<Card>) stack0, intArray0);
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      gameState0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.GameState", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.put(card0, (Integer) 8);
      boolean boolean0 = gameState0.isGameOver();
      assertFalse(boolean0);
  }

  @Test
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "\n");
      gameState0.addPlayer(player0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.putIfAbsent(card0, (Integer) 8);
      String string0 = gameState0.toString();
      assertEquals(" ---  --- \n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n\n --- gameBoard --- \nCards on the table: \nCard Name \t\t NumberCards: \n\t Province\t\t 8\t\t [8]\n", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[3];
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0, intArray0);
      String string0 = gameState0.toString();
      assertEquals("The board game is embty you need to intialize the game!!!!", string0);
  }

  @Test
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "\n");
      gameState0.addPlayer(player0);
      HashMap<Player, Integer> hashMap0 = gameState0.getWinners();
      assertFalse(hashMap0.isEmpty());
  }

  @Test
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.putIfAbsent(card0, (Integer) card0.treasureValue);
      boolean boolean0 = gameState0.isGameOver();
      assertTrue(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "\n");
      gameState0.addPlayer(player0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.put(card0, (Integer) 8);
      // Undeclared exception!
      try { 
        gameState0.play(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.Card", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      gameState0.gameBoard.put(card0, (Integer) 8);
      // Undeclared exception!
      try { 
        gameState0.play(gameState0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "\n");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "\n");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      gameState0.initializeGame();
  }

  @Test
  public void test15()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      int[] intArray0 = new int[4];
      GameState gameState0 = new GameState((List<Card>) vector0, intArray0);
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1237), 2253, (-754), (-1237));
      // Undeclared exception!
      try { 
        gameState0.updateTable(card0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("real_dominion.GameState", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      HashMap<Card, Integer> hashMap0 = gameState0.getGamestate();
      assertTrue(hashMap0.isEmpty());
  }

  @Test
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      int[] intArray0 = new int[1];
      GameState gameState0 = new GameState(list0, intArray0);
      Player player0 = new Player(gameState0, "\n");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}