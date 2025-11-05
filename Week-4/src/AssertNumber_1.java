import java.util.Scanner;
public class AssertNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Basic Code take Input and store
		System.out.println("Pls Input an Integer number");
		Scanner usrInput = new Scanner(System.in);
		int num;
		num = usrInput.nextInt();
		
		if(num % 2 == 0) { System.out.println("its an even number"); } 
		else {System.out.println("its an odd number");}
		
		
	}

}
