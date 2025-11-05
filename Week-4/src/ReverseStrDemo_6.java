
public class ReverseStrDemo_6 {

	//1.Access the last string char using Loop
	//2.Put them into a new string;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String input = "Hello World!";
		int index = input.length()-1;
		char aChar = input.charAt(input.length()-1);
		String Output = MyReverse(input);
		
		System.out.println(Output);
		
	}
	
	public static boolean isSymmetric(String str1, String str2) 
	{
		return false;
	}
	
	public static String MyReverse(String input) 
	{
		String output = " ";
		int index = input.length()-1;
	
		for(; index>=0;index--)
		{
			output = output + input.charAt(index);
		}
		
		return output;
	}

}
