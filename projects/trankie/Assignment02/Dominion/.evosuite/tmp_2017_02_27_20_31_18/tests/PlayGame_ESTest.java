/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:42:28 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlayGame_ESTest extends PlayGame_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlayGame playGame0 = new PlayGame();
      Card.Type.values();
      String[] stringArray0 = new String[7];
      stringArray0[0] = " WINS!";
      stringArray0[6] = "--%M%z";
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayGame playGame0 = new PlayGame();
      Card.CardName.valueOf("Cooper");
      Card.CardName.valueOf("Cooper");
      Card.Type.values();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Cooper";
      stringArray0[1] = "Cooper";
      stringArray0[2] = "Cooper";
      stringArray0[3] = "Cooper";
      stringArray0[4] = "Cooper";
      stringArray0[5] = "Cooper";
      stringArray0[6] = "Cooper";
      stringArray0[7] = "Cooper";
      // Undeclared exception!
      try { 
        PlayGame.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}
