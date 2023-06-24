package gameplay;
import backend.BackendGameplay;
import backend.ValidityChecks;
import board.Column;
import board.SuitePile;
import cards.*;


public abstract class ColumnMoves {
	
	
	public void MoveCardsToOtherColumn(Card targetCard, Card selectedCard, Column targetCol)
	{
		
		if(ValidityChecks.CheckValidColumnMove(targetCard,selectedCard)==true)
		{	
			targetCol.GetFaceUpCards().add(targetCol.GetFaceUpCards().indexOf(targetCard), selectedCard);
			
		}
		
		
	}
	
	public void MoveCardTosuitePile(SuitePile pile, Card card )
	{
		
		if(ValidityChecks.CheckValidSuitePileMove(pile, card)==true)
		{
			
			pile.GetPile().add(card);
			
		}
				
	}
	
}
