package backend;
import cards.Card;
import cards.Suite;
import cards.Value;
import java.util.ArrayList;

import board.Board;

public abstract class BackendInitialization {
	
	/**
	 * Creates the initial deck and returns it
	 * 
	 * @return
	 */
	public static ArrayList<Card> CreateDeck()
	{
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		for(int i=0; i<52; i++)
		{
			
			for(Suite s: Suite.values())
			{
				
				for(Value v: Value.values())
				{
					
					deck.add(new Card(s, v));
					
				}
				
			}
			
		}
		
		return deck;
		
	}
	
	/**
	 * Sets up the columns of the board
	 * 
	 * @param board
	 */
	public static void SetUpBoard(Board board)
	{
		
		//puts the face down cards on the board
		for(int i=2; i<8;i++)
		{
			
			for(int j=1; j<i; j++)
			{
				board.GetColumn(i)
				.GetFaceDownCards()
				.add(board.GetDeck()
				.GetDeck().remove(0));
			}
			
		}
		
		//puts the face up cards on the board
		for(int i=1; i<8; i++)
		{
			
			board.GetColumn(i)
			.GetFaceUpCards()
			.add(board.GetDeck()
			.GetDeck().remove(0));
			
		}
		
	}

}
