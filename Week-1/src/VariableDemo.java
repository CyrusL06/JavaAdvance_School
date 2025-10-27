
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Lab1
		
//		// = "Assignment operator"
//		// we can do something about it
//		//Variable = memory space/ holding data type so why are we not using memory
//		// memory is not safe, some of the memory space in OS its heavily protected
//		int num1 = 100;
//		double num2 = 3.14;
//		
//		//WHy this is working:
//		//Ex: Because logic wise you can convert because the information itself is
//		// 	  preserved
//		num2 = num1;
//		
//		//WHy this is not:
//		//Ans: Because the value itself will be alter
//		// thus num1 hold the most power so you need to turn num2 into int
//		num1 = (int)num2;
//		
//		
//		//Concusting 
//		System.out.println("num2 = " + num2);
//		System.out.println(num1);

//----------------------------------------------
		
//		Lab 2
		
		int grade1 = 89;
		int grade2 = 80;
		int grade3 = 91;
		
		//No decimal after 3
		//				This is INT 			INT
		//THUS RESULT INT
		// THUS MAKING IT DECIMAL
		double avg = (grade1 + grade2 + grade3)/3.0;
		
//		This doesn't work as well why
//	  	ITS TOO LATE		STATEMENT =INT
//		(double)((grade1 + grade2 + grade3)/3.0))
		
		
		//WHy is it rounded??
		System.out.println(avg);
		
// ----------------------------------------------
		
		
	
//		Lab3
		
		double num1 = 2.20 - 2.00;
		boolean isEqual = (num1 == 0.20);
		
		System.out.println(num1);
		System.out.println(isEqual);

//		Why its not equal??
//		Reason: decimal number because there is a rounding error 
	}

}
