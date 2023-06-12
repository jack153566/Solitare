package gameplay;
import cards.Card;
import board.Column;
import backend.ValidityChecks;

public abstract class DrawPileMoves {
	
	
	public void MoveToColumn(Card targetCard, Column targetCol)
	{
		
		if (ValidityChecks.CheckValidKingMove(targetCard,targetCol) == true)
		{
			
			targetCol.GetFaceUpCards().add(targetCard);
			
		}
		
		else if(ValidityChecks.CheckValidColumnMove(targetCard, targetCol.GetFaceUpCards().get(0))==true)
		{
			
			targetCol.GetFaceUpCards().add(targetCard);
			
		}
		
	}
	
	//TODO FINISH METHOD
	public void MoveToSuitePile()
	{
		
	}
	
	

}
