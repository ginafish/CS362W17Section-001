/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:33:20 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DominionBoard_ESTest extends DominionBoard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Silver = (-2025);
      dominionBoard0.buyingCard(6);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Gold = (-4001);
      dominionBoard0.buyingCard(5);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Curse = (-215);
      dominionBoard0.buyingCard(4);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Curse = 447;
      dominionBoard0.buyingCard(4);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      dominionBoard0.buyingCard(3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Estate = (-1);
      dominionBoard0.buyingCard(2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Province = 6;
      dominionBoard0.num_Province = (-365);
      dominionBoard0.buyingCard(1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Province = 13;
      dominionBoard0.buyingCard(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Feast = (-27);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Chapel = (-506);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Village = (-3312);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Chancellor = (-2197);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Chancellor = 1346;
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Cellar = (-4081);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Cellar = 11;
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Bureaucrat = 122;
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Adventurer = (-1);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Adventurer = 3153;
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Cooper = (-1024);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Silver = (-197);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Gold = (-3810);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Curse = (-1590);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Curse = 582;
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Province = 4962;
      dominionBoard0.num_Province = (-365);
      dominionBoard0.checkEnd();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Estate = (-2208);
      int int0 = dominionBoard0.checkEnd();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Duchy = (-3);
      int int0 = dominionBoard0.checkEnd();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      // Undeclared exception!
      try { 
        dominionBoard0.printBoard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("DominionBoard", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(19);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(19);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(18);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(18);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(17);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(17);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(16);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(16);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Laboratory = 2217;
      int int0 = dominionBoard0.buyingCard(15);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(15);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Garden = (-2060);
      int int0 = dominionBoard0.buyingCard(14);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(14);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(13);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(13);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(12);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(12);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Chapel = (-3126);
      int int0 = dominionBoard0.buyingCard(11);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(11);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(11);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(10);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(10);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(9);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(8);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Cooper = (-3515);
      int int0 = dominionBoard0.buyingCard(7);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(7);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(6);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(6);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.buyingCard(5);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(5);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(4);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Duchy = (-2215);
      int int0 = dominionBoard0.buyingCard(3);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(3);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.num_Estate = 2487;
      int int0 = dominionBoard0.buyingCard(2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      int int0 = dominionBoard0.buyingCard(9);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      int int0 = dominionBoard0.checkEnd();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DominionBoard dominionBoard0 = new DominionBoard();
      dominionBoard0.initialize();
      dominionBoard0.printBoard();
      assertEquals(0, dominionBoard0.checkEnd());
  }
}