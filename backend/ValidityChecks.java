package backend;
import cards.Card;
import cards.Suite;

public abstract class ValidityChecks {
	
	public boolean CheckValidMove(Card targetCard, Card selectedCard)
	{
		
		 boolean isValidMove = false;
		 
		 if(IsOppositeColors(targetCard, selectedCard) == true && IsNumericalOrder(targetCard, selectedCard) == true)
		 {
			 isValidMove = true;
		 }
		 
		 return isValidMove;
		 
	}
	
	private boolean IsOppositeColors(Card targetCard, Card selectedCard)
	{
		
		boolean isOppositeColor = false;
		
		if(targetCard.GetSuite().equalsIgnoreCase(Suite.CLUB.GetSuite()) || targetCard.GetSuite().equalsIgnoreCase(Suite.SPADE.GetSuite()) &&
		   selectedCard.GetSuite().equalsIgnoreCase(Suite.HEART.GetSuite()) || selectedCard.GetSuite().equalsIgnoreCase(Suite.DIAMOND.GetSuite())  )
		{
			
			isOppositeColor = true;
			
			return isOppositeColor;
			
		}
		
		if(targetCard.GetSuite().equalsIgnoreCase(Suite.HEART.GetSuite()) || targetCard.GetSuite().equalsIgnoreCase(Suite.DIAMOND.GetSuite()) &&
				   selectedCard.GetSuite().equalsIgnoreCase(Suite.CLUB.GetSuite()) || selectedCard.GetSuite().equalsIgnoreCase(Suite.SPADE.GetSuite())  )
				{
					
					isOppositeColor = true;
					
					return isOppositeColor;
					
				}
		
		return isOppositeColor;
		
	}
	
	private boolean IsNumericalOrder(Card targetCard, Card selectedCard)
	{
		
		boolean isCorrectOrder = false;
		
		if(targetCard.GetValue()-1 == selectedCard.GetValue())
		{
			isCorrectOrder = true;
		}
		
		return isCorrectOrder;
		
	}
	

}
