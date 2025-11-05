
public class ConvertDecimalToBinary_7 {

	//Approach:
	//1. Logic of Binary to Decimal * thus do the reverse 
	//2.
	
	//Understand this!!	
	public static String MyInt2Bin(int num)
	{
		String result = "";
		int residual;
		while (num > 1 )//While (!(num<=2))
		{
			residual = num % 2;
			num = num /2;
			result = result + residual;
			
			//num = num >>1;
		}
		result = result + num;
		return result;
	}
	
	public static String Align2Byte (String input)
	{
		final int BIT_PER_BYTE = 8;
		String output = "";
		if(input.length()==BIT_PER_BYTE)
		{
			return "8"+input;
		} 
		else { 
			
			int num = BIT_PER_BYTE - input.length();
				for (int i=0; i<num; i++)
				{
					output = output + "0";
				}
				output = output + input;
			}
		
		return output;
	}
	
	
	public static String Align2Bytes(String input)
	{
		final int BIT_PER_BYTE = 8;
		String output = "";
		
		if(input.length()%8==0)
		{
			return output + input;
		}
		

		int num = BIT_PER_BYTE - input.length()%8;

		for (int i=0; i<num; i++)
		{
			output = output + "0";
		}
		output = output + input;
		
		
		
		
		return output;


	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 89;
		
		
		//Access reverse from your class
		String output = ReverseStrDemo_6.MyReverse(MyInt2Bin(num));
		System.out.println(output);
		output = Align2Byte(output);
		System.out.println(output);

	}

}
