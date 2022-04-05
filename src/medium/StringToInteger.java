package medium;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("-42"));
		
	}
	public static int myAtoi(String s) {
        
        boolean isNegative = false;
        int result = 0;
        int digit = 0;
        int index = 0;
        int length = s.length();
        
        while(index < length && s.charAt(index) == ' ')
        {
            index++;
        }
        
        if(index < length && s.charAt(index) == '+')
        {
            isNegative = false;
            index++;
        }
        else if(index < length && s.charAt(index) == '-')
        {
            isNegative = true;
            index++;
        }
        
        while(index < length && Character.isDigit(s.charAt(index)))
        {
            digit = s.charAt(index) - '0';
            
            if((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10) && (digit > Integer.MAX_VALUE % 10))
            {
                if(isNegative)
                {
                    return Integer.MIN_VALUE;
                }
                else
                {
                    return Integer.MAX_VALUE;
                }
            }
            
            result = 10 * result + digit;
            index++;
        }
        
        if(isNegative)
        {
            return result * -1;
        }
        
        return result;
	}

}
