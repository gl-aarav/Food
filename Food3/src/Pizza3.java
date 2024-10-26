public class Pizza3 extends Food3
{
	protected String str;
	public Pizza3(String ingredient)
	{
		super ("baked", ingredient, "pizza");
		
	}
	public Pizza3 (String ingredientln, String nameln)
	{
		super ("baked", ingredientln, nameln);
	}
	public Pizza3 (String prepMethod, String name, double pricePerItem, int numberOfItem, String ingredient)
	{
		super(prepMethod, name, pricePerItem, numberOfItem, ingredient);
	}
}	
