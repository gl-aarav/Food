/*
 * Aarav Goyal
 * 10/23/2024
 * Food.java
  
*/


public class Food3
{
	protected String str;
	
	public Food3 ()
	{
		str = new String("");
	}
	
	public Food3 (String prepMethod, String ingredient, String name)
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}
	public Food3 (String prepMethod, String name, int priceForOne, int numberOfItem, String ingredient)
	{
		str = String.format(("\nAt the sale: %s %s with %s will be sold for %d cents each." + 
		" Selling %d %s, will get you $%d\n"), name, prepMethod, ingredient, priceForOne, numberOfItem, name, priceForOne*numberOfItem);
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}
