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
	
	//USED FOR ERROR HANDLING
	public SuitePile() {
		
		System.exit(0);
		
	}
	
	/**
	 * Suite variable getter
	 * 
	 * @return
	 */
	public String GetSuite()
	{
		return this.Suite;
	}
	
	/**
	 * Stack variable getter
	 * 
	 * @return
	 */
	public Stack<Card> GetPile()
	{
		return this.Pile;
	}
	
}
