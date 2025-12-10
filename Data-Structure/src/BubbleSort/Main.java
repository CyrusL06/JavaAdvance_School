package BubbleSort;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [] nums = new int[10];
		int [] fixednums = { 5, 4, 5, 5, 3, 7,20 };
		
		
		BubbleSortTry.IniArr(nums);
		System.out.print("Before Sort\n");
		BubbleSortTry.DispArray(nums);
		BubbleSortTry.BubbleSort(nums);
		
		BubbleSortTry.BubbleSort(fixednums);
		BubbleSortTry.DispArray(fixednums);
		
		System.out.print("After Sort\n");
		BubbleSortTry.DispArray(nums);
	

//		MergeSort(nums,0,nums.length-1);
//		DispArray(nums);
	}

}
