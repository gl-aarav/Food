/*
 * Aarav Goyal
 * 10/23/2024
 * Food3.java
 */

public class Food3
{
    // Protected string to hold the description of the food item
    protected String str;

    // Constructor that initializes str with a formatted description of the food item
    // Parameters:
    // - prepMethod: the method of preparation (e.g., grilled, fried)
    // - ingredient: the main ingredient used in the food item
    // - name: the name of the food item
    public Food3 (String prepMethod, String ingredient, String name)
    {    
        // Construct a simple descriptive string for the food item
        str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
    }

    // Constructor that provides detailed pricing information for the food item
    // Parameters:
    // - prepMethod: the method of preparation
    // - name: the name of the food item
    // - pricePerItem: the price of each item (in dollars)
    // - numberOfItem: the quantity of items available for sale
    // - ingredient: the main ingredient used in the food item
    public Food3 (String prepMethod, String name, double pricePerItem, int numberOfItem, String ingredient)
    {
        // Determine the pricing format based on the price per item
        if (pricePerItem < 1.00)
            str = String.format(("\nAt the sale: %s %s, with %s will be sold for %d cents each. Selling %d %s will get you $%.2f"),
                                name, prepMethod, ingredient, (int)(pricePerItem * 100), numberOfItem, name, pricePerItem * (double)numberOfItem);
        
        else if (pricePerItem > 1.00) 
            str = String.format(("\nAt the sale: %s %s, with %s will be sold for %.2f dollars each. Selling %d %s will get you $%.2f"),
                                name, prepMethod, ingredient, pricePerItem, numberOfItem, name, pricePerItem * (double)numberOfItem);
        
        else // pricePerItem is exactly 1.00
            str = String.format(("\nAt the sale: %s %s, with %s will be sold for 1 dollar each. Selling %d %s will get you $%.2f"),
                                name, prepMethod, ingredient, numberOfItem, name, pricePerItem * (double)numberOfItem);
    }

    // Method to print the description of the food item to the console
    public void printForSale()
    {
        System.out.println(str); // Output the food description
    }
}
