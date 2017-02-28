/*
	GameManager.java
	Author: Chris Bakkom

	How the Dominion Game Manager works:

	Each function is meant to specify an aciton on the turn of the current player
	Right now there are no private variables or functions for testing purposes.
	Users should be very careful in what they are calling.

	General rule: if you are calling a function not in the Game manager you are doing something wrong.
	The game manager contains all the functionality to run a dominion game.
	Go to deeper levels at your own risk

*/



import java.util.*;

public class GameManager
{
	public Player[] players;
	public String[] names;
	public int currentPlayer = 0;
	public int numOfPlayers;

	public ResourceStack copperPile;
	public ResourceStack silverPile;
	public ResourceStack goldPile;
	public ResourceStack estatePile;
	public ResourceStack duchyPile;
	public ResourceStack provincePile;
	public ResourceStack cursePile;
	public ResourceStack trashPile;
	public ResourceStack[] kingdoms = new ResourceStack[10];

	public String[] kingdomNames = {"Adventurer","Ambassador","Baron",
									"Council Room","Cutpurse","Embargo",
									"Feast","Gardens","Great Hall",
									"Mine","Smithy","Village","Sea Hag"};

	public GameManager(int numberOfPlayers, String[] nameArray, String[] kingdomsUsing)
	{
		kingdomNames = kingdomsUsing;
		numOfPlayers = numberOfPlayers;
		players = new Player[numOfPlayers];
		names = nameArray;
		for (int i=0; i<numOfPlayers; i++)
		{
			players[i] = new Player(nameArray[i]);
			players[i].start();
		}

		// All Treasure cards
		CoinCard cp 	= new CoinCard(0, CoinCard.CoinValue.Copper);
		copperPile	 	= new ResourceStack( cp, (60 -(numOfPlayers*7)) );
		CoinCard sl 	= new CoinCard(3, CoinCard.CoinValue.Silver);
		silverPile 		= new ResourceStack( sl, 40);
		CoinCard gd 	= new CoinCard(6, CoinCard.CoinValue.Gold);
		goldPile 		= new ResourceStack( gd, 30);

		// All Victory cards
		VictoryCard es 		= new VictoryCard(2, VictoryCard.VictoryName.Estate);
		estatePile 			= new ResourceStack( es, 12 );
		VictoryCard dy  	= new VictoryCard(5, VictoryCard.VictoryName.Duchy);
		duchyPile			= new ResourceStack( dy, 12);
		VictoryCard pv  	= new VictoryCard(8, VictoryCard.VictoryName.Province);
		provincePile		= new ResourceStack( pv, 12);

		// All curse cards
		CurseCard cr	= new CurseCard();
		cursePile 		= new ResourceStack( cr, 10 * (numOfPlayers - 1) );

		// All kingdom cards
		/**/
		for(int i=0; i<10; i++)
		{
			ActionCard c;
			switch ( kingdomsUsing[i] ){
				case "Adventurer":
						c = new ActionCard(6, "Adventurer");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Ambassador":
						c = new ActionCard(3, "Ambassador");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Baron":
						c = new ActionCard(4, "Baron");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Council Room":
						c = new ActionCard(5, "Council Room");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Cutpurse":
						c = new ActionCard(4, "Cutpurse");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Embargo":
						c = new ActionCard(2, "Embargo");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Feast":
						c = new ActionCard(5, "Feast");
						kingdoms[i] = new ResourceStack(c, 10);
						break;
				case "Gardens":
						VictoryCard v = new VictoryCard(4, VictoryCard.VictoryName.Gardens);
						kingdoms[i] = new ResourceStack(v, 12);
						break;
				case "Great Hall":
						c = new ActionCard(3, "Great Hall");
						kingdoms[i] = new ResourceStack(c, 12);
						break;
				case "Mine":
						c = new ActionCard(5, "Mine");
						kingdoms[i] = new ResourceStack(c, 12);
						break;
				case "Smithy":
						c = new ActionCard(4, "Smithy");
						kingdoms[i] = new ResourceStack(c, 12);
						break;
				case "Village":
						c = new ActionCard(4, "Village");
						kingdoms[i] = new ResourceStack(c, 12);
						break;
				case "Sea Hag":
						c = new ActionCard(3, "Sea Hag");
						kingdoms[i] = new ResourceStack(c, 12);
			}
		}
	}

