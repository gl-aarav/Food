public class FoodTester3
{
	public static void main (String[] args)
	{
		Food3 food1 = new Food3 ("baked", "muffins", 0.50, 12, "banana");
		food1.printForSale();
		
		Food3 food2 = new Food3 ("fried", "fritters", 1.00, 12, "yam");
		food2.printForSale();
		
		Pizza3 pizza1 = new Pizza3 ("baked", "pizza", 2.50, 8, "anchovies");
		pizza1.printForSale();
		
		DeepDishPizza3 deepdishpizza1 = new DeepDishPizza3("baked", "deepdishpizza", 2.50, 8, "anchovies");
		deepdishpizza1.printForSale();
	}
}
