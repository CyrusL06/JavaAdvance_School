package assignment1;
import java.util.Scanner;



public class LeapYear_0 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner UsrInput = new Scanner(System.in);
		int y;
		final int LEAP_VALIDATOR = 4;
		
		System.out.println("Enter a year to determine if Leap year..\n");
		y = UsrInput.nextInt();
		
		if (y/LEAP_VALIDATOR == 0)
		{
			System.out.println("Not a leap year!");

		} else {System.out.println("A leap year!");}
		
		
		

	}

}
