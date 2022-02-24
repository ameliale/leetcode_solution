package easy;

import java.util.Arrays;

public class mergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3, 0, 0, 0};
		int[] nums2 = {3,4,5};
		merge(nums1, 3, nums2, 3);
		
		System.out.println(Arrays.toString(nums1));

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int overallLength = (m + n) - 1;
		int length1 = m - 1;
		int length2 = n - 1;
		
		for(int i = overallLength; i >=0; i--)
		{
			if(length2 < 0)
			{
				break;
			}
			if(length1 >= 0 && nums1[length1] > nums2[length2])
			{
				nums1[i] = nums1[length1--];
			}
			else
			{
				nums1[i] = nums2[length2--];
			}
		}
	}

}
