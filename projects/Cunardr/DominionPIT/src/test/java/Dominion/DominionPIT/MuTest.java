package Dominion.DominionPIT;

import static org.junit.Assert.*;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;


import org.junit.Test;

public class MuTest {

	@Test
	public void testScale() 
	{
		Board b4 = new Board(4);
		Board b2 = new Board(2);
		if (12 != b4.scale)
			assert(false);
		if (8 != b2.scale)
			assert(false);
	}
	
	@Test
	public void testSupply()
	{
		Board b4 = new Board(4);
		Board b2 = new Board(2);
		int count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getName() == "Copper")
				count++;
		if (60 != count)
			fail("Incorrect number of coppers");
		count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getName() == "Silver")
				count++;
		if (40 != count)
			fail("Incorrect number of silvers");
		count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getName() == "Gold")
				count++;
		if (30 != count)
			fail("Incorrect number of golds");
		count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getName() == "Estate")
				count++;
		if (12 != count)
			fail("Incorrect number of estates");
		count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getName() == "Duchy")
				count++;
		if (12 != count)
			fail("Incorrect number of Duchies");
		count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getName() == "Province")
				count++;
		if (12 != count)
			fail("Incorrect number of provinces");
		count = 0;
		for (int i = 0; i < b2.supply.size(); i++)
			if (b2.supply.get(i).getName() == "Estate")
				count++;
		if (8 != count)
			fail("Incorrect number of estates");
		count = 0;
		for (int i = 0; i < b2.supply.size(); i++)
			if (b2.supply.get(i).getName() == "Duchy")
				count++;
		if (8 != count)
			fail("Incorrect number of Duchies");
		count = 0;
		for (int i = 0; i < b2.supply.size(); i++)
			if (b2.supply.get(i).getName() == "Province")
				count++;
		if (8 != count)
			fail("Incorrect number of provinces");
		count = 0;
		for (int i = 0; i < b4.supply.size(); i++)
			if (b4.supply.get(i).getType() == "Kingdom" || b4.supply.get(i).getType() == "KingdomS")
				count++;
		assert(100 == count);
		
		for (int i = 0; i < 16; i++)
		{
			assert(0 == b4.em[i]);
		}
		
		assert(10 == b4.kList.size());
		
		assert(30 == b4.curse.size());
		assert(10 == b2.curse.size());
		
		for (int i = 0; i < 10; i++)
		{
			count = 0;
			for (int j = 0; j < b4.supply.size(); j++)
				if (b4.kList.get(i) == b4.supply.get(j).getName())
					count++;
			assert(10 == count);
		}
	}
	
	@Test
	public void testCard()
	{
		Card c = new Card("Gardens");
		if ("Gardens" != c.getName() || 4 != c.getCost() || "KingdomS" != c.getType())
			fail("Garden failed to generate properly");
		c = new Card("Great Hall");
		if ("Great Hall" != c.getName() || 3 != c.getCost() || "Kingdom" != c.getType() || 1 != c.getPoints())
			fail("Great Hall failed to generate properly");
		c = new Card("Curse");
		if ("Curse" != c.getName() || -1 != c.getPoints() || "Curse" != c.getType())
			fail("Curse failed to generate properly");
	}
	
	@Test
	public void testBoardConditions()
	{
		Board b = new Board(4);
		if (b.gameEnd() == true)
			fail("Incorrectly ends game");
		int size = b.supply.size();
		for (int i = 0; i <size; i++)
			b.supply.remove(0);
		if (b.gameEnd() == false)
			fail("gameEnd fails");
		b = new Board(4);
		boolean x = false;
		for (int i = 0; i < b.available(10).size(); i++)
			if (b.available(10).get(i) == "Copper")
				x = true;
		if (false == x)
			fail("Available fails");
		
	}
	
	@Test
	public void testActions()
	{
		boolean x = false;
		Board b = new Board(4);
		Player p = new Player(1);
		Card.draw(p.deck, p.hand, 2);
		assert(7 == p.hand.size());
		
		p.hand.add(new Card("Gold"));
		Card.move(new Card("Gold"), p.hand, p.discard);
		for (int i = 0; i < p.discard.size(); i++)
		{
			if (p.discard.get(i).getName() == "Gold")
				x = true;
		}
		assert(false != x);
		
		p.discardAll(p.hand);
		p.hand.add(new Card("Gold"));
		p.hand.add(new Card("Silver"));
		p.hand.add(new Card("Copper"));
		assert(p.getMoney() == 6);
		
		x = false;
		p = new Player(1);
		b.buy(10, "Gold", p.hand);
		for (int i = 0; i < p.hand.size(); i++)
		{
			if (p.hand.get(i).getName() == "Gold")
				x = true;
		}
		assert(false != x);
		
		for (int i = 0; i < 16; i++)
			b.em[i] = 1;
		x = false;
		b.buy(10, "Gold", p.hand);
		for (int i = 0; i < p.hand.size(); i++)
		{
			if (p.hand.get(i).getName() == "Curse")
				x = true;
		}
		assert(x != false);
			
		
		p = new Player(1);
		p.discard(new Card("Copper"));
		assert(4 == p.hand.size());
		p.discardAll(p.hand);
		assert(0 == p.hand.size());
			
		
		b = new Board(4);
		p.gain(new Card("Gold"), b.supply);
		x = false;
		for (int i = 0; i < p.hand.size(); i++)
		{
			if (p.hand.get(i).getName() == "Curse")
				x = true;
		}
		assert(x != false);
		
		p.trash(new Card("Gold"));
		x = false;
		for (int i = 0; i < p.hand.size(); i++)
		{
			if (p.hand.get(i).getName() == "Curse")
				x = true;
		}
		assert(x != true);
		
		p = new Player(1);
		p.turn(b, "Testing");
		assert(0 == p.actions);
		assert(0 == p.purchases);
		assert(5 == p.hand.size());
	}
	
	@Test
	public void testK()
	{
		Player p = new Player(1);
		Board b = new Board(4);
		p.discardAll(p.hand);
		int size = p.deck.size();
		for (int i = 0; i < size; i++)
			p.deck.remove(0);
		
		p.hand.add(new Card("Adventurer", 6));
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Curse"));
		p.deck.add(new Card("Copper"));
		
		p.playK("Adventurer", b);
		assert(2 == p.hand.size());
		for (int i = 0; i < 2; i++)
			assert("Treasure" == p.hand.get(i).getType());
		assert(6 == p.discard.size());
		
		p = new Player(1);
		p.purchases = 0;
		p.turnMoney = 0;
		p.discardAll(p.hand);
		p.hand.add(new Card("Gold"));
		p.hand.add(new Card("Copper"));
		p.hand.add(new Card("Estate"));
		p.hand.add(new Card("Baron", 4));
		p.playK("Baron", b);
		
		assert(1 == p.purchases);
		
		int count = 0;
		for (int i = 0; i < p.hand.size(); i++)
			if (p.hand.get(i).getName() == "Estate")
			{
				count++;
			}
		if (2 == count)
			assert(0 == p.turnMoney);
		else if (0 == count)
			assert(4 == p.turnMoney);
		else
			assert(false);
		
		p = new Player(1);
		Player P2 = new Player(2);
		p.opponents.add(P2);
		P2.opponents.add(p);
		
		p.purchases = 0;
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.discardAll(p.hand);
		P2.discardAll(P2.hand);
		p.hand.add(new Card("Council Room", 4));
		p.playK("Council Room", b);
		assert(1 == p.purchases);
		assert(4 == p.hand.size());
		assert(1 == P2.hand.size());
		
		b = new Board(4);
		b.supply = new ArrayList();
		b.supply.add(new Card("Baron", 4));
		p = new Player(1);
		p.discardAll(p.hand);
		p.hand.add(new Card("Feast", 4));
		p.playK("Feast", b);
		assert(p.hand.size() == 1);
		assert(p.hand.get(0).getName() == "Baron");
		
		p = new Player(1);
		p.actions = 0;
		p.discardAll(p.hand);
		p.hand.add(new Card("Great Hall", 3));
		p.playK("Great Hall", b);
		assert(p.actions == 1);
		assert(p.hand.size() == 1);
		
		p = new Player(1);
		b = new Board(4);
		p.actions = 0;
		p.discardAll(p.hand);
		p.hand.add(new Card("Mine", 5));
		p.hand.add(new Card("Copper"));
		assert(1 == p.hand.size());
		assert("Copper" == p.hand.get(0).getName() || "Silver" == p.hand.get(0).getName());
		
		P2 = new Player(2);
		p = new Player(1);
		p.turnMoney = 0;
		p.opponents.add(P2);
		P2.opponents.add(p);
		p.discardAll(p.hand);
		p.hand.add(new Card("Minion", 5));
		assert((p.turnMoney == 2 && P2.hand.size() == 5) || (p.turnMoney == 0 && P2.hand.size() == 4));
		
		p = new Player(1);
		p.discardAll(p.hand);
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.hand.add(new Card("Smithy", 4));
		p.playK("Smithy", b);
		assert(3 == p.hand.size());
		
		p = new Player(1);
		p.turnMoney = 0;
		p.discardAll(p.hand);
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.deck.add(new Card("Copper"));
		p.hand.add(new Card("Copper"));
		p.hand.add(new Card("Copper"));
		p.playK("Steward", b);
		assert((p.turnMoney == 0 && p.hand.size() == 4) || (p.turnMoney == 2 && p.hand.size() == 2) || (p.turnMoney == 0 && p.hand.size() == 0));
		
		
	}
}
