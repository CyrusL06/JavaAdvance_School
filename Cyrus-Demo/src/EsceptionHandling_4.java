import java.util.Scanner;

public class EsceptionHandling_4 {

	
		public static void Start() 
		{
			Scanner UsrInput = new Scanner(System.in);
			int numerator, denominator, result;
			System.out.println("Enter a numerator >>");
			numerator = UsrInput.nextInt();
			System.out.println("Enter a denominator >>");
			denominator = UsrInput.nextInt();
			
			try
			{
				result = numerator/denominator;
			}
			catch (ArithmeticException mistake)
			{
				System.out.println(mistake.getMessage());
			}
			System.out.println("End of Program");
		}
	
	public static void Start2Handling() 
	{

		int [] numList = {0,0,0,0};
		int x;
		Scanner UsrInput = new Scanner(System.in);
		
			for ( x = 0; x < numList.length; x++)
			{
				try 
				{
					System.out.println("Enter an Integer>>>");
					numList[x] = UsrInput.nextInt();

				} catch(Exception e)
				{
					System.out.println("Exception Occured");

				}
			}
			
			System.out.println("Numbers Are:");

			for(int i = 0; i < numList.length; i++)
			{
				System.out.println(numList[i] + ", ");

			}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Start();
		Start2Handling() ;
		
		
	}

}
