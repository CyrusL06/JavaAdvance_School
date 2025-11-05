
public class ShortCircuit_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// &&  and
		// ||   or  once true we dont need to conitinue
		//	How to determine if its PRIME => number by one or by it self
		
		
		int num = 7;
		int thresh = 100;
		
		if(isPrime(num) && isBigger(num, thresh)) /*Compound Logistic  thus wrong*/
			//Short circuit +=> When A is False it ignores second part of End Logic.
		{
			System.out.println( num + " is prime" + "thresh is bigger" + num);
		} else {System.out.println( num + " is not prime" + " thresh is not bigger " + num);}
	}
	
	public static boolean isPrime(int num)
	{
		//it has only 1 and itself as factor
		//1. Define result
		boolean result = true;
		
		for (int i = 2; i < num; i++) 
		{
			if (num % i == 0) {  result = false;}
		}
	
	return result;
	
	}
	
	public static boolean isBigger(int num ,int thresh)
	{
		if(num>thresh) {return true; /*Bigger than thresh*/}
		else { return false;}
	}
	

}
