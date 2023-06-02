package backend;
import java.util.ArrayList;
import java.util.List;

public class Column {	
	
	private List<Card>faceDownCards;
	private List<Card>faceUpCards;
	
	
	/**
	 * Constructor
	 */
	Column(){
		
		@SuppressWarnings("rawtypes")
		ArrayList<List>Column = new ArrayList<List>(2);
		
		faceDownCards = new ArrayList<Card>();
		faceUpCards = new ArrayList<Card>();
		
		Column.add(faceDownCards);
		Column.add(faceUpCards);
		
	}
	
	
	/**
	 * Gets the Face up Cards of the column
	 * 
	 * @return
	 */
	public List<Card> GetFaceUpCards()
	{
		return this.faceUpCards;
	}
	
	/**
	 * gets the face down cards of the column
	 * 
	 * @return
	 */
	public List<Card> GetFaceDownCards()
	{
		return this.faceDownCards;
	}
	

}
