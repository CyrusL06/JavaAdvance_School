package BubbleSort;

public class BubbleSortTry 
{
	
	public static void IniArr(int [] nums)
	{
		final int MAX = 100;
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = ((int)(Math.random()*1000)%MAX);
		}
	}
	
	public static void DispArray (int [] nums)
	{
		
		for (int i = 0; i < nums.length-1; i++) // lengths-1 because we don't want the "," at the very end of the array
		{
			System.out.print(nums[i] + ", ");
		}
		System.out.print(nums[nums.length-1] + "\n");

	}
	
	
	public static void BubbleSort(int [] nums)
	{
		int tmp;
		for(int i = 0; i < nums.length-1; i++) //Rounds of scanning
		{
			for (int j = 0; j< nums.length-1; j++)
			{
				if(nums[j] > nums[j+1]) 
				{
					tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
				}
			}
		}
	}
	
}
