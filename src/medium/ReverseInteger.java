package medium;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseInteger(1231));
		System.out.println(reverseInteger(-3244));
	}
	
	public static int reverseInteger(int x)
	{
		boolean isNegative = false;
		long result = 0;
		
		if(x < 0)
		{
			isNegative = true;
			x = Math.abs(x);
		}
		
		while (x > 0)
		{
			int lastNum = x % 10;
			result = result * 10 + lastNum;
			x = x / 10;
		}
        
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
        {
            return 0;
        }
		
        if(isNegative)
		{
			result *= -1;
		}
        
		return (int)result;
	}

}
