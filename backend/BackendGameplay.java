package backend;
import cards.Card;
/**
 * 
 * This class is used for not actual gameplay but updating the board state
 * 
 * @author down7857
 *
 */
import java.util.List;

import cards.Card;
public abstract class BackendGameplay {
	
	public static void RefillDeck(List<Card> drawPile, List<Card>deck)
	{
		
		for(int i=0; i< drawPile.size(); i++)
		{
			deck.add(drawPile.remove(0));
		}
				
	}
	
	/**
	 * This method checks to see if the column has any face up cards and flips one face up if it doesn't
	 * 
	 * @param Col being flipped
	 */
	public void FlipNewCard(Column col)
	{
		
		if (col.GetFaceUpCards().size()==0)
		{
			col.GetFaceUpCards().add(col.GetFaceDownCards().remove(0));
		}
		
	}
	
	//TODO FINISH METHOD
	public void CheckMoveValidity(Card selectedCard, Column target)
	{
		
	
		
		
	}
	
//	//TODO FINISH METHOD
//	public boolean CheckOppSuiteColor(Card card1, Card card2)
//	{
//			
//		
//		
//		
//	}

}
