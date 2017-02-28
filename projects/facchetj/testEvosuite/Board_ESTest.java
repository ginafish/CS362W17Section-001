/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:40:58 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Board;
import dominion.Card;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Board_ESTest extends Board_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Board board0 = new Board(74);
      board0.giveCard(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Board board0 = new Board((-1));
      board0.giveCard(17);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Board board0 = new Board(1);
      Card[] cardArray0 = new Card[3];
      board0.pioche_card = cardArray0;
      board0.giveCard(1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Board board0 = new Board(2);
      board0.giveCard(6);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Board board0 = new Board((-3175));
      Card[] cardArray0 = new Card[6];
      Card card0 = new Card(0);
      cardArray0[0] = card0;
      board0.pioche_card = cardArray0;
      board0.giveCard(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Board board0 = new Board(2);
      board0.pioche_card = null;
      board0.getCards();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Board board0 = new Board(0);
      Card[] cardArray0 = new Card[0];
      board0.pioche_card = cardArray0;
      board0.getCards();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Board board0 = new Board(0);
      Card[] cardArray0 = new Card[1];
      Card card0 = new Card((-1878));
      cardArray0[0] = card0;
      board0.pioche_card = cardArray0;
      board0.getCardName(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Board board0 = new Board(6);
      Card[] cardArray0 = new Card[2];
      Card card0 = board0.giveCard(3);
      cardArray0[0] = card0;
      board0.pioche_card = cardArray0;
      card0.nom = "";
      board0.getCardName(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Board board0 = new Board(1038);
      board0.pioche_number = board0.embargo;
      board0.getAvailability(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Board board0 = new Board(1446);
      board0.getAvailability(0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Board board0 = new Board(2);
      // Undeclared exception!
      try { 
        board0.setTrash((-382), 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -382
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Board board0 = new Board(1038);
      // Undeclared exception!
      try { 
        board0.setToDraw(1038, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1038
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Board board0 = new Board(1446);
      board0.embargo = null;
      // Undeclared exception!
      try { 
        board0.setEmbargo(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Board board0 = new Board(130);
      // Undeclared exception!
      try { 
        board0.setEmbargo(130);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 130
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Board board0 = new Board(2497);
      board0.pioche_number = null;
      // Undeclared exception!
      try { 
        board0.giveCard(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Board board0 = new Board((-1235));
      Card[] cardArray0 = new Card[1];
      board0.pioche_card = cardArray0;
      // Undeclared exception!
      try { 
        board0.giveCard(6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Board board0 = new Board((-1124));
      // Undeclared exception!
      try { 
        board0.getToDraw((-1124));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1124
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Board board0 = new Board(1);
      Card[] cardArray0 = new Card[3];
      board0.pioche_card = cardArray0;
      // Undeclared exception!
      try { 
        board0.getCardName(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Board board0 = new Board(26);
      // Undeclared exception!
      try { 
        board0.getCardName(26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Board board0 = new Board(3);
      board0.pioche_number = null;
      // Undeclared exception!
      try { 
        board0.getAvailability(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Board board0 = new Board(385);
      // Undeclared exception!
      try { 
        board0.getAvailability(385);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 385
         //
         assertThrownBy("dominion.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Board board0 = new Board((-24));
      board0.pioche_number = null;
      // Undeclared exception!
      try { 
        board0.gameDone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Board board0 = new Board(0);
      int[] intArray0 = new int[0];
      board0.pioche_number = intArray0;
      // Undeclared exception!
      try { 
        board0.gameDone();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Board board0 = new Board(1038);
      boolean boolean0 = board0.gameDone();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Board board0 = new Board(0);
      boolean boolean0 = board0.gameDone();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Board board0 = new Board(0);
      Board board1 = new Board(0);
      assertFalse(board1.gameDone());
      
      board1.pioche_number = board0.embargo;
      Card card0 = board1.giveCard(0);
      assertEquals(-1, card0.getId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Board board0 = new Board(1446);
      Card card0 = board0.giveCard(1446);
      assertEquals((-1), card0.id);
      assertTrue(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Board board0 = new Board((-1124));
      Card card0 = board0.giveCard(0);
      assertEquals(0, card0.getPrix());
      assertNotNull(card0);
      
      card0.prix = (-419);
      board0.giveCard(0);
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Board board0 = new Board((-1124));
      Card card0 = board0.giveCard((-1124));
      assertFalse(board0.gameDone());
      assertEquals((-1), card0.id);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Board board0 = new Board(6);
      board0.setTrash(3, (-4316));
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Board board0 = new Board((-1124));
      board0.getCards();
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Board board0 = new Board(6);
      board0.setEmbargo(1);
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Board board0 = new Board(0);
      board0.setToDraw(0, 2920);
      int int0 = board0.getToDraw(0);
      assertEquals(2920, int0);
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Board board0 = new Board((-1124));
      int int0 = board0.getToDraw(0);
      assertEquals(0, int0);
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Board board0 = new Board((-1124));
      int[] intArray0 = board0.getTrash();
      assertFalse(board0.gameDone());
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Board board0 = new Board((-1124));
      int int0 = board0.getAvailability(0);
      assertEquals(7998, int0);
      assertFalse(board0.gameDone());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Board board0 = new Board(6);
      String string0 = board0.getCardName(0);
      assertFalse(board0.gameDone());
      assertNotNull(string0);
      assertEquals("copper", string0);
  }
}
