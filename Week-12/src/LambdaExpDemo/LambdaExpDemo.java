package LambdaExpDemo;
import java.util.ArrayList;
import java.util.Iterator;



//AN anonymous method used for used for iteration and interface
public class LambdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("hello");
		myList.add("hi");
		myList.add("hello");

						//ParseParama
		myList.forEach(anElement -> 
		{
			int len = anElement.length();
			
			System.out.println(anElement+ ", I am AAA" );
			System.out.println("the strinf length is"+len);

			//same as for each loop
		
		});
		
		Iterator<String> iter = myList.iterator();
		
		
		while(iter.hasNext())
		{
			System.out.println(iter.hasNext());
			System.out.println(iter.next());


		}

	}

}
