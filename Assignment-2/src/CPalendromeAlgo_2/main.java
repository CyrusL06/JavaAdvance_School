package CPalendromeAlgo_2;

import java.util.Scanner;

public class main {

	
	
	public static void Start() 
	{
		String palendromeStr = "Dot saw I was Tod";
		
		Scanner usrInp = new Scanner(System.in);
		System.out.println("Insert a phrase to validate as Palendrome:/n");
		String input = usrInp.nextLine();
		
		System.out.println(input);
		Palindrome.Calculate(input);

		
		
	}
	
	public static void Test()
	{
		
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Start();
	


	}

}
