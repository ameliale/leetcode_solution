package easy;

import java.util.HashMap;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4};
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums)
	{
		boolean duplicated = false;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++)
		{
			if(map.containsKey(nums[i]))
			{
				duplicated = true;
				return duplicated;
			}
			else
			{
				map.put(nums[i], i);
				duplicated = false;
			}
		}
		
		return duplicated;
		
	}

}
