package board;
import cards.Card;
import cards.Suite;
import java.util.Stack;

public final class SuitePile {
	
	//class variables
	private Stack<Card> Pile;
	private String Suite;

	
	/**
	 * Constructor
	 */
	SuitePile(Suite Suite)
	{
		
		Pile = new Stack<Card>();
		this.Suite = Suite.GetSuite();
		
	}
	
	public SuitePile() {
		
		System.exit(0);
		
	}

	public String GetSuite()
	{
		return this.Suite;
	}
	
	public Stack<Card> GetPile()
	{
		return this.Pile;
	}
	
}
