/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:41:11 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.adventurer;
import org.cs362.dominion.board;
import org.cs362.dominion.feast;
import org.cs362.dominion.player;
import org.cs362.dominion.silver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class card_ESTest extends card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      silver silver0 = new silver();
      player[] playerArray0 = new player[8];
      board board0 = new board();
      silver0.perform_attack(playerArray0, (-3117), board0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      feast feast0 = new feast();
      feast0.description();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      adventurer adventurer0 = new adventurer();
      player[] playerArray0 = new player[7];
      board board0 = new board();
      // Undeclared exception!
      try { 
        adventurer0.perform_attack(playerArray0, 2133, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2133
         //
         assertThrownBy("org.cs362.dominion.adventurer", e);
      }
  }
}
