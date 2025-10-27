package assignment1;
import java.util.Scanner;

/*
1.User Input number.
2. Validate if its Harshad number.
	- Calculate the length of integer = numLen
	- numLen is used to run many loops to 
	  	divide 

or use modular operator and divide by 10..


*/

public class Harshad_Num_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UsrIn = new Scanner(System.in);
		
		System.out.println("Insert whole numbers to validate Harshard Num");
		int UserNum = UsrIn.nextInt();
		int num = UserNum;
		
		//Calculate the 
		int UserNumLen = (int)(Math.log10(UserNum)+1);
		System.out.println(UserNum + " Length " + UserNumLen);

		int SumOfAll = 0;

		while(UserNumLen >= 0)
		{
			//156
			int SoloIntHold = UserNum % 10;
			//6
			
			//156/10 = 15
			 UserNum =  UserNum/10;
			
			
			// 0 + 6
			SumOfAll += SoloIntHold;
	
			UserNumLen--;
			
			System.out.println("Total:" + SumOfAll);

		}
		
	int HarshardNum = ifDivisible(num, SumOfAll);
	
		if (HarshardNum == 0)
			System.out.println("Validation Sucess(Input num is Harshards Number)" + HarshardNum );
		else
			System.out.println("Validation Failed(Ipnut num is not Harshards Number)" + HarshardNum);



	}
	
	public static int ifDivisible(int num, int sumOfAll)
	{
		int output = num%sumOfAll;
		return output;
	}

}
