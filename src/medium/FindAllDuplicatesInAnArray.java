package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(findDuplicates2(nums));
	}
	
	//HashMap but exceed limit for large array
	public static List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int num : nums)
		{
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for(int num : nums)
		{
			if(map.get(num) == 2 && !result.contains(num))
			{
				result.add(num);
			}
		}
		
		return result;
		
	}
	
	//HashSet solution 
	
	public static List<Integer> findDuplicates2(int[] nums)
	{
		List<Integer> result = new ArrayList<Integer>();
		HashSet<Integer> encountered = new HashSet<Integer>();
		
		for(int num : nums)
		{
			if(encountered.contains(num))
			{
				result.add(num);
			}
			else
			{
				encountered.add(num);
			}
		}
		
		return result;
	}

}
