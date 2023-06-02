package backend;
import java.util.List;
public abstract class Gameplay {
	
	private int heartCounter = 0;
	private int clubCounter = 0;
	private int diamondCounter = 0;
	private int spadeCounter = 0;
	
	/**
	 * This method draws a card and refills the deck if all cards have been drawn
	 * 
	 * @param deck
	 * @param drawPile
	 */
	public void drawCard(Board board)
	{
		
		if(board.GetDeck().isEmpty()==true)
		{
			BackendGameplay.RefillDeck(board.GetDrawPile(),board.GetDeck());
		}
		
		else
		{
			board.GetDrawPile().add(board.GetDeck().remove(0));
		}
		
	}
	
	//TODO FINISH METHOD
	public void PlaceCardFromDeck()
	{
		
	}
	
	public void MoveCardsFromColumn(Column fromCol, Column toColumn)
	{
		
	}
	
	//TODO FINISH METHOD
	public void PlaceCardInPile()
	{
		
	}
	
	//TODO FINISH METHOD
	public void PlaceKingInNewColumn()
	{
		
	}

}
