/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 23:50:30 GMT 2017
 */

package Dominion.RandomTestDominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Dominion.RandomTestDominion.driver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class driver_ESTest extends driver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      driver.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      driver driver0 = new driver();
  }
}