/*
	LIve run with two players

*/

import java.util.*;

public class GameRunner
{
	int numberOfPlayers;
	String[] names;
	String[] kingdoms;
	GameManager mgr;
	Scanner scan = new Scanner(System.in);
	
	public static boolean isInteger(String s) {
	    return isInteger(s,10);
	}

	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
	
	public GameRunner()
	{
		numberOfPlayers = 2;
		String[] names1 = { "John", "Molly"};
		String[] kingdoms1 = { "Adventurer","Ambassador","Baron",
				"Cutpurse","Embargo",
				"Feast","Gardens","Great Hall",
				"Mine","Sea Hag" };
		this.names = names1;
		this.kingdoms = kingdoms1;
		this.mgr = new GameManager(numberOfPlayers, names, kingdoms);
	}
	public GameRunner(String[] NAMES, String[] KINGDOMS, int NUMBEROFPLAYERS)
	{
		this.names = NAMES;
		this.kingdoms = KINGDOMS;
		this.numberOfPlayers = NUMBEROFPLAYERS;
		this.mgr = new GameManager(numberOfPlayers, names, kingdoms);
	}
	
	
	public void runGame()
	{
		
		mgr.printBoard();
		ActionCard a = new ActionCard(6,"Embargo");
		CurseCard c = new CurseCard();

		// Each player's turn
		// Action phase
		mgr.players[mgr.currentPlayer].hand.addCard(a);
		mgr.players[mgr.currentPlayer].buys += 2;
		while ( !mgr.isGameOver() )
		{
			
			//*/
			
			mgr.printBoard();
			mgr.printPlayerStandard();
			System.out.print("Enter index of card you whish to play or \ntype \"End Actions\" or \"End Turn\" or \ntype the resource pile you wish to buy from\n::>: ");
			
			// Handle all input cases
			String input = scan.nextLine();
			if (isInteger(input))
			{
				String playResult = mgr.playCard(Integer.parseInt(input));
				handleAdditionalActions(playResult);
				
			}
			else{
				switch (input){
					case "End Actions": mgr.endActions();
						break;
					case "End Turn": mgr.endPlayerTurn();
						break;
					case "Autoplay Treasures": mgr.AutoplayTreasures();
						break;
					default: mgr.buy(mgr.findResourceStack(input));
				}
			}

		}
		System.out.println(mgr.winner());

	}
	
