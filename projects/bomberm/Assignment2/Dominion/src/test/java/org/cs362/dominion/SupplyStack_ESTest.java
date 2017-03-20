/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:47:02 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Card;
import org.cs362.dominion.SupplyStack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupplyStack_ESTest extends SupplyStack_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("silver", 1554);
      int int0 = supplyStack0.hasTreasure();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("", (-603));
      supplyStack0.type.worth = (-1856);
      int int0 = supplyStack0.hasTreasure();
      assertEquals((-1856), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("silver", 1554);
      Card card0 = supplyStack0.type;
      card0.cardType = null;
      String string0 = supplyStack0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("ilDfW~lgR[#X", (-476));
      String string0 = supplyStack0.getType();
      assertEquals("ilDfW~lgR[#X", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("d}UK:+|x--\"9&%7}X/[", 0);
      supplyStack0.type = null;
      // Undeclared exception!
      try { 
        supplyStack0.hasTreasure();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.SupplyStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("", 3211);
      supplyStack0.type = null;
      // Undeclared exception!
      try { 
        supplyStack0.getType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.SupplyStack", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SupplyStack supplyStack0 = null;
      try {
        supplyStack0 = new SupplyStack((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("", 3211);
      String string0 = supplyStack0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SupplyStack supplyStack0 = new SupplyStack("", 3211);
      int int0 = supplyStack0.hasTreasure();
      assertEquals(0, int0);
  }
}