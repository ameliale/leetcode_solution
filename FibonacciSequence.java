package easy;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {

	private static Map<Integer, Integer> cache = new HashMap<Integer, Integer>(Map.of(0, 0, 1, 1));
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(10));
	}
	
	public static int fib(int n)
	{
		if(cache.containsKey(n))
		{
			return cache.get(n);
		}
		
		cache.put(n, fib(n - 1) + fib(n - 2));
		return cache.get(n);
	}

}
