/*
 * Aarav Goyal
 * 10/23/2024
 * Food2.java
  
*/


public class Food2
{
	protected String str;
	
	public Food2 ()
	{
		str = new String("");
	}
	
	public Food2 (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}
 