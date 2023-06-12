package board;
import cards.Card;
import cards.Suite;

public class SuitePiles {
	
	//class variables
	private Card[] heartPile;
	private Card[] diamondPile;
	private Card[] spadePile;
	private Card[] clubPile;
	
	/**
	 * Constructor
	 */
	SuitePiles()
	{
		
		heartPile = new Card[13];
		diamondPile = new Card[13];
		spadePile = new Card[13];
		clubPile = new Card[13];
		
	}
	
	/**
	 * pile getter
	 * 
	 * @param suite
	 * @return
	 */
	public Card[] getPile(Suite suite)
	{
		
		switch (suite) 
		{
		
			case CLUB:
				
				return clubPile;
				
			case SPADE:
				
				return spadePile;
				
			case DIAMOND:
				
				return diamondPile;
				
			case HEART:
				
				return heartPile;	
				
			default:
				
				return null;
				
		}
		
	}
	
	
}
