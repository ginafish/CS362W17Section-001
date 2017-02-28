/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:40:41 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Copper;
import org.cs362.dominion.GameState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Copper_ESTest extends Copper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      gameState0.phase = 1;
      Copper copper0 = new Copper();
      Boolean boolean0 = copper0.play(gameState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Copper copper0 = new Copper();
      // Undeclared exception!
      try { 
        copper0.play((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Copper", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Copper copper0 = new Copper();
      GameState gameState0 = new GameState(3, 3);
      Boolean boolean0 = copper0.play(gameState0);
      assertFalse(boolean0);
  }
}