	public String playCard(int pos)
	{
		String effectResult = "Done";
		Card playedCard = players[currentPlayer].playCard(pos);
		if (playedCard != null)
		{
			String str = playedCard.toString();
			switch (str) {
				case "Copper":
					players[currentPlayer].money += 1;
					break;
				case "Silver":
					players[currentPlayer].money += 2;
					break;
				case "Gold":
					players[currentPlayer].money += 3;
					break;
				default:
					effectResult = actionCardHandler(playedCard);
			}

		}
		return effectResult;
	}
	
	public Card lookAtCardInHandAt(int pos, int player)
	{
		return players[player].hand.lookAtCardAt(pos);
	}
	
	public Card takeAtCardInHandAt(int pos, int player)
	{
		return players[player].hand.takeCardAt(pos);
	}
	
	public int getPlayerHandSize(int player)
	{
		return players[player].hand.cards.size();
	}
	
	public void addMoney(int howMuch, int player)
	{
		players[player].money += howMuch;
	}
	
	public void discard(int pos, int player)
	{
		players[player].discardFromHand(pos);
	}
	
	public void currentPlayerGainEstate()
	{
		if (!estatePile.cards.isEmpty())
			players[currentPlayer].discard.addCard(estatePile.takeTopCard());
	}
	
	public void addCopperToHand()
	{
		if (!copperPile.cards.isEmpty())
			players[currentPlayer].hand.addCard(copperPile.takeTopCard());
	}
	
	public void addSilverToHand()
	{
		if (!silverPile.cards.isEmpty())
			players[currentPlayer].hand.addCard(silverPile.takeTopCard());
	}
	
	public void addGoldToHand()
	{
		if (!silverPile.cards.isEmpty())
			players[currentPlayer].hand.addCard(silverPile.takeTopCard());
	}
	
	public boolean isHandEmpty(int player)
	{
		return players[player].hand.cards.isEmpty();
	}
	
	public void addToDiscard(Card e, int player)
	{
		players[player].discard.addCard(e);
	}
	
	public boolean isPileEmpty(String in)
	{
		return findResourceStack(in).cards.isEmpty();
	}
	
	public void addToTrash(Card e)
	{
		players[currentPlayer].trashPile.addCard(e);
	}
	
	public void trashFromHand(int pos)
	{
		players[currentPlayer].trash(pos);
	}
	
	public void addEmbargoToken(String stackName)
	{
		this.findResourceStack(stackName).CurseModifier += 1;
	}

	// IMPORTANT Each action will modify the player(s) and it will return a string result
	// This string will either be "Done"
	// Otherwise it will return the string of action card
	// This string needs to be handled at runtime
	// This is not something the game manager can control, but it does offer functionality to handle the events

