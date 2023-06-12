package cards;
/**
 * 
 * @author Jackson
 *
 *this Class creates the cards in the Solitare game.
 *
 */
public class Card{
	
	private int value;
	private String suite;
	
	//Constructor
	public Card(cards.Suite suite, cards.Value values)
	{
		
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