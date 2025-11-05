import java.util.Scanner;
public class BankBalanceByRateAndYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner usrInput = new Scanner(System.in);
		double initial_balance;
		double balance;
		double year;
		double interest_Rate;
		
		final double MIN_RATE = 0.01;
		final double MAX_RATE = 0.16;
		final double MAX_YEAR = 5;
		
		
		
		
		System.out.println("Pls input the initial balance you want to invest");
		initial_balance = usrInput.nextDouble();
		double interest;
		
		for (interest_Rate = MIN_RATE; interest_Rate <= MAX_RATE;)
		{
			balance = initial_balance;
			//Accumulate our year investment
			//We validate 6 years with year=0 thus change it to year = 1
			for (year = 1; year<= MAX_YEAR; year++)
			{
				//Accumulate Interest here
				interest = balance * interest_Rate;
				balance += interest;

			}
			System.out.printf("with %.2f interest, the total balance is $%.2f \n", 
								interest_Rate, 
								balance);
			interest_Rate = interest_Rate + 0.02;

			
			
		}
		
	}

}
