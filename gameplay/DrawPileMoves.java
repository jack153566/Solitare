package gameplay;
import cards.Card;
import board.Column;
import backend.ValidityChecks;
import board.SuitePile;

public abstract class DrawPileMoves {
	
	/**
	 * Checks that the column move is valid
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
	
	/**
	 * Moves card to suite pile if move is valid
	 * 
	 * @param pile
	 * @param selectedCard
	 */
	public void MoveToSuitePile(SuitePile pile, Card selectedCard)
	{
		
		if(ValidityChecks.CheckValidSuitePileMove(pile, selectedCard)==true)
		{
			
			pile.GetPile().add(selectedCard);
			
		}
		
	}

}
