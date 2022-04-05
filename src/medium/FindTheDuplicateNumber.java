package medium;

import java.util.HashSet;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 4, 2, 2};
		System.out.println(findDuplicate(nums));
	}
	
	public static int findDuplicate(int[] nums)
	{
		HashSet<Integer> encountered = new HashSet<Integer>();
		
		for(int num : nums)
		{
			if(encountered.contains(num))
			{
				return num;
			}
			else
			{
				encountered.add(num);
			}
		}
		
		return 0;
	}

}
