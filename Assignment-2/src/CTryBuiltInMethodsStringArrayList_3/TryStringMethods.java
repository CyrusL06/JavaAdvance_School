package CTryBuiltInMethodsStringArrayList_3;

import java.util.*;

public class TryStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String input = "Im Adam,Do you need help? ";
		
		
		//1. split()
		// Splitting String into Array
		String regex = ",";
		String [] myArray = input.split(regex);
		
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i]);

		}
		System.out.print("________\n\n");

		
		//2.  toCharArray()
		// String -> Char
		String charName = "Hello World";
		char [] myChar = charName.toCharArray();
		for (int i = 0; i < myChar.length; i++)
		{
			System.out.println(myChar[i]);

		}
		System.out.print("________\n\n");

		//3.IndexOf()
		//Find characters and substring in a string
		String target = "World";
		System.out.println(charName.indexOf(target));
		System.out.print("________\n\n");
		
		
		//4.concat()
		// Concat two strings together
		String fname = "Cyrus";
		String lname = "Lorenzo";
		String fullName = fname.concat(lname);
		System.out.println(fullName);
		System.out.print("________\n\n");

		
		//5. replace()
		//Replace characters and substrings in a string
		
		String removeHere = "remove all white spaces";
		String newRemoveHere = removeHere.replace(" ", "");
		System.out.println(newRemoveHere);
		System.out.print("________\n\n");
		
		//6. substring()
		//To extract a portion of a string from Original
		
		String subDemo = "Hello World";
		System.out.println(subDemo.substring(0,5));
		System.out.print("________\n\n");
		
		
		//7. Split()
		//to break a given string 
			//		String[] split​(String regex, int limit)
		String phoneNum = "342-234-1343";
		String [] num = phoneNum.split("-",3);
			for(String a: num)
			{
				System.out.println(a);

			}
		System.out.print("\n________\n\n");

		
		//8. compareTo()
		//	compares given string with the current string returns
		// number based on lexicographical
		String comp1 = "hello";
		String comp2 = "Hello";
		String comp3 = "HellO";

		System.out.println(comp1.compareTo(comp2));
		System.out.println(comp1.compareTo(comp3));

		System.out.print("\n________\n\n");

		
		//9. Strip()
		// remove the head and tail spacing for the given string
		
		String stripDemo = "   HellO Why  ";
		System.out.println(stripDemo.strip());
		System.out.print("\n________\n\n");

		
		//10. valueOf()
		//to reutnr string of passed argument
		System.out.println(String.valueOf(myChar));

		System.out.print("\n________\n\n");

		
		
		//11. equalsIgnoreCase()
		String inp1 = "hello";
		String inp2= "HELLO";
		if(inp1.equalsIgnoreCase(inp2))
			System.out.println("True");
		else 
			System.out.println("False");
		System.out.print("\n________\n\n");

		
		
		//12. Length()
		int lenOfString = inp2.length();
		System.out.println(lenOfString);
		System.out.print("\n________\n\n");
		
		//13. 

	}

}
