package backend;
import java.util.ArrayList;
import java.util.Collections;
public abstract class BackendInitialization {
	
	
	/**
	 * 
	 * Creates the initial deck at the start of the game and shuffles it.
	 * 
	 * @return Initial deck
	 */
	public static ArrayList<Card> CreateDeck()
	{
		
		ArrayList <Card> deck = new ArrayList<Card>();
		
		
		for(int i=0; i<4;i++)
		{
			
			for(int j=0; j<13;j++)
			{
				
				//Creates the Diamond cards and adds them to the deck
				if(i==0)
				{
					Card card = new Card(j+1,"Diamond");
					deck.add(card);
				}
				
				//Creates the Heart cards and adds them to the deck
				if(i==1)
				{
					Card card = new Card(j+1,"Heart");
					deck.add(card);		
				}
				
				//Creates the Club cards and adds them to the deck
				if(i==2)
				{	
					Card card = new Card(j+1,"Clubs");
					deck.add(card);
				}
				
				//Creates the Spade cards and adds them to the deck
				if(i==3)
				{
					Card card = new Card(j+1,"Spades");
					deck.add(card);
				}
					
			}
			
		}
		
		Collections.shuffle(deck);
		
		return deck;
		
	}
	
	
	/**
	 * Sets up the columns of the board
	 * 
	 * @param board
	 */
	public static void SetUpBoard(Board board)
	{
		
		//puts the face down cards on the board
		for(int i=2; i<8;i++)
		{
			
			for(int j=1; j<i; j++)
			{
				board.GetColumn(i)
				.GetFaceDownCards()
				.add(board.GetDeck().remove(0));
			}
			
		}
		
		//puts the face up cards on the board
		for(int i=1; i<8; i++)
		{
			
			board.GetColumn(i)
			.GetFaceUpCards()
			.add(board.GetDeck().remove(0));
			
		}
		
		
	}

}
