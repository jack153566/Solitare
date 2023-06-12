package board;
/**
 * 
 * This class is used for the actual board
 * 
 * @author down7857
 *
 */
//import java.util.ArrayList;
import java.util.List;

import backend.BackendInitialization;
import cards.Card;
public class Board  {
	
	
	//Class variables
	private List<Card> deck;
	
	private List<Card> drawPile;
	
	private Column column1;
	private Column column2;
	private Column column3;
	private Column column4;
	private Column column5;
	private Column column6;
	private Column column7;
	
	
	private Card heartPile[];
	private Card diamondPile[];
	private Card clubPile[];
	private Card spadePile[];
	
	//TODO FINISH CONSTRUCTOR
	public Board(){
		
		//initialize variables
		deck = BackendInitialization.CreateDeck();
		
		column1 = new Column();
		column2 = new Column();
		column3 = new Column();
		column4 = new Column();
		column5 = new Column();
		column6 = new Column();
		column7 = new Column();
		
		heartPile = new Card[13];
		diamondPile = new Card[13];
		clubPile = new Card[13];
		spadePile = new Card[13];
		
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
	
	public List<Card> GetDrawPile()
	{
		return this.drawPile;
	}
	
	public List<Card> GetDeck()
	{
		return this.deck;
	}
	
	public Card[] getPile(String pile)
	{
		
		if(pile.equals("Heart") )
		{
			return this.heartPile;
		}
		
		if(pile.equals("Spade") )
		{
			return this.spadePile;
		}
		
		if(pile.equals("Diamond"))
		{
			return this.diamondPile;
		}
		
		if(pile.equals("Club"))
		{
			return this.clubPile;
		}
	
		else
		{
			return null;
		}
	}

}
