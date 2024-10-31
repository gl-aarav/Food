/*
 * Aarav Goyal
 * 10/25/2024
 * Pizza3.java
 */

//Subclass Pizza3 extends super class Food3
public class Pizza3 extends Food3
{
	
	//Class constructor which initiated the super class constructor with supplied ingredient list
	public Pizza3(String ingredient)
	{
		// calling super class Food3 constructor in order to initialize with ingredients
		super ("baked", ingredient, "pizza");
		
	}
	
	//Class constructor which initiated the super class constructor with name, price per item, number of items and supplied ingredient list
	public Pizza3 (String prepMethod, String name, double pricePerItem, int numberOfItem, String ingredient)
	{
		
		super(prepMethod, name, pricePerItem, numberOfItem, ingredient);
	}
}	
