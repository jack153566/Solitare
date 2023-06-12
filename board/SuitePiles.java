package board;
import cards.Card;
import cards.Suite;

public final class SuitePiles {
	
	//class variables
	private Card[] heartPile;
	private Card[] diamondPile;
	private Card[] spadePile;
	private Card[] clubPile;
	
	private int heartCounter;
	private int diamondCounter;
	private int spadeCounter;
	private int clubCounter;
	
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
	
	public int getCounter(Suite suite)
	{
		
		switch (suite) 
		{
		
			case CLUB:
				
				return clubCounter;
				
			case SPADE:
				
				return spadeCounter;
				
			case DIAMOND:
				
				return diamondCounter;
				
			case HEART:
				
				return heartCounter;	
				
			default:
				
				//error if this is reached
				System.exit(0);
				return 0;
				
		}
		
	}
	
	
}
