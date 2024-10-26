/*
 * Aarav Goyal
 * 10/25/2024
 * FoodTester3.java
 */

public class FoodTester3
{
    // Main method to test the functionality of the Food3, Pizza3, and DeepDishPizza3 classes
    public static void main (String[] args)
    {
        // Create a Food3 object for baked muffins with a price of $0.50 each, available in quantity of 12, made with banana
        Food3 food1 = new Food3 ("baked", "muffins", 0.50, 12, "banana");
        food1.printForSale();
        
        // Create a Food3 object for fried fritters with a price of $1.00 each, available in quantity of 12, made with yam
        Food3 food2 = new Food3 ("fried", "fritters", 1.00, 12, "yam");
        food2.printForSale();
        
        // Create a Pizza3 object for baked pizzas with a price of $2.50 each, available in quantity of 8, topped with anchovies
        Pizza3 pizza1 = new Pizza3 ("baked", "pizzas", 2.50, 8, "anchovies");
        pizza1.printForSale();
        
        // Create a DeepDishPizza3 object for baked deep dish pizzas with a price of $2.50 each, available in quantity of 8, topped with anchovies
        DeepDishPizza3 deepdishpizza1 = new DeepDishPizza3("baked", "deep dish pizzas", 2.50, 8, "anchovies");
        deepdishpizza1.printForSale();
    }
}
