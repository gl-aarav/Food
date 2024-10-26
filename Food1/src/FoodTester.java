/*
 * Aarav Goyal
 * 10/25/2024
 * FoodTester.java
 */

public class FoodTester
{
    // Main method to test the functionality of the Food and Pizza classes
    public static void main (String[] args)
    {
        // Create a Food object for baked banana muffins and print its description
        Food food1 = new Food ("baked", "banana", "muffins");
        food1.printForSale();

        // Create a Food object for fried yam fritters and print its description
        Food food2 = new Food ("fried", "yam", "fritters");
        food2.printForSale();

        // Create a Pizza object for a pepperoni pizza and print its description
        Pizza pizza = new Pizza ("pepperoni");
        pizza.printForSale();
    }
}
