//Shows the useCase of nextLine

import java.util.Scanner;
public class HelloWorld_1 {
	public static void main(String[] args)
	{
		Scanner UsrInput = new Scanner (System.in);
		System.out.println("Pls input an INT");
		int num = UsrInput.nextInt();
		System.out.println("Pls input an STRING");
		UsrInput.nextLine();
//		Return the line that was skipped...
		String line = UsrInput.nextLine();
		
		System.out.println("USER INPUTED\n" + line);


	}


}
