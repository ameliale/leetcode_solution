package easy;

public class PalindromeNumber {
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
	        
	        int reversedNum = 0;
	        int originalValue = x;
	        
	        if(x < 0)
	        {
	            return false;
	        }
	        
	        while(x > 0)
	        {
	            int lastDigit = x % 10;
	            reversedNum = reversedNum * 10 + lastDigit;
	            x = x / 10;
	        }
	        
	        if(reversedNum == originalValue)
	        {
	            return true;
	        }
	        
	        return false;
	    }

}
