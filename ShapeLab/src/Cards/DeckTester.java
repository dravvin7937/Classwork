package Cards;

import java.util.ArrayList;

public class DeckTester {

	public static void main(String[] args)
	{
		//build, shuffle, deal
		
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
		int[] pointValues = {2,3,4,5,6,7,8,9,10,10,10,11};
		
		ArrayList<Card> fullDeck = Deck.constructor(ranks, suits, pointValues);
		Deck.shuffle(fullDeck);
		
		for (Card card : fullDeck)
		{
			System.out.println(card.toString());
		}
	}
	
}