	// The purpose of this is because the game manager is dependent on state but cannot make runtime decisions
	// Decisions that need to be made at runtime, must be handled outside of the GameManager
	public String actionCardHandler(Card actionCard)
	{
		String effectResult = "Done";
		players[currentPlayer].actions -= 1;
		String action = actionCard.toString();
		switch (action){
			case "Adventurer":
				// Reveal cards from your deck until you reveal 
				// 2 treasure cards then put them into your hand 
				// and discard the rest
				int treasureCount = 0;
				Card t = new CoinCard(0, CoinCard.CoinValue.Copper);
				boolean alreadyReplenishedDeck = false;
				while (treasureCount < 2 && !alreadyReplenishedDeck){
					if (players[currentPlayer].deck.cards.size() <= 0){
						players[currentPlayer].replenishDeck();
						alreadyReplenishedDeck = true;
					}
					Card e = players[currentPlayer].deck.takeTopCard();
					System.out.println(players[currentPlayer].playerName + " revealed " + e.toString());
					if (e.type.equals(t.type))
					{
						players[currentPlayer].hand.addCard(e);
						treasureCount ++;
					}
					else
						players[currentPlayer].discard.addCard(e);
				}
				
				break;
			case "Ambassador":
				effectResult = "Ambassador";
				break;
			case "Baron":
				players[currentPlayer].buys += 1;
				effectResult = "Baron";
				break;
			case "Council Room":
				// Gain 4 cards and one buy
				for(int i=0; i<4; i++)
					players[currentPlayer].drawCard();
				players[currentPlayer].buys += 1;

				// Each other player draws a card
				for(int i=0; i<numOfPlayers; i++)
				{
					if(i != currentPlayer)
						players[i].drawCard();
				}
				break;
			case "Cutpurse":
				// Gain 2 money
				players[currentPlayer].money += 2;

				// Eachother player discards a copper or shows a hand with no copper
				for (int i=0; i<numOfPlayers; i++)
				{
					if(i != currentPlayer)
					{
						boolean discarded = false;
						int j = 0;
						while( j < players[i].hand.cards.size() && !discarded)
						{
							if ( players[i].hand.lookAtCardAt(j).toString().equals("Copper") )
							{
								players[i].discardFromHand(j);
								discarded = true;
							}
							j++;
						}
						if (!discarded){
							players[i].printHand();
						}
					}
				}
				break;
			case "Embargo":
				players[currentPlayer].money += 2;
				players[currentPlayer].trashPile.addCard(players[currentPlayer].playPile.takeTopCard());
				effectResult = "Embargo";
				break;
			case "Feast":
				// Take the card you just played (feast) trash it and add 5 to your money
				players[currentPlayer].trashPile.addCard(players[currentPlayer].playPile.takeTopCard());
				players[currentPlayer].money += 5;
				break;
			case "Great Hall":
				players[currentPlayer].drawCard();
				players[currentPlayer].actions += 1;
				break;
			case "Mine":
				effectResult = "Mine";
				break;
			case "Smithy":
				for(int i=0; i<3; i++)
					players[currentPlayer].drawCard();
				break;
			case "Village":
				players[currentPlayer].drawCard();
				players[currentPlayer].actions += 2;
				break;
			case "Sea Hag":
				// Each player discards the top card and gains a curse
				for(int i=0; i<numOfPlayers; i++)
				{
					if ( i != currentPlayer )
					{
						players[i].discard.addCard(players[i].deck.takeTopCard());
						if (!cursePile.cards.isEmpty())
							players[i].discard.addCard( cursePile.takeTopCard() );
					}
				}
				break;
		}
		if (players[currentPlayer].actions < 1)
			players[currentPlayer].actionPhase = false;
		return effectResult;
	}

	public void endActions()
	{
		players[currentPlayer].actions = 0;
		players[currentPlayer].actionPhase = false;
	}

	public boolean inActionPhase()
	{
		return players[currentPlayer].actionPhase;
	}

	public void buy(ResourceStack buyFrom)
	{
		if (buyFrom != null)
		{
			if (buyFrom.cards.isEmpty()){
				System.out.println("***Cannot buy pile is empty***");
				return;
			}
			if (players[currentPlayer].buys <= 0)
			{
				System.out.println("***Cannot buy. Out of buys.***");
			}
			else if (buyFrom.stackType.cost > players[currentPlayer].money)
			{
				System.out.println("***Cannot buy. Not enough money to purchase card***");
			}
			else
			{
				endActions();
				for (int i=0; i<buyFrom.CurseModifier; i++)
				{
					if (!cursePile.cards.isEmpty())
						players[currentPlayer].discard.addCard(cursePile.takeTopCard());
				}
				players[currentPlayer].money -= buyFrom.stackType.cost;
				players[currentPlayer].discard.addCard(buyFrom.takeTopCard());
				players[currentPlayer].buys -= 1;
				if(players[currentPlayer].buys <= 0)
				{
					endPlayerTurn();
					//nextPlayer();
				}
			}
		}
		else
		{
			System.out.println("***No such resource pile***");
		}
	}

