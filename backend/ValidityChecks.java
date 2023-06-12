package backend;
import board.Column;
import cards.Card;
import cards.Suite;

public abstract class ValidityChecks {
	
	public boolean CheckValidColumnMove(Card targetCard, Card selectedCard)
	{
		
		 boolean isValidMove = false;
		 boolean isOppositeColor = false;
		 boolean isCorrectOrder = false;
		
		
		 //This if checks for a black target card and a red selected card
		if(targetCard.GetSuite().equalsIgnoreCase(Suite.CLUB.GetSuite()) || targetCard.GetSuite().equalsIgnoreCase(Suite.SPADE.GetSuite()) &&
		   selectedCard.GetSuite().equalsIgnoreCase(Suite.HEART.GetSuite()) || selectedCard.GetSuite().equalsIgnoreCase(Suite.DIAMOND.GetSuite())  )
		
		{
			isOppositeColor = true;			
		}
		 
		//This if checks for a red target card and a black selected card
		if(targetCard.GetSuite().equalsIgnoreCase(Suite.HEART.GetSuite()) || targetCard.GetSuite().equalsIgnoreCase(Suite.DIAMOND.GetSuite()) &&
		   selectedCard.GetSuite().equalsIgnoreCase(Suite.CLUB.GetSuite()) || selectedCard.GetSuite().equalsIgnoreCase(Suite.SPADE.GetSuite())  )
		
		{			
					isOppositeColor = true;				
		}
		
		//this checks for numerical value correctness
		if(targetCard.GetValue()-1 == selectedCard.GetValue())
		{
			isCorrectOrder = true;
		}
		
		 
		 //this checks to make sure all conditions are true to make sure it is a valid move
		 if(isOppositeColor == true && isCorrectOrder == true)
		 {
			 isValidMove = true;
		 }
		 
		 return isValidMove;
		 
	}
	
	public boolean CheckValidPileMove(Card[] pile, Card card, int cardCounter)

	{
		
		boolean isValidMove = false;
		
		if(pile[cardCounter].GetValue()+1 == card.GetValue())
		{
			
			isValidMove = true;
			
		}
		
		return isValidMove;
		
	}
	
	public boolean CheckValidKingMove(Card KingCard, Column column)
	{
		
		boolean validKingMove = false;
		
		if(column.GetFaceUpCards().isEmpty()==true && column.GetFaceDownCards().isEmpty() == true && KingCard.GetValue()==12)
		{
			validKingMove = true;
		}
		
		return validKingMove;
		
	}

}
