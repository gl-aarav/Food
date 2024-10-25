public class FoodTester3
{
	public static void main (String[] args)
	{
		Food3 food1 = new Food3 ("baked", "muffins", 3, 5, "banana");
		food1.printForSale();
		
		Food3 food2 = new Food3 ("fried", "fritters", 3, 5, "yam");
		food2.printForSale();
		
		Pizza3 pizza1 = new Pizza3 ("pepperoni");
		pizza1.printForSale();
		
		DeepDishPizza3 deepdishpizza1 = new DeepDishPizza3("pepperoni");
		deepdishpizza1.printForSale();
	}
}
