package Cards;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public static void main(String[] args)
	{
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] pointValues = {2,1,6};
		
		ArrayList<Card> fullDeck = constructor(ranks, suits, pointValues);
	}
	
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
			Card chosenCard = deck.get(i);
			deck.remove(i);
			Dealt.add(chosenCard);
		}
		return null;
	}
	 
	public void shuffle(ArrayList<Card> deck)
	{
		//random number 1-51
		//Math.random() = ;
		//selection shuffle algorithm 
	}
}
