/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:35:08 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Feast;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Feast_ESTest extends Feast_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Feast feast0 = new Feast();
      GameState gameState0 = new GameState(2, 2);
      gameState0.phase = 2;
      Boolean boolean0 = feast0.play(gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feast feast0 = new Feast();
      // Undeclared exception!
      try { 
        feast0.play((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Feast", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Feast feast0 = new Feast();
      GameState gameState0 = new GameState(4, 0);
      gameState0.whoseTurn = (-3455);
      // Undeclared exception!
      try { 
        feast0.play(gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3455
         //
         assertThrownBy("org.cs362.dominion.Feast", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Feast feast0 = new Feast();
      GameState gameState0 = new GameState(4, 4);
      Player[] playerArray0 = new Player[3];
      Boolean boolean0 = feast0.isAttack();
      Player player0 = new Player(boolean0);
      playerArray0[0] = player0;
      gameState0.players = playerArray0;
      Boolean boolean1 = feast0.play(gameState0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Feast feast0 = new Feast();
      GameState gameState0 = new GameState(2, 2);
      gameState0.phase = (-713);
      Boolean boolean0 = feast0.play(gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Feast feast0 = new Feast();
      GameState gameState0 = new GameState(4, 0);
      Boolean boolean0 = feast0.play(gameState0);
      assertTrue(boolean0);
  }
}
