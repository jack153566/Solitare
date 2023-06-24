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
	
	/**
	 * deck getter
	 * 
	 * @return
	 */
	public List<Card>GetDeck()
	{
		
		return this.deck;
		
	}

}
