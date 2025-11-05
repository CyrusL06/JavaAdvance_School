
public class LoopDemo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ForLoop();
		WhileLoop();


	}

	public static void ForLoop() 
	{
		int result = 0;
		final int NUM = 100;
		
		for(int i = 0; i <= NUM; i++)
		{
			result = result + i;
		}
		 System.out.println("For Loop Sum from 1 to 100"  + " is " + result);
	}
	
	public static void WhileLoop()
	{
		int num = 0;
		int result = 0;
		final int NUM = 100;
		
		while(num <= NUM)
		{
			result = num + result;
		}
		 System.out.println("WHile Loop Sum from 1 to 100"  + " is " + result);
		
		
 	}
	
	public static void DoLoop() 
	{
		int num = 0;
		int result = 0;
		final int NUM = 100;
		
			do 
			{
				result = result + num;
				num++;
			} while (num<NUM); //loops break it 
	}
}
