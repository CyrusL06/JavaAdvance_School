package CTryBuiltInMethodsStringArrayList_3;

import java.util.ArrayList;

public class TryArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<String>();
		//1
		name.add("Cyrus");
		name.add("Mark");
		name.add("Calyx");
		
		System.out.println(name);
		
		//2Index
		name.get(2);
		System.out.println(name.get(2));
		
		
		//3 Change
		name.set(0, "new");
		System.out.println(name);
		
		//4.Remove
		name.remove(1);
		System.out.println(name);
		
		//5. Resize Array
		name.size();
		System.out.println(name.size());
		
		//6. Loop Through ArrayList
		for (String i : name)
		{
			System.out.println(i + "..");

		}
		
		
		
	}

}
