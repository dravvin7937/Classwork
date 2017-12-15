package Cards;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public Deck(ArrayList<Card> unDealt, ArrayList<Card> Dealt)
	{
		this.unDealt = unDealt;
		this.Dealt = Dealt;
	}
	
	public static ArrayList<Card> constructor(String[] ranks, String[] suits, int[] pointValues)
	{
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for (int r = 0; r < ranks.length; r++)
		{
			for (int s = 0; s < suits.length; s++)
			{
				for (int pv = 0; pv < pointValues.length; pv++)
				{
					Card newCard = new Card(ranks[r], suits[s], pointValues[pv]);
					deck.add(newCard);
				}
			}
		}
		return deck;
	}
	
	public boolean isEmpty(ArrayList<Card> deck)
	{
		return (deck.size() == 0);
	}
	
	public int size(ArrayList<Card> deck)
	{
		return deck.size();
	}
	
	public Card deal(ArrayList<Card> deck)
	{
		if (isEmpty(deck))
				return null;
		
		for (int i = 0; i < size(deck); i++)
		{
			Dealt.add(deck.remove(i));
		}
		return null;
	}
	 
	public static void shuffle(ArrayList<Card> deck)
	{
		for (int k = 51; k > 0; k--)
		{
			int r = (int)(Math.random() * k);
			swap(deck, k, r);
		}
		
	}
	
	public static void swap(ArrayList<Card> deck, int i, int j)
	{
		Card temp = deck.get(i);
		deck.add(i, deck.get(j));
		deck.add(j, temp);
	}
}
