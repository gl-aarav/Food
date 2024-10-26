/*
 * Aarav Goyal
 * 10/23/2024
 * Food.java 
*/

public class Food2
{
    // Protected string to hold the description of the food item
    protected String str;
    
    // Default constructor that initializes str to an empty string
    public Food2 ()
    {
        str = new String(""); // Initialize with an empty string
    }
    
    // Constructor that initializes str with a formatted description of the food item
    // Parameters:
    // - prepMethod: the method of preparation (e.g., grilled, fried)
    // - ingredient: the main ingredient used in the food item
    // - name: the name of the food item
    public Food2 (String prepMethod, String ingredient, String name)
    {   
        // Construct a descriptive string for the food item
        str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
    }

    // Method to print the description of the food item to the console
    public void printForSale()
    {
        System.out.println(str); // Output the food description
    }
}
