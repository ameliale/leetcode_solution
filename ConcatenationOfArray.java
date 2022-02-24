package easy;

import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,1};
		System.out.println(Arrays.toString(concatenation(nums)));
		int[] nums2 = new int[] {0};
		System.out.println(Arrays.toString(concatenation(nums2)));
	}
	
	public static int[] concatenation(int[] nums)
	{
		int[] ans = new int[2 * nums.length];
		
		for(int i = 0; i < ans.length; i++)
		{
			if(i < nums.length)
			{
				ans[i] = nums[i];
			}
			else
			{
				ans[i] = nums[i - nums.length];
			}
		}
		
		return ans;
	}

}
