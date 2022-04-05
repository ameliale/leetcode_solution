package easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()()()(";
		System.out.println(isValid(s));
	}
	
	private static final Map<Character, Character> map = Map.of('(', ')',
																'[', ']',
																'{', '}');
	public static boolean isValid(String s)
	{
		Stack<Character> stack = new Stack();
		
		for(char c : s.toCharArray())
		{
			if(map.containsKey(c))
			{
				stack.push(c);
			}
			else
			{
				if(stack.isEmpty()) 
				{
					return false;
				}
				char openParenth = stack.pop();
				if(map.get(openParenth) != c)
				{
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}
