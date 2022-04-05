package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num : nums)
        {
            set.add(num);
        }
        
        for(int i = 1; i <= nums.length; i++)
        {
            if(!set.contains(i))
            {
                result.add(i);
            }
        }
        
        return result;
        
    }

}
