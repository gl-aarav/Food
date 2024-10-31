/*
 * Aarav Goyal
 * 10/25/2024
 * Pizza2.java
 */

//Subclass Pizza2 extends super class Food2
public class Pizza extends Food
{
	//Class constructor which initiated the super class constructor with supplied ingredient list
	public Pizza(String ingredient)
	{
		// calling super class's constructor in order to initialize with ingredients
		super("baked", ingredient, "pizza");
		
	}
}	
