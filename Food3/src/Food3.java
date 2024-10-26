/*
 * Aarav Goyal
 * 10/23/2024
 * Food3.java

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
	public Food3 (String prepMethod, String name, double pricePerItem, int numberOfItem, String ingredient)
	{

		if (pricePerItem<1.00)
			str = String.format(("\nAt the sale: %s %s, with %s will be sold for %d cents each. Selling %d %s, will get you $%.2f"), name, prepMethod, ingredient, (int)(pricePerItem*100), numberOfItem, name, pricePerItem*(double)numberOfItem);
	
		else if (pricePerItem>1.00) 
			str = String.format(("\nAt the sale: %s %s, with %s will be sold for %.2f dollars each. Selling %d %s, will get you $%.2f"), name, prepMethod, ingredient, pricePerItem, numberOfItem, name, pricePerItem*(double)numberOfItem);
		else 
			str = String.format(("\nAt the sale: %s %s, with %s will be sold for 1 dollar each. Selling %d %s, will get you $%.2f"), name, prepMethod, ingredient, numberOfItem, name, pricePerItem*(double)numberOfItem);
	}

	public void printForSale()
	{
		System.out.println(str);
	}
}
