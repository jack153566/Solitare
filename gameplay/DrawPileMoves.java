package gameplay;
import cards.Card;
import board.Column;
import backend.ValidityChecks;
import board.SuitePile;

public abstract class DrawPileMoves {
	
	/**
	 * Checks to see if targetCol is empty first and if targetCard is a king, if it is accepts the move, if not, checks that the column move is valid
	 * 
	 * @param selectedCard
	 * @param targetCol
	 */
	public void MoveToColumn(Card targetCard, Card selectedCard, Column targetCol)
	{
		
		if(ValidityChecks.CheckValidColumnMove(targetCard, selectedCard, targetCol)==true)
		{
			
			targetCol.GetFaceUpCards().add(selectedCard);
			
		}
		
	}
	
	public void MoveToSuitePile(SuitePile pile, Card selectedCard)
	{
		
		if(ValidityChecks.CheckValidSuitePileMove(pile, selectedCard)==true)
		{
			
			pile.GetPile().add(selectedCard);
			
		}
		
	}

}
