package Cards;

public class Card {

	private String rank;
	private String suit;
	private int pointValue;
	
	//constructor
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}

	//getters
	public String getRank(Card card)
	{
		return this.rank;
	}
	public String getSuit(Card card)
	{
		return this.suit;
	}
	public int getPointValue(Card card)
	{
		return this.pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		return (this.pointValue == otherCard.pointValue);
	}
	
	@Override
	public String toString()
	{
		return "[" + this.rank + " " + this.suit + " " + this.pointValue + "]";
	}
}
