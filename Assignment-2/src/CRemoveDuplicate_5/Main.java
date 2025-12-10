package CRemoveDuplicate_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String arr[] = {"java","C","C++","Python", "java", "C++"};
		Integer arr2[] = {3, 3, 3, 3, 3};
		Integer ind[] = {1, 3, 5};

		Integer arr3[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

		boolean flag;
		
		ArrayList<Object> duplicate = new ArrayList<Object>();
		ArrayList<Object> indecies = new ArrayList<Object>();
		ArrayList<Object> Output = new ArrayList<Object>();

		String output = "[";
		int outputCounter = 0;
		
//	-==============-	
		
//		 Approach 1
//			for(int i = 0; i < arr3.length; i++)
		for(int i = 0; i < arr3.length; i++)
		{
			boolean isDuplicate = false;
			
			// Check if arr3[i] already exists in outputUnique
			for(int k = 0; k < Output.size(); k++)
			{
				if(arr3[i].equals(Output.get(k)))
				{
					isDuplicate = true;
					break;
				}
			}
			
			// If not a duplicate, add it to the output
			if(!isDuplicate)
			{
				Output.add(arr3[i]);
			}
		}
		
		System.out.println("Approach 1 - ArrayList");
		System.out.println("Output: " + Output);
		System.out.println("New Size: " + Output.size());
		System.out.println();
		
		

		//Approach 2 
		//Array Forced
//		
//		for(int i = 0; i< arr3.length; i++)
//		{
//			for (int j = i+1; j < arr3.length; j++ )
//			{	
//				if (arr3[i] == arr3[j]) //grabs the duplicate need to be stored in array
//				{
//					
//					outputCounter++;
//					output +=  arr3[i] + "," ; //get the duplicate
//					
//					
//				}
//				
//			}
//		}
//		
//		output += "]";
//		System.out.println( "Output " + output);
//		System.out.println("New Size: " + outputCounter + "\n");
		
		
		
		//Approach 2
		// Hsah 
		
		HashSet <Object>langs = new HashSet<Object>();
//		langs.add("Java"); //it only allow unique value
//		langs.add("Python");
//		langs.add("Java"); //hence this will not be shown

		
		for (int l :arr3) //take the value of array and store l
		{
			langs.add(l); //add arr value in hashlangs
		}
		System.out.println("Approach 2 - Hash");
		System.out.println("Output: " + langs);
		System.out.println("New Size: " + langs.size());
		
		
		
		
	}

}
