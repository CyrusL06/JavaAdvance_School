package DSA;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {2,7,11,15};
		int target = 9;
		
		//Have two pointer one uses the pointer to keep it
		//second pointer add the i+1 next to it to validate
		
		System.out.println(nums.length);
		
		for(int i = 0; i < nums.length; i++)
		{
			//Keep the first one 2 
						//1	//3
			for(int k = 0; k < nums.length-1; i++)
			{
				//7
				int keep = nums[i]+nums[k];
				System.out.println(keep);
				if (keep == target)
					System.out.println(i + ","+ k);
			
			}
		}
		
	}

}
