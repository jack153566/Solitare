package cards;

public enum Suite {
	
	SPADE("SPADE"),
	CLUB("CLUB"),
	HEART("HEART"),
	DIAMOND("DIAMOND");
	
	private String suite;
	
	 Suite(String suite)
	{
		this.suite = suite;
	}
	 
	 
	 public String GetSuite()
	 {
		 return this.suite;
	 }

}



