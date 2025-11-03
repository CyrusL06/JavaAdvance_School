
import java.util.*;

public class UserPurchaseDataCompar_2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Purchase_2> purchases = new ArrayList<Purchase_2>();
		Scanner UsrInp = new Scanner(System.in);
		String category;
		double price;
		final String QUIT = "ZZZ";
		
		
		//Accepts the input of User
		System.out.print("Enter category for purchase or " + 
						QUIT +" to quit >> ");
		
		category = UsrInp.nextLine();
		while(!category.equals(QUIT))
			{
				System.out.print("Enter new amount spent >>");
				price = UsrInp.nextDouble();
				UsrInp.nextLine();
				purchases.add(new Purchase_2(category, price));
				
				System.out.print("Enter category for purchase or " + 
						QUIT +" to quit >> ");
				category = UsrInp.nextLine();
			}
		
		//DIsplays TH inpiut
		System.out.println();
		System.out.println("Before Sort:");
		display(purchases);
		Collections.sort(purchases);
		System.out.println("After Sort:");
		display(purchases);
		
		

	}

	private static void display(ArrayList<Purchase_2> p) {
		// TODO Auto-generated method stub
		for(int i = 0; i < p.size(); i++)
		{
			System.out.println("  " + p.get(i).getCategory() 
								+ " " + p.get(i).getPrice());

		}
		
		System.out.println();

		
		
	}

}
