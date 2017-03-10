/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 09:08:17 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Randomness_ESTest extends Randomness_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Randomness.nextRandomInt((-527));
      // Undeclared exception!
      try { 
        Randomness.main((String[]) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList0);
      LinkedList linkedList1 = (LinkedList)Randomness.randomMember((List<Object>) linkedList0);
      assertEquals(1, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-885L));
      byte[] byteArray0 = new byte[8];
      mockRandom0.nextBytes(byteArray0);
      int int0 = Randomness.nextRandomInt(1443);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Randomness.random = null;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-644));
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Integer>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Randomness.random = null;
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        Randomness.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         verifyException("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         verifyException("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      Object object0 = Randomness.randomMember((List<Object>) linkedList0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Randomness.reset(553L);
  }
}
