package gameplay;
import backend.BackendGameplay;
import backend.ValidityChecks;
import board.Column;
import board.SuitePile;
import cards.*;


public abstract class ColumnMoves {
	
	/**
	 * Moves selected card to a column at the targetCard slot if move is valid
	 * 
	 * @param targetCard
	 * @param selectedCard
	 * @param targetCol
	 */
	public void MoveCardsToOtherColumn(Card targetCard, Card selectedCard, Column targetCol)
	{
		
		if(ValidityChecks.CheckValidColumnMove(targetCard,selectedCard)==true)
		{	
			targetCol.GetFaceUpCards().add(targetCol.GetFaceUpCards().indexOf(targetCard), selectedCard);
		}
		
		
	}
	
	/**
	 * Moves selected card to SuitePile if move is valid
	 * 
	 * @param pile
	 * @param card
	 */
	public void MoveCardTosuitePile(SuitePile pile, Card card )
	{
		
		if(ValidityChecks.CheckValidSuitePileMove(pile, card)==true)
		{
			pile.GetPile().add(card);	
		}
				
	}
	
}
