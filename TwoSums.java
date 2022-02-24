package easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {

	public static void main(String[] args) {
		
		int values[] = {0, 1, 3, 4};
		int target = 7;
		
		System.out.println(Arrays.toString(twoSums(values, target)));
	}
	
	public static int[] twoSums(int[] nums, int target)
	{
		HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++)
		{
			int needToFind = target - nums[i];
			
			if(values.containsKey(needToFind))
			{
				int[] position = {values.get(needToFind), i};
				return position;
			}
			
			values.put(nums[i], i);
			
		}
		return null;
	}
}
