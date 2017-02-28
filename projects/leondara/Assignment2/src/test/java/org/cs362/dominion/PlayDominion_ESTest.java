/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 00:41:36 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlayDominion_ESTest extends PlayDominion_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 11 covered goals:
   * Goal 1. main([Ljava/lang/String;)V_org.evosuite.runtime.TooManyResourcesException_IMPLICIT
   * Goal 2. PlayDominion.main([Ljava/lang/String;)V: Line 14
   * Goal 3. PlayDominion.main([Ljava/lang/String;)V: Line 15
   * Goal 4. PlayDominion.main([Ljava/lang/String;)V: Line 17
   * Goal 5. PlayDominion.main([Ljava/lang/String;)V: Line 21
   * Goal 6. PlayDominion.main([Ljava/lang/String;)V: Line 23
   * Goal 7. PlayDominion.main([Ljava/lang/String;)V: Line 26
   * Goal 8. PlayDominion.main([Ljava/lang/String;)V: Line 28
   * Goal 9. [METHOD] PlayDominion.main([Ljava/lang/String;)V
   * Goal 10. Weak Mutation 0: PlayDominion.main([Ljava/lang/String;)V:17 - ReplaceConstant - Player 1 -> 
   * Goal 11. Weak Mutation 1: PlayDominion.main([Ljava/lang/String;)V:23 - ReplaceConstant - Player 2 -> 
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        PlayDominion.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. PlayDominion.<init>()V: root-Branch
   * Goal 2. Branch PlayDominion.<init>()V: root-Branch in context: PlayDominion:<init>()V
   * Goal 3. [METHOD] PlayDominion.<init>()V
   * Goal 4. [METHODNOEX] PlayDominion.<init>()V
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayDominion playDominion0 = new PlayDominion();
  }
}
