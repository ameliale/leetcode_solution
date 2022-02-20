package medium;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2, 3, -4};
		System.out.println(maxProduct(nums));
	}
	
	public static int maxProduct(int[] nums) {
		
		int currentProduct = nums[0];
		int tempMax = 0;
		int minProduct = nums[0];
		int maxProduct = currentProduct;
		
		for(int i = 1; i < nums.length; i++)
		{
			int num = nums[i];
			
			tempMax = Math.max(num, Math.max(currentProduct * num, minProduct * num)); 
			minProduct = Math.min(num, Math.min(currentProduct * num, minProduct * num));
			currentProduct = tempMax;
			
			maxProduct = Math.max(maxProduct, currentProduct);
			
		}
		
		return maxProduct;
	}

}
