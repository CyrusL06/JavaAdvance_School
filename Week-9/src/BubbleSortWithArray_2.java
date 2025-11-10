
public class BubbleSortWithArray_2 {

	
	

	
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
	
	public static void DivideAnConquerMerge(int[] nums, int left, int mid, int right)
	{
		int n1=mid-left + 1;
		int n2=right-mid;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i] = nums[left+i];
		}
		for(int i=0;i<n2;i++)
		{
			R[i]=nums[mid+i+1];
		}
		int indL=0;
		int indR=0;
		int indO=left;	//original array index starts from left!!!
		while(indL<n1 && indR<n2)
		{
			if(L[indL]>=R[indR])
			{
				nums[indO] = L[indL];
				indL++;				 
			}
			else
			{
				nums[indO] = R[indR];
				indR++;				 
			}
			indO++;				
		}
		while(indL<n1)	//left array has leftover elements
		{
			nums[indO] = L[indL];
			indO++;
			indL++;
		}
		while(indR<n2)
		{
			nums[indO] = R[indR];
			indO++;
			indR++;
		}			
		
	}
	
	public static void MergeSort(int[] nums, int left, int right)
	{
		if(left>=right)	// we have  1 element left, where 1 element is already sorted!!!
		{
			return;
		}
		int mid=left + (right-left)/2;
		MergeSort(nums,left,mid);
		MergeSort(nums,mid+1,right);
		DivideAnConquerMerge(nums,left,mid,right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = new int[10];
		IniArr(nums);
		System.out.print("Before Sort\n");
		DispArray(nums);
		BubbleSort(nums);
		System.out.print("After Sort\n");
		DispArray(nums);
	

		MergeSort(nums,0,nums.length-1);
		DispArray(nums);
		
		
		
		
	}

}
