
public class TwoObjectComparison_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  PT.1
//  Thesis:
//	Conclusion: 
		
//		We are not able to compare double var in most cases
//		Thus dont use it
	
		int num1 = 10;
		if(num1 == 10)
		{
			System.out.println("num1 is 10!");
		} else 
		{
			System.out.println("num1 is not 10");
		}
		
//		Its important to know you want compare two
		double num2 = 2.2-2;
		double ref = 0.2;
		double beta = 0.000001;
		
		
//Conclusion is to use this:
		if(Math.abs(num2-ref)<beta) 
		{
			System.out.println("Beta the diff is " + ref + "under the threshold of" + beta);

		}
		
//		Not this:
		if(num2 == ref) {
			System.out.println("the diff is" + ref);

		}else 
		{
			System.out.println("the diff is not" + ref);
			System.out.println(num2);


		}
		
// PT.2
// Thesis: Two 
// Conclusion: 
		
		String str1 = "HelloWorld";
		String str2 = "Hello";
		String str3 = "World";
		String target = str2 + str3;

		// We are comparing
		if (str1 == target) 
		{
			System.out.println("\n\n" + str1 + " and " + target + " are the same");


		} else {
			System.out.println("\n\n" + str1 + " and " + target + " are different");
			System.out.println("By Adding two strinf in Java is counted as different");


		}
//		
		
		// We are comparing value in this case
		if(str1.equals(target)) 
		{
			System.out.println("\n\n Difference Value of " + str1 + " and " + target + " are the same");


		} else {
			System.out.println("\n\n" + str1 + " and " + target + " are different");
			System.out.println("By Adding two strinf in Java is counted as different");


		}
		
// PT.3 
// Thesis: When you compare two object they have different value inside a class
// Conclusion: We need to compare their numbers. thus myNum.num = Solves this problem
		
		
//		Mynum = num1 = new MyClass_2
		
		
		
	}

}
