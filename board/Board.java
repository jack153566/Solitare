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
	
	private SuitePiles suitePiles;
	
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
		
		suitePiles = new SuitePiles();
		
		//sets up initial board
		BackendInitialization.SetUpBoard(this);
		
	}
	
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
	
	public DrawPile GetDrawPile()
	{
		return this.drawPile;
	}
	
	public Deck GetDeck()
	{
		return this.deck;
	}
	
	public Stack<Card> GetSuitesPile(Suite suite)
	{
		
		return this.suitePiles.getPile(suite);	
		
	}

}
