package cards;
/**
 * 
 * @author Jackson
 *
 *this Class creates the cards in the Solitare game.
 *
 */
public class Card{
	
//	private int value;
	private String suite;
	private int value;
	
	//Constructor
	public Card(cards.Suite suite, cards.Value value)
	{
		
		this.suite=suite.GetSuite();
		this.value=value.GetValue();
		
	}
		
	public int GetValue()
	{
		return this.value;	
	}
	
	public String GetSuite()
	{
		return this.suite;	
	}
	
}