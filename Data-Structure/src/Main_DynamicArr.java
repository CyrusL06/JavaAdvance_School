
public class Main_DynamicArr {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		ArrayList<String> arrayList = new ArrayList<trings>();
		
		DynamicArray dynamicArray = new DynamicArray();
		System.out.println(dynamicArray.capacity);
		
//		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
		dynamicArray.insert(0,"X");

		
		System.out.println("size: " + dynamicArray.size);
		System.out.println("Capacity: " + dynamicArray.capacity);
		
		System.out.println(dynamicArray);

		
		System.out.println( "empty: "  + dynamicArray.isEmpty() );

		

	}

}
