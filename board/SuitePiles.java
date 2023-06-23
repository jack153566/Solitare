package board;
import cards.Card;
import cards.Suite;
import java.util.Stack;

public final class SuitePiles {
	
	//class variables
	private Stack heartPile;
	private Stack diamondPile;
	private Stack spadePile;
	private Stack clubPile;
	
	private int heartCounter;
	private int diamondCounter;
	private int spadeCounter;
	private int clubCounter;
	
	/**
	 * Constructor
	 */
	SuitePiles()
	{
		
		heartPile = new Stack();
		diamondPile = new Stack();
		spadePile = new Stack();
		clubPile = new Stack();
		
	}
	
	/**
	 * pile getter
	 * 
	 * @param suite
	 * @return
	 */
	public Stack getPile(Suite suite)
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
