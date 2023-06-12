package board;

import java.util.List;

import backend.BackendInitialization;
import cards.Card;

public final class Deck {
	
	//Class Variables
	private List<Card> deck;
	
	/**
	 * Constructor
	 */
	Deck()
	{
		this.deck = BackendInitialization.CreateDeck();
	}
	
	public List<Card>GetDeck()
	{
		
		return this.deck;
		
	}

}
