/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 01:51:23 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Constants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Constants_ESTest extends Constants_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. [Output]: dominion.Constants.values()[Ldominion/Constants;:NonEmptyArray
   * Goal 2. [METHOD] dominion.Constants.values()[Ldominion/Constants;
   * Goal 3. [METHODNOEX] dominion.Constants.values()[Ldominion/Constants;
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constants[] constantsArray0 = Constants.values();
      assertNotNull(constantsArray0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. [Output]: dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;:NonNull:dominion.Constants:ordinal()I:Zero
   * Goal 2. [METHOD] dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;
   * Goal 3. [METHODNOEX] dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constants constants0 = Constants.valueOf("OPEN");
      assertEquals(0, constants0.ordinal());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. valueOf(Ljava/lang/String;)Ldominion/Constants;_java.lang.NullPointerException_IMPLICIT
   * Goal 2. [METHOD] dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Constants.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. valueOf(Ljava/lang/String;)Ldominion/Constants;_java.lang.IllegalArgumentException_IMPLICIT
   * Goal 2. [METHOD] dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Constants.valueOf("C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant dominion.Constants.C
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  //Test case number: 4
  /*
   * 12 covered goals:
   * Goal 1. dominion.Constants.getValue()I: root-Branch
   * Goal 2. Branch dominion.Constants.getValue()I: root-Branch in context: dominion.Constants:getValue()I
   * Goal 3. [Output]: dominion.Constants.getValue()I:Positive
   * Goal 4. [Output]: dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;:NonNull:dominion.Constants:ordinal()I:Positive
   * Goal 5. dominion.Constants.getValue()I: Line 34
   * Goal 6. [METHOD] dominion.Constants.getValue()I
   * Goal 7. [METHOD] dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;
   * Goal 8. [METHODNOEX] dominion.Constants.getValue()I
   * Goal 9. [METHODNOEX] dominion.Constants.valueOf(Ljava/lang/String;)Ldominion/Constants;
   * Goal 10. Weak Mutation 3: dominion.Constants.getValue()I:34 - InsertUnaryOp Negation
   * Goal 11. Weak Mutation 4: dominion.Constants.getValue()I:34 - InsertUnaryOp +1
   * Goal 12. Weak Mutation 5: dominion.Constants.getValue()I:34 - InsertUnaryOp -1
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constants constants0 = Constants.valueOf("CLOSE");
      int int0 = constants0.getValue();
      assertEquals(200, int0);
  }
}
