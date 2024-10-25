public class FoodTester3
{
	public static void main (String[] args)
	{
		Food3 food1 = new Food3 ("baked", "banana", "muffins");
		food1.printForSale();
		Food3 food2 = new Food3 ("baked", "muffins", 3, 5, "banana");
		food2.printForSale();
		
		Food3 food3 = new Food3 ("fried", "yam", "fritters");
		food3.printForSale();
		Food3 food4 = new Food3 ("fried", "fritters", 3, 5, "yam");
		food4.printForSale();
		
		Pizza3 pizza1 = new Pizza3 ("pepperoni");
		pizza1.printForSale();
		Pizza3 pizza2 = new Pizza3 ("pepperoni");
		pizza2.printForSale();
		
		DeepDishPizza3 deepdishpizza1 = new DeepDishPizza3("pepperoni");
		deepdishpizza1.printForSale();
		DeepDishPizza3 deepdishpizza2 = new DeepDishPizza3("pepperoni");
		deepdishpizza2.printForSale();
	}
}
