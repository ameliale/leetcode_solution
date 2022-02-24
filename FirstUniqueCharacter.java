package easy;

import java.util.HashMap;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqueCharacter("leetcode"));
		System.out.println(firstUniqueCharacter("loveleetcode"));
		System.out.println(firstUniqueCharacter("aabb"));
	}
	
	public static int firstUniqueCharacter(String s)
	{
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++)
		{
			if(map.get(s.charAt(i)) == 1)
			{
				return i;
			}
		}
		
		return -1;
	}

}
