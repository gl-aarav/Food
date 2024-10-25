public class FoodTester2
{
	public static void main (String[] args)
	{
		Food2 food1 = new Food2 ("baked", "banana", "muffins");
		food1.printForSale();
		Food2 food2 = new Food2 ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza2 pizza = new Pizza2 ("pepperoni");
		pizza.printForSale();
		DeepDishPizza2 deepdishpizza = new DeepDishPizza2("pepperoni");
		deepdishpizza.printForSale();

	}
}
