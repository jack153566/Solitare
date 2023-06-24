package board;
/**
 * 
 * This class is used for the actual board
 * 
 * @author down7857
 *
 */
import backend.BackendInitialization;
import cards.Card;
import cards.Suite;
import java.util.Stack;

public class Board  {
	
	//Class variables
	private Deck deck;
	
	private DrawPile drawPile;
	
	private Column column1;
	private Column column2;
	private Column column3;
	private Column column4;
	private Column column5;
	private Column column6;
	private Column column7;
	
	private SuitePile heartPile;
	private SuitePile diamondPile;
	private SuitePile clubPile;
	private SuitePile spadePile;
	
	/**
	 * Constructor
	 */
	public Board(){
		
		//initialize variables
		deck = new Deck();
		
		column1 = new Column();
		column2 = new Column();
		column3 = new Column();
		column4 = new Column();
		column5 = new Column();
		column6 = new Column();
		column7 = new Column();
		
		heartPile = new SuitePile(Suite.HEART);
		diamondPile = new SuitePile(Suite.DIAMOND);
		clubPile = new SuitePile(Suite.CLUB);
		spadePile = new SuitePile(Suite.SPADE);
		
		//sets up initial board
		BackendInitialization.SetUpBoard(this);
		
	}
	
	/**
	 * Column Getter
	 * 
	 * @param columnNum used to specify which column is needed.
	 * @return
	 */
	public Column GetColumn(int columnNum)
	{	
		
			switch(columnNum)
			{
			
				case 1: return this.column1;
				
				case 2: return this.column2;
				
				case 3: return this.column3;
				
				case 4: return this.column4;
				
				case 5: return this.column5;
				
				case 6: return this.column6;
				
				case 7: return this.column7;
				
				default: return null;
				
			} 
		
	}	
	
	/**
	 * Draw Pile Getter
	 * 
	 * @return
	 */
	public DrawPile GetDrawPile()
	{
		return this.drawPile;
	}
	
	/**
	 * Deck getter
	 * 
	 * @return
	 */
	public Deck GetDeck()
	{
		return this.deck;
	}
	
	/**
	 * 
	 * Suite Pile Getter
	 * 
	 * @param suite used to specify which suite pile
	 * @return
	 */
	public SuitePile GetSuitePile(String suite)
	{
		
		SuitePile error = new SuitePile();
		
		switch(suite)
		{
		
			case "Heart": return heartPile;
			case "Diamond": return diamondPile;
			case "Club": return clubPile;
			case "Spade": return spadePile;
			
			default: return error;
		
		}
	}

}
