//Imported
import java.util.Scanner;

public class MethodDemo_1 {

	
	public static int MyAdd(int num1, int num2)
	{
		
		int sum = num1 + num2;
		return sum;
	}
	
	
//	PT.2
//Allows to use the method because it recognize it holds one parameter
	public static int MyAdd(int num1) {
		
		num1 = num1 = 10;
		return num1;
	}
	
//	PT.3
// Integer => not parameter type number = base type -> Writer
//Rich information surround it. 
public static int MyAdd(Integer num1) {
		
		num1 = num1 = 10;
		System.out.println("Integer VErsion invoked");
		return num1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
//		You need to open the package and use its method
		Scanner usrInput = new Scanner(System.in);
		int num;
		int num1;
		int sum;
		int sumofsum;
		
		int num1_2 = 15;
		
//		PT.3
		Integer myInt = num1_2;
		System.out.println("myInt=" + myInt);
		
		
		
	
		
		System.out.println("Pls input a number >> ");
		num = usrInput.nextInt();
		
		System.out.println("Pls input a number >> ");
		num1 = usrInput.nextInt();
		
		System.out.println("num = " + num);
		System.out.println("num1 = " + num1);
		
//		Method
		sum = MyAdd(num,num1);
//		num1_2 = MyAdd();
		
		
//		////////// Week 2- Lab
//		LOOK INTO THIS.... EXPLAIN WHAT HAPPENED
//		*Try the method of execution sequence
//		////////////
//					1		2				3
		sumofsum = MyAdd(MyAdd(1,1),MyAdd(num,num1));

//		This will not work due too concatonation 
//		System.out.println( "num1 + num =" + num + num1);
		
//		THUS
	
		System.out.println( "num1 + num = " + sum );
		System.out.printf( "(%d, %d)",num , num1);

	
		
		
		
	}

}
