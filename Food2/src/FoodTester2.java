/*
 * Aarav Goyal
 * 10/25/2024
 * FoodTester2.java
 */

public class FoodTester2
{
    // Main method to test the functionality of the Food2, Pizza2, and DeepDishPizza2 classes
    public static void main (String[] args)
    {
        // Create a Food2 object for baked banana muffins and print its description
        Food2 food1 = new Food2 ("baked", "banana", "muffins");
        food1.printForSale();

        // Create a Food2 object for fried yam fritters and print its description
        Food2 food2 = new Food2 ("fried", "yam", "fritters");
        food2.printForSale();

        // Create a Pizza2 object for a pepperoni pizza and print its description
        Pizza2 pizza = new Pizza2 ("pepperoni");
        pizza.printForSale();

        // Create a DeepDishPizza2 object for a pepperoni deep dish pizza and print its description
        DeepDishPizza2 deepdishpizza = new DeepDishPizza2("pepperoni");
        deepdishpizza.printForSale();
    }
}
