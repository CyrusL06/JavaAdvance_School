import java.util.Scanner;

public class EsceptionHandling_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

}
