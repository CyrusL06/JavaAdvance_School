
public class TwoDArray_3 {

	
	public static void print2DArr(int [][] integers)
	{
		
		for(int row = 0; row < 3; row++)
		{
			System.out.print( "Row"+ (row+1) + "\n");

			for( int collumn = 0; collumn < 4; collumn++)
			{
				System.out.print(integers[row][collumn]+ "\t" );
			}
			
			
			System.out.println();

		} 
	}
	
	public static void CalculateTotalInCollumn(int [][] integers)
	{
		for(int row = 0; row < 3; row++)
		{
			int sum = 0;
			for( int collumn = 0; collumn < 4; collumn++)
			{
				sum += integers[row][collumn];
			}
			System.out.print("The sum of row " + (row + 1) + ": " + sum + "\n");

		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] integers = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				};
		
		
		print2DArr(integers);
		
		CalculateTotalInCollumn(integers);
		
	}

}
