/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 20 18:52:43 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Card;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardType card_CardType0 = Card.CardType.valueOf("action");
      assertEquals(Card.CardType.action, card_CardType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardType[] card_CardTypeArray0 = Card.CardType.values();
      assertNotNull(card_CardTypeArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card("_SI,unIn");
      String string0 = card0.getName();
      assertNull(string0);
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = new Card("");
      String string0 = card0.getDesc();
      assertNull(string0);
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card("R0#");
      int int0 = card0.getCost();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card card0 = new Card("+]nN^MuM4IvRnHO6\"");
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Card card0 = new Card("Salvager");
      assertEquals("Salvager", card0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card card0 = new Card("Adventurer");
      assertEquals(0, card0.getMoneyVal());
      assertEquals(6, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = new Card("Gardens");
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = new Card("Feast");
      assertEquals("Trash this card.  Gain a card costing up to 5 coin.", card0.getDesc());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = new Card("Baron");
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card("Mine");
      assertEquals("Mine", card0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card("Gold");
      int int0 = card0.getMoneyVal();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = new Card("Province");
      int int0 = card0.getVicPoint();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card card0 = new Card("Silver");
      assertEquals(3, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card("SeaHag");
      assertEquals(4, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card card0 = new Card("");
      int int0 = card0.getVicPoint();
      assertEquals(0, card0.getMoneyVal());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card card0 = new Card("GreatHall");
      int int0 = card0.getMoneyVal();
      assertEquals(0, int0);
      assertEquals(3, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card card0 = new Card("GreatHall");
      card0.getType();
      assertEquals(1, card0.getVicPoint());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card card0 = new Card("GreatHall");
      card0.getDesc();
      assertEquals(1, card0.getVicPoint());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card card0 = new Card("Embargo");
      int int0 = card0.getCost();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card card0 = new Card("Ambassador");
      card0.getName();
      assertEquals(0, card0.getMoneyVal());
      assertEquals(3, card0.getCost());
  }
}
