package easy;

import java.util.Arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums)
	{
		int currentSum = nums[0];
		int maxSum = nums[0];
		
		for(int i = 1; i < nums.length; i++)
		{
			int num = nums[i];
			
			currentSum = Math.max(num, currentSum + num);
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
	}

}
