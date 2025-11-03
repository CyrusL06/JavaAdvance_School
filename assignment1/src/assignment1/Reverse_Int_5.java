 package assignment1;

import java.util.Scanner;

public class Reverse_Int_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner UsrInp = new Scanner (System.in);
		
		System.out.println();
		System.out.println("Input a num to be reverse");
		int num = UsrInp.nextInt();
		int len = (int)(Math.log10(num)+1);

		int digit = num % 10;
		
		System.out.println(len);
//
//		for (; len >= 0; len--)
//		{
//			//Try if string works if not
//			//We use array
//			
//			result =  digit + ",";
//		}
		
		String result = intReverse(len,digit,num);
		System.out.println(result);

		
	}
	
	
	public static String intReverse( int len, int digit, int num)
	{
		String output = "";
		
		for (; len > 0; len--)
		{
			System.out.println(len);

			//Try if string works if not
			//We use array
			
			output +=  digit + " ";
			

			num = num/10;
			digit = num % 10;
		
		}
		System.out.println(len);

		return output;
	}

}
