
import java.util.LinkedList;

public class LinkedListDemo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> names = new LinkedList<String>();
		names.add("Cyrus");
		display(names);
		names.add("Mike");
		display(names);
		names.add("Yeji");
		display(names);
		
		names.add(2, "Zendeya");
		display(names);
		
		names.set(0, "Cy");
		display(names);

		names.remove(1);
		display(names);

		
	}

	private static void display(LinkedList<String> names) 
	{
		// TODO Auto-generated method stub
		System.out.println("\n The size of the list is " + names.size());
		System.out.println(names);
	}

}
