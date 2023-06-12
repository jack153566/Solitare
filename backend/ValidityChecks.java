package backend;
import board.Column;
import cards.Card;
import cards.Suite;
import cards.Value;

public abstract class ValidityChecks {
	
	public boolean CheckValidColumnMove(Card targetCard, Card selectedCard, Column column)
	{
		
		 boolean isValidMove = false;
		 boolean isOppositeColor = false;
		 boolean isCorrectOrder = false;
		
		 //checks if the card is a king and the column that is selected is empty, returns valid move if both are true
		 if(targetCard.GetValue()==Value.KING.GetValue() && CheckIfColumnIsEmpty(column) == true)
		 {
			 
			 isValidMove = true;
			 
			 return isValidMove;
			 
		 }
		
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
	
	public boolean CheckValidSuitePileMove(Card[] pile, Card card, int cardCounter)

	{
		
		boolean isValidMove = false;
		
		if(pile[cardCounter].GetValue()+1 == card.GetValue())
		{
			
			isValidMove = true;
			
		}
		
		return isValidMove;
		
	}	
	
	public boolean CheckIfColumnIsEmpty(Column column)
	{
		
		boolean columnEmpty = false;
		
		if(column.GetFaceDownCards().isEmpty()==true && column.GetFaceUpCards().isEmpty()==true)
		{
			columnEmpty = true;
		}
		
		return columnEmpty;
		
	}

}
