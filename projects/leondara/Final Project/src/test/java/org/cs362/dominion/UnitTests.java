package org.cs362.dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.*;
import org.junit.Test;
import org.junit.Before;

public class UnitTests {
	private GameState state;
	private Player p1;
	private Player p2;
	private List<Card> cards;
	
	@Before
	public void createList() {
		cards = Card.createCards();
	}
	
	@Test
	public void sizeTest() {
		assertEquals(20, cards.size());
	}
	
	@Test
    public void silverTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Silver).getType(), Card.Type.TREASURE);
    }
	
	@Test
    public void ambassadorTest() {
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getCost(), 3);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Ambassador).getType(), Card.Type.ACTION);
    }
	
	@Test
    public void testValuesBaron() {
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getCost(), 4);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getScore(), 0);
        assertEquals(Card.getCard(cards, Card.CardName.Baron).getType(), Card.Type.ACTION);
    }
	
}

