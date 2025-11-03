import java.util.Iterator;
import java.util.LinkedList;


public class Iterators_3_5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Integer> sales = new LinkedList<Integer>();
		sales.add(75);
		sales.add(81);
		sales.add(43);
		sales.add(45);
		
//		for (int amt: sales)
////			amt ehances the loop to hold each COllection elemnet
//			System.out.print(amt + " ");
//		System.out.println();

		Iterator<Integer> iter = sales.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		System.out.println();

		
	}


}
