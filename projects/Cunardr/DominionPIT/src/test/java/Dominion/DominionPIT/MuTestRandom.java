package Dominion.DominionPIT;

import static org.junit.Assert.*;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;


import org.junit.Test;

public class MuTestRandom {


	 @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      Board board0 = new Board(0);
	      List<String> list0 = board0.available((-965));
	      board0.embargo = list0;
	      board0.curse = null;
	      board0.supply = null;
	      // Undeclared exception!
	      try { 
	        board0.buy(0, "v}", (List<Card>) null);
	        assert(false);
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        //verifyException("Dominion.RandomTestDominion.Board", e);
	      }
	  }

	   @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      Board board0 = new Board(0);
	      int[] intArray0 = board0.em;
	      Player player0 = new Player(0);
	      player0.deck = board0.curse;
	      List<Card> list0 = player0.deck;
	      board0.buy(0, "Province", list0);
	      board0.curse = player0.hand;
	      List<Card> list1 = player0.discard;
	      board0.curse = player0.deck;
	      board0.buy(0, "N?-Dh<Lt5Guw,~SCr", list1);
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Board board0 = new Board(0);
	      List<String> list0 = board0.kList;
	      board0.embargo = list0;
	      board0.gameEnd();
	      board0.embargo = list0;
	      Board board1 = new Board(4);
	      board1.supply = board0.supply;
	      List<String> list1 = board1.kList;
	      board1.curse = board0.curse;
	      board0.embargo = list1;
	      Board board2 = new Board(4);
	      Board board3 = new Board(0);
	      List<String> list2 = board3.kList;
	      board3.gameEnd();
	      Board board4 = new Board(0);
	      board4.curse = board1.supply;
	      int[] intArray0 = board0.em;
	      Board board5 = new Board(0);
	      board1.gameEnd();
	      // Undeclared exception!
	      board2.gameEnd();
	  }

	   @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      Board board0 = new Board((-640));
	      List<String> list0 = board0.available((-640));
	      board0.available((-640));
	      board0.kList = list0;
	      board0.available(737);
	      int[] intArray0 = board0.em;
	      Player player0 = new Player(737);
	      List<Card> list1 = player0.deck;
	      board0.buy(12, "", list1);
	      // Undeclared exception!
	      try { 
	        board0.gameEnd();
	       assert(false);
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 0, Size: 0
	         //
	        // verifyException("java.util.ArrayList", e);
	      }
	  }

	   @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      Board board0 = new Board((-1232));
	      List<Card> list0 = board0.supply;
	      board0.curse = list0;
	      int[] intArray0 = board0.em;
	      board0.buy((-1232), "", list0);
	      List<String> list1 = board0.embargo;
	      board0.buy((-1232), "End of Player ", list0);
	      board0.available((-1232));
	      List<Card> list2 = board0.curse;
	      Board board1 = new Board((-1232));
	      board1.buy((-1232), (String) null, board0.supply);
	      board1.buy((-1232), "Adventurer", list2);
	      Board board2 = new Board(1119);
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      Board board0 = new Board((-285));
	      board0.buy((-285), "<{4#%+7>I#g", (List<Card>) null);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      Board board0 = new Board(0);
	      List<String> list0 = board0.available(3);
	      board0.available(0);
	      int[] intArray0 = new int[9];
	      intArray0[0] = 3;
	      intArray0[1] = 0;
	      intArray0[2] = 3;
	      intArray0[3] = 3;
	      intArray0[4] = 3;
	      intArray0[5] = 0;
	      intArray0[6] = 3;
	      intArray0[7] = 3;
	      intArray0[8] = 3;
	      board0.em = intArray0;
	      Board board1 = new Board(0);
	      board1.kList = list0;
	      board1.buy(211, "Estate", board0.curse);
	      List<Card> list1 = board1.curse;
	      List<String> list2 = board1.kList;
	      board0.gameEnd();
	      board0.gameEnd();
	      List<Card> list3 = board1.supply;
	      Board board2 = new Board((-1151));
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      int int0 = (-992);
	      Board board0 = new Board((-992));
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      board0.kList = (List<String>) linkedList0;
	      board0.available((-992));
	      linkedList0.clone();
	      board0.kList = null;
	      String string0 = null;
	      linkedList0.add((String) null);
	      linkedList0.add((String) null);
	      // Undeclared exception!
	      try { 
	        board0.gameEnd();
	        assert(false);
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	        // verifyException("Dominion.RandomTestDominion.Board", e);
	      }
	  }
	  
	  @Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        Play.playGame(12, 2);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 2, Size: 2
	         //
	         //verifyException("java.util.ArrayList", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      Play.playGame(4, 4);
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      Play.playGame(4, 4);
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      // Undeclared exception!
	      Play.playGame(0, 4);
	  }

	  @Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      Play.playGame(914, 1117);
	  }

	  @Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      Play.playGame((-833), 2);
	  }

	  @Test(timeout = 4000)
	  public void test6()  throws Throwable  {
	      Play.playGame(1, 0);
	  }

	  @Test(timeout = 4000)
	  public void test7()  throws Throwable  {
	      Play play0 = new Play();
	  }
}