/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 07:29:29 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import cs362.dominion.GameState;
import cs362.dominion.Player;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.plusAction();
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      player0.coins = 2157;
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "%d;<");
      arrayList1.add(player0);
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        player1.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.plusBuy();
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "%d;<");
      Player player1 = player0.clone();
      arrayList1.add(player1);
      player1.coins = (-1017);
      player1.drawCard();
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "%d;<");
      player0.plusAction();
      player0.drawCard();
      arrayList1.add(player0);
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.numActions = (-23);
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      player0.coins = 2157;
      player0.revealAll();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      player0.startTurn();
      player0.drawCard();
      player0.revealAll();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((GameState) null, "$jG");
      player0.discard((Card) null);
      Player player1 = player0.clone();
      player1.coins = 1359;
      player1.drawCard();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Action-Attack");
      player0.plusCoins((-214));
      player0.plusCoins(10);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.plusAction();
      player0.plusBuy();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((GameState) null, "q:`xgE)&c ");
      player0.startTurn();
      player0.plusBuy();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.plusAction();
      player0.plusAction();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) null, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "");
      Integer integer0 = new Integer((-2145));
      hashMap0.put((Card) null, integer0);
      player0.retCard((Card) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((GameState) null, "jWxI!sNGC{Rs9H");
      player0.drawCard();
      player0.trashRandomCard();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((GameState) null, "%Y%z");
      // Undeclared exception!
      try { 
        player0.trashRandomCard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.hand = (List<Card>) stack0;
      // Undeclared exception!
      try { 
        player0.trashRandomCard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.drawCard();
      player0.plusAction();
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      LinkedList<Player> linkedList1 = new LinkedList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) linkedList0, (List<Player>) linkedList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "V,UTK");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.getContainedCard("V,UTK");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        player0.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Curse");
      player0.hand = gameState0.cards;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((GameState) null, "q:`xgE)&c ");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.contains(" --- q:`xgE)&c  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 1coins: 0numBuys: 1\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Hand size 4: ");
      player0.discard = null;
      // Undeclared exception!
      try { 
        player0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Action-Attack");
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) null, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "");
      player0.trash((Card) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "%d;<");
      arrayList1.add(player0);
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      List<Card> list0 = Card.createCards();
      player1.discard = list0;
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "%d;<");
      arrayList1.add(player0);
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) stack0, (List<Player>) linkedList0, hashMap0, hashMap0);
      Integer integer0 = new Integer(20);
      hashMap0.put((Card) null, integer0);
      Player player0 = new Player(gameState0, ",=:Yqn]~Xk.");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "");
      player0.coins = 8257536;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player((GameState) null, " victory points.");
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((GameState) null, "$jG");
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player((GameState) null, " victory points.");
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      player0.getContainedCard("");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player((GameState) null, " victory points.");
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      player0.contains("org.apache.oro.text.MalformedCachePatternException");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        player0.gainToHand((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Player player0 = new Player((GameState) null, "$jG");
      player0.discard((Card) null);
      player0.startTurn();
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Player player0 = new Player((GameState) null, "$jG");
      player0.startTurn();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState((List<Card>) arrayList0, (List<Player>) arrayList1, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "%d;<");
      Player player1 = player0.clone();
      List<Card> list0 = Card.createCards();
      player1.discard = list0;
      player1.drawCard();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      GameState gameState0 = new GameState(list0, (List<Player>) null, hashMap0, hashMap0);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        player0.retCard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.plusAction();
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Player player0 = new Player((GameState) null, " victory points.");
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      Card card0 = player0.trashRandomCard();
      assertEquals(6, card0.getCost());
  }
}
