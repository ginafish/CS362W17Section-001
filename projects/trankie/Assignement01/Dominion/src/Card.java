import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Card{
	public static enum Type{
		ACTION, TREASURE, VICTORY;
	}
	public static enum CardName{
		Gold, Silver, Cooper, Province, Duchy, Estate, Curse;
	}
	private Type CardType;
	private CardName cardName;
	private int cost, score, treasureValue;
	
	private Card(CardName cardName, Type type, int cost, int score, int treasureValue){
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.CardType = type;
		this.cardName = cardName;
	}
	public Type getType(){
		return CardType;
	}
	public CardName getCardName(){
		return cardName;
	}
	public int getCost(){
		return cost;
	}
	public int getTreasureValue(){
		return treasureValue;
	}
	public int getScore(){
		return score;
	}
	public static List<Card> createCards(){
		List<Card> ret = new LinkedList<Card>();
		Card o;
		Random rand = new Random();
		int randomInt, victoryCounter=0, mainCounter = 0, treasureCounter = 0;
		
		while(true){
			randomInt = rand.nextInt(10);
			if(randomInt % 2 == 0 && victoryCounter != 3){
				o = new Card(CardName.Estate, Type.VICTORY, 2, 3 , 0);
				ret.add(o);
				victoryCounter++;
				mainCounter++;
			}
			else if(treasureCounter != 7){
				o = new Card(CardName.Cooper, Type.TREASURE, 0, 0, 1);
				ret.add(o);
				treasureCounter++;
				mainCounter++;
			}
			if(mainCounter == 10)
				break;
		}
		return ret;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(" \n\t" + this.getCardName());
		sb.append("-" + this.getType() + " ");
		sb.append("\tCost: " + this.cost + " ");
		sb.append("\tScore: " + this.score + " ");
		sb.append("\tTreasure Value: " + this.treasureValue);
		
		return sb.toString();
	}
}
