package easy;

import java.util.HashMap;

public class RomanToIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RomanToIntergers("MCMXCIV"));
		System.out.println(RomanToIntergers("XXVII"));
		int[] nums = new int[]{1, 2, 3};
		
	}
	
	public static int RomanToIntergers(String s)
	{
		int result = 0;
		
		HashMap<Character, Integer> romanTable = new HashMap<Character, Integer>();
		
		romanTable.put('I', 1);
		romanTable.put('V', 5);
		romanTable.put('X', 10);
		romanTable.put('L', 50);
		romanTable.put('C', 100);
		romanTable.put('D', 500);
		romanTable.put('M', 1000);
		
		for(int i = 0; i < s.length() - 1; i++)
		{
			System.out.println(result);
			if(romanTable.get(s.charAt(i)) < romanTable.get(s.charAt(i+1)))
			{
				result = result - romanTable.get(s.charAt(i));
			}
			else
			{
				result = result + romanTable.get(s.charAt(i));
			}
			
		}
		
		result = result + romanTable.get(s.charAt(s.length() - 1));
		
		return result;
	}

}
