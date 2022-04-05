package medium;

import java.util.HashSet;

public class LengthOfLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubString("abcabcbb"));
		System.out.println(lengthOfLongestSubstring2("abc"));
	}
	
	public static int lengthOfLongestSubString(String s) {
		
		int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
        
	}
	
	//missing a small part of this to make it work. If encounter "au" fail
	public static int lengthOfLongestSubstring2(String s) {
        int result = 0;
        if(s.length() == 1)
        {
        	return 1;
        }
	
		for(int i = 0; i < s.length(); i++)
		{
			HashSet<Character> encountered = new HashSet<Character>();
			encountered.add(s.charAt(i));
            
			for(int j = i + 1; j < s.length(); j++)
			{
				if(encountered.contains(s.charAt(j)))
				{
                    j--;
					result = Math.max(result, j - i + 1);
                    break;
				}
				encountered.add(s.charAt(j));
			}
		}
		
		return result; 
    }

}
