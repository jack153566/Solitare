package board;
import cards.Card;
import cards.Suite;
import java.util.Stack;

public final class SuitePiles {
	
	//class variables
	private Stack<Card> heartPile;
	private Stack<Card> diamondPile;
	private Stack<Card> spadePile;
	private Stack<Card> clubPile;
	
	/**
	 * Constructor
	 */
	SuitePiles()
	{
		
		heartPile = new Stack<Card>();
		diamondPile = new Stack<Card>();
		spadePile = new Stack<Card>();
		clubPile = new Stack<Card>();
		
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
	
}