	public ResourceStack findResourceStack(String input)
	{
		ResourceStack ret = null;
		switch (input){
		case "Copper"	: return copperPile; 	
		case "Silver"	: return silverPile; 	
		case "Gold"  	: return goldPile; 		
		case "Estate"	: return estatePile; 	
		case "Duchy"	: return duchyPile;		
		case "Province" : return provincePile;	
		case "Curse"	: return cursePile;
		// Search kingdom cards
		default: 
			for(int i=0; i<10; i++)
			{
				if (input.equals(kingdoms[i].lookAtTopCard().toString()))
				{
					ret = kingdoms[i];
				}
			}
		}
		return ret;
	}
	
	public void AutoplayTreasures()
	{
		int i = 0;
		while(!players[currentPlayer].hand.cards.isEmpty() && i < players[currentPlayer].hand.cards.size())
		{
			Card var = players[currentPlayer].hand.lookAtCardAt(i);
			Card tr = new CoinCard(0, CoinCard.CoinValue.Copper);
			if (var.type.equals(tr.type))
				playCard(i);
			else
				i++;
			
		}
	}

	public void endPlayerTurn()
	{
		players[currentPlayer].endTurn();
		nextPlayer();
	}

	public void nextPlayer()
	{
		currentPlayer ++;
		if (currentPlayer > numOfPlayers - 1)
			currentPlayer = 0;
	}
	
	public boolean isGameOver()
	{
		boolean ret = false;
		if(provincePile.cards.size() <= 0)
		{
			ret = true;
		}
		else
		{
			int count = 0;
			if (copperPile.cards.size() <= 0)
				count ++;
			if (silverPile.cards.size() <= 0)
				count ++;
			if (goldPile.cards.size() <= 0)
				count ++;
			if (cursePile.cards.size() <= 0)
				count ++;
			if (estatePile.cards.size() <= 0)
				count ++;
			if (duchyPile.cards.size() <= 0)
				count ++;
			if (count >= 3)
				ret = true;
		}	
		return ret;	
	}
	
	public String winner()
	{
		int vicCount = 0;
		int winIndex = 0;
		for (int i=0; i<numOfPlayers; i++)
		{
			int vic = players[currentPlayer].victoryCount();
			if (vic > vicCount){
				winIndex = 1;
				vic = vicCount;
			}
		}
		String result = (players[currentPlayer].playerName + "is the winner with " + vicCount + " Victory points!");
		return result;
	}

	public void printPile(ResourceStack stack)
	{
		stack.printStack();
	}

	public void printBoard()
	{
		System.out.print("CurrentBoard:");
		printPile(copperPile);
		printPile(silverPile);
		printPile(goldPile);
		printPile(estatePile);
		printPile(duchyPile);
		printPile(provincePile);
		printPile(cursePile);
		for (int i=0; i<10; i++)
			printPile(kingdoms[i]);
		System.out.println("\n");
	}

	public void printCurrentPlayerFull()
	{
		players[currentPlayer].printPlayerFull();
	}

	public void printCurrentPlayer()
	{
		players[currentPlayer].printPlayer();
	}
	
	public void printCurrentPlayerHand()
	{
		players[currentPlayer].printHand();
	}

	public void printPlayerTurnStats()
	{
		players[currentPlayer].printCurrentStats();
	}
	public void printPlayerStandard()
	{
		players[currentPlayer].printCurrentStats();
		if (players[currentPlayer].discard.cards.size() < 1)
		{
			System.out.print("Discard: Empty\t");
		}
		else{
			System.out.print("Discard: " + players[currentPlayer].discard.lookAtTopCard().toString() + "\t");
		}
		System.out.print("Deck: " + players[currentPlayer].deck.cards.size());
		players[currentPlayer].printPlayPile();
		players[currentPlayer].printHand();

	}

}