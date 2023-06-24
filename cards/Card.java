package cards;
/**
 * 
 * @author Jackson
 *
 *this Class creates the cards in the Solitare game.
 *
 */
public class Card{
	
	private String suite;
	private int value;
	
	/**
	 * Constructor
	 * 
	 * @param suite
	 * @param value
	 */
	public Card(cards.Suite suite, cards.Value value)
	{
		
		this.suite=suite.GetSuite();
		this.value=value.GetValue();
		
	}
	
	/**
	 * Value getter
	 * 
	 * @return
	 */
	public int GetValue()
	{
		return this.value;	
	}
	
	/**
	 * Suite getter
	 * 
	 * @return
	 */
	public String GetSuite()
	{
		return this.suite;	
	}
	
}