package StringPermutation;

public class Main {

	
	
	public static int permutationCOunter(int len) 
	{
		if (len!= 0)
		{
			//5
			System.out.println(len);
			//5 + 4 recurision part
			return (len + permutationCOunter(len-1));
		}
		else
			System.out.println("--------");
			return len;	
		
	}
	
	public static String permutationString(int len)
	{
		
		
		return ")";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String permTest = "mark";
		
		int len = permTest.length();
		int count = permutationCOunter(len);
		
		System.out.println("Number is: " + count);

		
		
	}

}
