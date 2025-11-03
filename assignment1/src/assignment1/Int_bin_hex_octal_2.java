package assignment1;
import java.util.Scanner;


public class Int_bin_hex_octal_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UsrInput = new Scanner(System.in);
		int x;
		
		System.out.println("Input Integer to convert into binary, Hex, and OCtal Format");
		x = UsrInput.nextInt();
		
		String binary = binaryCal(x);
		String final_binary = reverseOrder(binary);
		System.out.println("This is the binary: " +final_binary);
		
		String hex = hexCal(x);
		String final_hex = reverseOrder(hex);
		System.out.println("This is the hex: " + final_hex);

		String octal = octalCal(x);
		String final_octal = reverseOrder(octal);
		System.out.println("This is the Octal: " + octal);

		
		
		
	}
	
	
	public static String binaryCal(int x) 
	{
		
		String initial ="";
		
		for (int i = 1; i <= 8; i++)
		{
				
		
			if ( x % 2 == 0) 
		{
				 x = x/2;
				 initial += "0";
//				 System.out.println(x);
			}
			else 
			{
				
				x = (x-1)/2;
				initial += "1";
//				System.out.println(x);

			}
		}
		
		return initial;
		
	}
	
	public static String hexCal (int x)
	{
		
//		1. Divide the x with /16
//		2. Get if the quotient int
//		3. Evaluate the remainder
		String initial = "";
		
		for(int i = 1; i <= 4; i++)
		{
			//1. Cal remainder and save it
			int r = x % 16;
			//2. Have the quotient store in var
			x = x/16;
			System.out.println(x);

			
			System.out.println(r);
			
						
				if ( r >= 0 && r <= 9) 
				{
					if( r == 0)
					{
						initial += "1";
					} else 
						{
						String stringNum = Integer.toString(r);
						initial += stringNum;
						}
					
				}
					
					else if (r == 10)
					{
						initial += "A";
					}
					else if (r == 11)
					{
						initial += "B";
					}
					else if (r == 12)
					{
						initial += "C";
					}
					else if (r == 13)
					{
						initial += "D";
					}
					else if (r == 14)
					{
						initial += "E";
					}
					else if (r == 15)
					{
						initial += "F";
					}
				
			}
			
		
		
		return initial;
	}
	
	public static String octalCal(int x) 
	{
		
		String initial = " ";
		
		for (int i = 1; i <= 5; i++)
		{
			int r = x % 8;
			x = x/8;
			
			String stringNum = Integer.toString(r);
			initial += stringNum;
			
		}
				
		return initial;
		
		
	}
	
	public static String reverseOrder(String x)
	{
//		1.Access the last string index
		int index = x.length()-1;
//		2.Convert string to char.
		char aChar = x.charAt(x.length()-1);
// 		3.Grab and pit into new STRING
		String output = "";
		
		for(; index >= 0; index--)
		{
			output = output + x.charAt(index);
		}
		
		return output;
		
		
		
	}

}
