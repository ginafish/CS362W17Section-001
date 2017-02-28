/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:39:03 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.PlayGame;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class PlayGame_ESTest extends PlayGame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector<Player> vector0 = new Vector<Player>();
      Player player0 = new Player(">~p*[mf6r;3q/AY'O\"", (-605), (-605), 0);
      vector0.addElement(player0);
      vector0.add(player0);
      player0.resetStats();
      player0.removeHand();
      vector0.add(player0);
      player0.Coins = 0;
      player0.buildDeck();
      player0.setBuys((-368));
      vector0.add(player0);
      PlayGame.CheckWin(vector0, 0);
      Card.CardName.values();
      PlayGame.CheckWin(vector0, 0);
      Card.CardName.values();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      PlayGame.CheckWin(vector0, 0);
      Card.Type.values();
      Card.CardName.values();
      Card.CardName.valueOf("Cellar");
      PlayGame.CheckWin(vector0, 0);
      Card.CardName.values();
      Card.CardName.values();
      PlayGame.CheckWin(vector0, (-605));
      PlayGame playGame0 = new PlayGame();
      PlayGame playGame1 = new PlayGame();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "oNkO5EC]";
      stringArray0[1] = "";
      stringArray0[2] = "\nThe game ends in a DRAW";
      stringArray0[3] = "7{DZT<)ByF%";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "PLAYER3";
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0, 2);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlayGame playGame0 = new PlayGame();
      Stack<Player> stack0 = new Stack<Player>();
      // Undeclared exception!
      try { 
        PlayGame.CheckWin(stack0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        PlayGame.CheckWin((List<Player>) null, 482);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.PlayGame", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("Trashing ", 0, 0, 0);
      arrayList0.add(player0);
      // Undeclared exception!
      try { 
        PlayGame.CheckWin(arrayList0, 1739);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "1p#w/bgj8kA:7#\u0002";
      stringArray0[2] = "";
      stringArray0[3] = "8kU8 kkqt%Ar%9*";
      stringArray0[4] = "+";
      stringArray0[5] = "&ZXn\\41n~~sh]%R=";
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0, 2986);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector<Player> vector0 = new Vector<Player>();
      Player player0 = new Player(">~p*[mf6r;3q/AY'O\"", (-605), (-605), 0);
      vector0.addElement(player0);
      vector0.add(player0);
      player0.resetStats();
      player0.removeHand();
      vector0.add(player0);
      player0.Coins = 0;
      player0.buildDeck();
      player0.setBuys((-368));
      vector0.add(player0);
      PlayGame.CheckWin(vector0, 0);
      Card.CardName.values();
      PlayGame.CheckWin(vector0, 0);
      Card.CardName.values();
      System.setCurrentTimeMillis(0L);
      Card.Type.values();
      PlayGame.CheckWin(vector0, 2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0, 4);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "F9ZGykQA";
      stringArray0[1] = "Year";
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0, 3);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PlayGame playGame0 = new PlayGame();
      Card.Type.values();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      String string0 = "5";
      stringArray0[1] = "5";
      String string1 = "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field)";
      stringArray0[2] = "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field)";
      int int0 = 0;
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0, 0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }
}
