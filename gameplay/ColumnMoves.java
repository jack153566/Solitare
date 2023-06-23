package gameplay;
import backend.BackendGameplay;
import backend.ValidityChecks;
import board.Column;
import cards.*;


public abstract class ColumnMoves {
	
	
	public void MoveCardsToOtherColumn(Card targetCard, Card selectedCard, Column targetCol)
	{
		
		if(ValidityChecks.CheckValidColumnMove(targetCard,selectedCard)==true)
		{	
			targetCol.GetFaceUpCards().add(targetCol.GetFaceUpCards().indexOf(targetCard), selectedCard);
			
		}
		
		
	}
	
	//TODO FINISH METHOD
	public void MoveCardTosuitePile(Column col, Card card )
	{
		
	}
	
	 

}
