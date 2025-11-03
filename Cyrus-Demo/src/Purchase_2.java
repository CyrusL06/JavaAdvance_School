
public class Purchase_2 implements Comparable <Purchase_2>
{
	//Two fields that hold category
	private String category;
	private double price;
	
	
		//Constructor that accept two param 	
	public Purchase_2(String cat, double pr)
	{
		category = cat;
		price = pr;
	}
	
	
	//Returns the Val
	public String getCategory()
	{
		return category;
	}
	
	public double getPrice()
	{
		return price;
	}
	

	@Override
	public int compareTo(Purchase_2 p)
	{
		int result;
		result = category.compareTo(p.getCategory());
		return result;
	}
	
	// Inside your Purchase_2 class
	@Override
	public String toString() {
	    return "Category: " + category + ", Price: $" + price;
	}
	
	
}
