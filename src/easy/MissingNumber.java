package easy;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 0, 3};
		
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
        
        //actual sum 
        int actualSum = 0;
        //expected sum 
        int expectedSum =  nums.length * (nums.length + 1) / 2;
        
        //iterate through the array to get the actual sum 
        for(int num : nums)
        {
            actualSum += num;
        }
        
        //return the expectedsum - actualsum
        actualSum = expectedSum - actualSum;
        return actualSum;
    }

}
