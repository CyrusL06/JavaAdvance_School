package CPalendromeAlgo_2;

public class Palindrome 
{
	
//public static String input = "Madam, I'm Adam";
	//Dot saw I was Tod
	//Madam, I'm Adam

	
	public static void Calculate(String input)
	{
					
		//KEY CODE
		input = input.replaceAll("[ ,\"']+", "");
		int index = input.length()-1;
		String output = "";
		//--------
		
		//loops through the index and if index 0 stop 
		for(; index >=0; index--)
		{
			//output the charAt that index
			output += input.charAt(index);
		}
		
		System.out.println(input);
//		System.out.println(output + "\n\n");
		System.out.println(output);
		

		if(input.equalsIgnoreCase(output))
			System.out.println("True");
		else 
			System.out.println("False");

	}
	
	
	
	
}
