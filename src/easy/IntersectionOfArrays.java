package easy;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1, 2, 2};
		int[] nums2 = {2, 2};
	
		
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
		
	}
	
	public static int[] intersect(int[] nums1, int[] nums2)
	{
		if (nums2.length > nums1.length) 
        {
            return intersect(nums2, nums1);
        }
    
        HashMap<Integer, Integer> m = new HashMap<>();
    
        for (int n : nums1) 
        {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
    
        int k = 0;
        
        for (int n : nums2) 
        {
        
            int cnt = m.getOrDefault(n, 0);
            if (cnt > 0) 
            {
                nums1[k++] = n;
                m.put(n, cnt - 1);
            }
        }
    
        return Arrays.copyOfRange(nums1, 0, k);
    }

}
