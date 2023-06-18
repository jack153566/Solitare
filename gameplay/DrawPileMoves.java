package gameplay;
import cards.Card;
import board.Column;
import backend.ValidityChecks;
import board.SuitePiles;

public abstract class DrawPileMoves {
	
	/**
	 * Checks to see if targetCol is empty first and if targetCard is a king, if it is accepts the move, if not, checks that the column move is valid
	 * 
	 * @param selectedCard
	 * @param targetCol
	 */
	public void MoveToColumn(Card selectedCard, Column targetCol)
	{
		
		if (ValidityChecks.CheckValidKingMove(selectedCard,targetCol) == true)
		{
			
			targetCol.GetFaceUpCards().add(selectedCard);
			
		}
		
		else if(ValidityChecks.CheckValidColumnMove(selectedCard, targetCol.GetFaceUpCards().get(0))==true)
		{
			
			targetCol.GetFaceUpCards().add(selectedCard);
			
		}
		
	}
	
	//TODO FINISH METHOD THIS WILL NEED TO CALL TO A METHOD THAT GIVES INPUT TO WHICH PILE WAS USED
	public void MoveToSuitePile(SuitePiles pile, Card selectedCard, int cardCounter)
	{
		
		
	}
	
	

}
