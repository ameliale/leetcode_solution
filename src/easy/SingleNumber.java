package easy;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 2};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums)
	{
		//Initialize a HashMap 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //Initialize the return value
        int result = 0;
        
        //iterate through the array to append the value and its count 
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        } 
        //iterate once more through the array to get the value with a count = 1
        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(nums[i]) == 1)
            {
                result = nums[i];
                return result;
            }
        }
               
        return result;
        
	}

}
