package backend;
import board.Column;
import cards.Card;
import cards.Suite;
import cards.Value;
import board.SuitePile;

public abstract class ValidityChecks {
	
	public static boolean CheckValidColumnMove(Card targetCard, Card selectedCard)
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
	
	
	public static boolean CheckValidSuitePileMove(SuitePile pile, Card card)

	{
		
		
		
		if(pile.GetPile().isEmpty()==true && card.GetValue()==Value.ACE.GetValue())
		{
			return true;
		}
		
		
		if(pile.GetPile().lastElement().GetValue()+1 == card.GetValue() && card.GetSuite().equalsIgnoreCase(pile.GetSuite()))
		{
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean CheckValidKingMove(Card KingCard, Column column)
	{
		
		boolean validKingMove = false;
		
		if(CheckIfColumnIsEmpty(column)==true && KingCard.GetValue()==Value.KING.GetValue())
		{
			validKingMove = true;
		}
		
		return validKingMove;
		
	}
	
	private static boolean CheckIfColumnIsEmpty(Column column)
	{
		
		boolean columnEmpty = false;
		
		if(column.GetFaceDownCards().isEmpty()==true && column.GetFaceUpCards().isEmpty()==true)
		{
			columnEmpty = true;
		}
		
		return columnEmpty;
		
	}

}
