/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:41:43 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import org.cs362.dominion.board;
import org.cs362.dominion.estate;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class estate_ESTest extends estate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      estate estate0 = new estate();
      board board0 = new board();
      estate0.perform_attack((player[]) null, (-2646), board0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      estate estate0 = new estate();
      estate0.description();
  }
}
