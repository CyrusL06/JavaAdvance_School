//1,
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList <String> names = new ArrayList<String>();
		names.add("Cyrus");
		display(names);
		
		names.add("Yeji");
		display(names);
		
		
		names.add("Hector");
//		display(names);
		fancyDisplayList(names);
		
		//Adds at the 2nd Index of array 0 1 2
		names.add(2,"Calyx");
//		display(names);
		fancyDisplayList(names);

		
	}

	private static void display(ArrayList<String> names) 
	{
		// TODO Auto-generated method stub
		System.out.println("\n The size of the list is " + names.size());
		System.out.println(names);
	}
	
/*
 Fancier way to display,
 Identify size
 Loop through
 Access ArrayList index display all
 Display that index
 */
	
	public static void fancyDisplayList(ArrayList<String> names)
		{
			System.out.println("\nThe size of your list is "+ names.size() );
			for(int i = 0; i < names.size(); i++)
			{
				System.out.print("*[" + names.get(i) + "]" );
			}
			System.out.println("\n");

		}

}
