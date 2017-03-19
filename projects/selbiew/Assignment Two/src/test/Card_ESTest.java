/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:16:44 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Province province0 = new Province();
      province0.print();
      assertEquals(0.0F, province0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Great_Hall great_Hall0 = new Great_Hall();
      great_Hall0.print();
      assertEquals(0.0F, great_Hall0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Council_Room council_Room0 = new Council_Room();
      council_Room0.print();
      assertEquals(0.0F, council_Room0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      cutpurse0.value = 50;
      float float0 = cutpurse0.dynamicValue();
      assertEquals(50.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      gardens0.value = (-705);
      float float0 = gardens0.dynamicValue();
      assertEquals((-705.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Embargo embargo0 = new Embargo();
      DomGame domGame0 = new DomGame(2);
      domGame0.players = null;
      // Undeclared exception!
      try { 
        embargo0.play(domGame0, (-548), 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Embargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Embargo embargo0 = new Embargo();
      DomGame domGame0 = new DomGame((-1896));
      // Undeclared exception!
      try { 
        embargo0.play(domGame0, (-1896), (-327));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1896
         //
         assertThrownBy("Embargo", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      DomGame domGame0 = new DomGame(1498);
      gardens0.play(domGame0, 2, 1498);
      assertEquals(0, domGame0.turnCount);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      float float0 = cutpurse0.dynamicValue();
      assertEquals(0.0F, float0, 0.01F);
  }
}
