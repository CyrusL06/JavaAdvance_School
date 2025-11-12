import java.util.Scanner;

public class ComputeFactorials_2 {

	
	public static int FactorialNums(int num)
	{
		//1 because you need to stop before 0
		if (num > 1)
		{
			return(num * FactorialNums(num-1));
		}
		
		return num;
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner UsrInput = new Scanner(System.in);
		int input;
	
			
		
		System.out.println("Input a number to get sum all of its previous nums");
		input = UsrInput.nextInt();
		
		int num = FactorialNums(input);
		
		System.out.println("!" + input + "=" + num);
		

	}

}
