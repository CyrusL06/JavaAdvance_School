import java.util.Scanner;

public class DemoRecurssion_1 {

	public static void messageMethod(int reps)
	{
		if (reps > 0)
		{
			System.out.println("Message: " + reps);
			//THis one is recurssion..
			messageMethod(reps -1);
		}
	}
	
	
	public static int AddAllNumToZero(int nums)
	{
		
		//The 
		if (nums!= 0)
		{
			//5
			System.out.println(nums);
			//5 + 4 recurision part
			return (nums + AddAllNumToZero(nums-1));
		}
		else
			System.out.println("--------");
			return nums;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner UsrInput = new Scanner(System.in);
		int input;
		
		messageMethod(4);
			
		
		System.out.println("Input a number to get sum all of its previous nums");
		input = UsrInput.nextInt();
		
		int sum = AddAllNumToZero(input);

		System.out.println("Number is: " + sum);

		
	}

}
