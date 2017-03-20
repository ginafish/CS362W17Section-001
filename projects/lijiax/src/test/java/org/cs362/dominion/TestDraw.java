package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestDraw {
    private List<Card> cards;
    private GameState state;
    private Player player1;
    private Player player2;

    @Before
    public void initializeGame() {
        cards = new ArrayList<Card>(Card.createCards());
        state = new GameState(cards);
        player1 = new Player(state, "PLAYER 1");
        state.addPlayer(player1);
        player2 = new Player(state, "PLAYER 2");
        state.addPlayer(player2);
        state.initializeGame();
    }

    @Test
    public void testdrawc() {
        player1.initializePlayerTurn();
        assertEquals(player2.hand.size(), 5);
        assertEquals(player2.deck.size(), 5);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);
        System.out.println("Success");
        player2.drawCard();
        System.out.println("Success");
        assertEquals(player2.hand.size(), 6);
        assertEquals(player2.deck.size(), 4);
        assertEquals(player2.discard.size(), 0);
        assertEquals(player2.playedCards.size(), 0);
        System.out.println(player2);
    }
	}
