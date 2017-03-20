/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 20 18:54:22 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = false, useVFS = false, useVNET = false, resetStaticState = false, separateClassLoader = false, useJEE = false)
public class Player_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.trash((Card) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player();
      player0.initilizeDeck();
      Vector<Card> vector0 = player0.playerHand;
      player0.playerDeck = vector0;
      player0.getVicPoints();
      player0.playAdventurer();
      player0.drawCard(1);
      player0.getVicPoints();
      Card card0 = new Card("'JG,`${@p_");
      player0.gainToHand(card0);
      vector0.add(card0);
      vector0.add(card0);
      player0.gainToHand(card0);
      player0.getHandSize();
      player0.initilizeDeck();
      Vector<Card> vector1 = player0.inPlayCards;
      player0.playerHand = vector1;
      player0.getHandSize();
      player0.drawToDiscard((-651));
      player0.trash(card0, "'JG,`${@p_");
      player0.drawToDiscard((-963));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player();
      Vector<Card> vector0 = player0.inPlayCards;
      Player player1 = new Player();
      player1.shuffleDeck();
      vector0.add((Card) null);
      player1.playerDiscard = vector0;
      player0.getVicPoints();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player();
      player0.shuffleDeck();
      player0.initilizeDeck();
      player0.drawToDiscard(191);
      // Undeclared exception!
      try { 
        player0.drawCard(5842);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player();
      player0.inPlayCards = null;
      // Undeclared exception!
      try { 
        player0.clearPhase();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player();
      Vector<Card> vector0 = player0.playerDiscard;
      player0.inPlayCards = vector0;
      player0.gainToHand((Card) null);
      // Undeclared exception!
      try { 
        player0.printHand();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player();
      player0.getHandSize();
      player0.printHand();
      player0.drawCard(0);
      player0.getVicPoints();
      player0.discard((Card) null);
      player0.shuffleDeck();
      player0.inPlayCards = null;
      player0.discard((Card) null);
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.getVicPoints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player();
      player0.initilizeDeck();
      player0.getMonOnHand();
      Card card0 = null;
      try {
        card0 = new Card((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  /*@Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player();
      player0.drawToDiscard((-3518));
      Vector<Card> vector0 = player0.getHand();
      player0.playerDiscard = vector0;
      // Undeclared exception!
      try { 
        player0.playAction();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }*/

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.playAdventurer();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.drawToDiscard(14);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player();
      Card card0 = new Card("] $tG");
      player0.gain(card0);
      player0.printHand();
      Vector<Card> vector0 = player0.getHand();
      player0.shuffleDeck();
      player0.playerDeck = vector0;
      player0.clearPhase();
      // Undeclared exception!
      try { 
        player0.playAction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player();
      player0.playerDeck = null;
      player0.getHandSize();
      // Undeclared exception!
      try { 
        player0.playAdventurer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player();
      player0.getVicPoints();
      player0.trash((Card) null, "V@;+@szrVO>FB|-");
      player0.drawCard((-422));
      Player player1 = new Player();
      Vector<Card> vector0 = player1.getInPlay();
      vector0.spliterator();
      vector0.add((Card) null);
      Card card0 = null;
      try {
        card0 = new Card((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.drawCard(323);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player();
      player0.initilizeDeck();
      player0.drawToDiscard(0);
      player0.printHand();
      player0.playAdventurer();
      player0.drawCard(0);
      player0.getInPlay();
      player0.getVicPoints();
      player0.getHand();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player();
      Card card0 = new Card("");
      player0.discard(card0);
      // Undeclared exception!
      try { 
        player0.clearPhase();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player();
      player0.getVicPoints();
      // Undeclared exception!
      try { 
        player0.clearPhase();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player();
      player0.initilizeDeck();
      player0.getVicPoints();
      Vector<Card> vector0 = player0.playerHand;
      Card card0 = new Card("ZafF1LeJMMWGjnt");
      vector0.add(card0);
      Card card1 = new Card("");
      // Undeclared exception!
      try { 
        card1.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  /*@Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player();
      Vector<Card> vector0 = player0.getHand();
      player0.playerHand = vector0;
      player0.gain((Card) null);
      player0.getHandSize();
      Player player1 = new Player();
      vector0.add((Card) null);
      vector0.add((Card) null);
      player0.shuffleDeck();
      vector0.add((Card) null);
      player1.trash((Card) null, "");
      player0.playerHand.add((Card) null);
      player1.trash((Card) null, "");
      player1.playerDeck = player0.playerHand;
      vector0.clear();
      player1.getHand();
      Card card0 = null;
      player0.gainToHand((Card) null);
      // Undeclared exception!
      try { 
        player1.playAction();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }*/

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player();
      String string0 = "\tCost: ";
      Card card0 = new Card("\tCost: ");
      // Undeclared exception!
      try { 
        card0.getType();
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
      Player player0 = new Player();
      Card card0 = new Card("");
      player0.gain(card0);
      player0.drawToDiscard(4);
      player0.printHand();
      player0.getMonOnHand();
      player0.gainToHand(card0);
      // Undeclared exception!
      try { 
        player0.playAction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  /*@Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player();
      player0.printHand();
      player0.initilizeDeck();
      player0.shuffleDeck();
      // Undeclared exception!
      player0.playAction();
  }*/

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player();
      Vector<Card> vector0 = player0.playerDeck;
      vector0.removeAllElements();
      player0.initilizeDeck();
      vector0.clear();
      // Undeclared exception!
      try { 
        player0.clearPhase();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player();
      player0.initilizeDeck();
      player0.shuffleDeck();
      player0.trash((Card) null, "XScMmvB+UN^o'yey?0");
      player0.getHand();
      player0.gain((Card) null);
      player0.printHand();
      player0.drawToDiscard(7);
      assertEquals(5, player0.getHandSize());
  }
}