	public void handleAdditionalActions(String input)
	{
		switch (input){
		case "Done": return;
		case "Baron":
			while (true){
				mgr.printCurrentPlayerHand();
				System.out.println("Type the index of the Estate card you wish to play");
				System.out.println("If you do not wish to play type \"None\"");
				System.out.print("::>");
				String userInput = scan.nextLine();
				
				if(isInteger(userInput))
				{
					int position = Integer.parseInt(userInput);
					if (position < 0 || position > mgr.getPlayerHandSize(mgr.currentPlayer))
					{
						System.out.println("Invalid hand position");
					}
					else
					{
						Card e = mgr.lookAtCardInHandAt(position, mgr.currentPlayer);
						if (e.type.equals(Card.Type.Victory)){
							VictoryCard t = (VictoryCard) e;
							if(t.place.equals(VictoryCard.VictoryName.Estate)){
								// Position is indeed Estate
								mgr.addMoney(4, mgr.currentPlayer);
								mgr.discard(position, mgr.currentPlayer);
								break;
							}
							else
								System.out.println("Card is not Estate");
						}
						else
							System.out.println("Card is not Estate");
					}
				}
				else if(userInput.equals("None"))
				{
					mgr.currentPlayerGainEstate();
					break;
				}
				else
					System.out.println("Unrecognized input");
			}
			break;
			// End Baron
			
		case "Mine":
			boolean done = false;
			while (!done)
			{
				mgr.printCurrentPlayerHand();
				System.out.println("Type the index of the Treasure card you wish to play");
				System.out.println("If you do not wish to play type \"None\"");
				System.out.print("::>");
				String userInput = scan.nextLine();
				
				if(isInteger(userInput))
				{
					int position = Integer.parseInt(userInput);
					if (position < 0 || position > mgr.getPlayerHandSize(mgr.currentPlayer))
					{
						System.out.println("Invalid hand position");
					}
					else
					{
						Card e = mgr.lookAtCardInHandAt(position, mgr.currentPlayer);
						if (e.type.equals(Card.Type.Treasure)){
							CoinCard t = (CoinCard) e;
							// Position is indeed a Coin card
							while (true){
								int gain = t.cost + 3;
								System.out.println("Type a Treasure card costing " + gain + " or less");
								System.out.print("::>");
								String in = scan.nextLine();
								if(in.equals("Copper")) { mgr.addCopperToHand(); done = true; break; }
		
								else if(in.equals("Silver") && gain >= 3) { mgr.addSilverToHand(); done = true; break; }
									
								else if(in.equals("Gold") && gain >= 6) { mgr.addGoldToHand(); done = true; break; }
								
								else System.out.println("Not enough money or input");
									
							}
						}
						else
							System.out.println("Card is not Treasure");
					}
				}
				else if(userInput.equals("None"))
				{
					break;
				}
				else
					System.out.println("Unrecognized input");
			}
			break;
		
		case "Ambassador": 
			while (true)
			{
				if (!mgr.isHandEmpty(mgr.currentPlayer)){
					mgr.printCurrentPlayerHand();
					System.out.println("Type the index of the card you wish to play");
					System.out.println("If you do not wish to play type \"None\"");
					System.out.print("::>");
					String userInput = scan.nextLine();
					
					if(isInteger(userInput))
					{
						// Position in hand found get card e
						int position = Integer.parseInt(userInput);
						if(!(position < 0 || position >= mgr.getPlayerHandSize(mgr.currentPlayer)))
						{
							Card e = mgr.takeAtCardInHandAt(position, mgr.currentPlayer);
						
							while(true)
							{
								// Get identical card c
								mgr.printCurrentPlayerHand();
								System.out.println("Type the index of a smilar card or type anything else to be done");
								System.out.print("::>");
								String in = scan.nextLine();
								
								if(isInteger(in))
								{
									int p = Integer.parseInt(in);
									if(p < 0 || p >= mgr.getPlayerHandSize(mgr.currentPlayer))
										System.out.println("Position not in hand");
									else
									{
										Card c = mgr.takeAtCardInHandAt(p, mgr.currentPlayer);
										if (!e.equals(c))
											System.out.println("Not a duplicate card");
										else
										{
											mgr.findResourceStack(e.toString()).addCard(c);
											break;
										}
									}
								}
								else
									break;
							}
							mgr.findResourceStack(e.toString()).addCard(e);
							for(int i=0; i<numberOfPlayers; i++)
							{
								if(i != mgr.currentPlayer && !mgr.isPileEmpty( e.toString() ) )
									mgr.addToDiscard(mgr.findResourceStack(e.toString()).takeTopCard(), i);
							}
							break;
						}
						else
							System.out.println("Position not in hand");
					}
					else if (userInput.equals("None"))
						break;
					else
						System.out.println("Unrecognized input");
				}
			}
		case "Embargo":
			boolean loopDone = false;
			while (!loopDone)
			{
				mgr.printCurrentPlayerHand();
				System.out.println("Type the supply pile you wish to embargo");
				System.out.println("If you do not put embargo token type\"None\"");
				System.out.print("::>");
				String userInput = scan.nextLine();
				switch(userInput){
				case "Copper":
					mgr.addEmbargoToken("Copper");
					loopDone = true;
					break;
				case "Silver":
					mgr.addEmbargoToken("Silver");
					loopDone = true;
					break;
				case "Gold":
					mgr.addEmbargoToken("Gold");
					loopDone = true;
					break;
				case "Estate":
					mgr.addEmbargoToken("Estate");
					loopDone = true;
					break;
				case "Duchy":
					mgr.addEmbargoToken("Duchy");
					loopDone = true;
					break;
				case "Province":
					mgr.addEmbargoToken("Province");
					loopDone = true;
					break;
				case "None":
					loopDone = true;
					break;
				default:
					System.out.println("Unrecognized Input");
				}
			}
		}
		// End cases
	}

	public static void printTurn(Player myPlayer)
	{
		System.out.println("\nNewTurn\nDeck:");
		for( Card e : myPlayer.deck.cards ){
			System.out.println(e.toString());
		}
		System.out.println("\nHand:");
		for( Card e : myPlayer.hand.cards ){
			System.out.println(e.toString());
		}
		System.out.println("\nDiscard:");
		for( Card e : myPlayer.discard.cards ){
			System.out.println(e.toString());
		}
		System.out.println("\nPlayPile:");
		for( Card e : myPlayer.playPile.cards ){
			System.out.println(e.toString());
		}
	}

}