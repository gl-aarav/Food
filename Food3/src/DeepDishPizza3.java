/*
 * Aarav Goyal
 * 10/25/2024
 * DeepDishPizza2.java
 */

//Subclass DeepDishPizza2 extends super class Pizza
public class DeepDishPizza3 extends Pizza3
{
	//Class constructor which initiated the super class constructor with supplied ingredient list
	public DeepDishPizza3 (String prepMethod, String name, double pricePerItem, int numberOfItem, String ingredient)
	{
		// calling super class's constructor in order to initialize with ingredients, name, pricePerItem, numberOfItem, ingredient.
		super(prepMethod, name, pricePerItem, numberOfItem, ingredient);
	}
}
