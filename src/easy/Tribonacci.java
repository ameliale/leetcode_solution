package easy;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci {

	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>(Map.of(0, 0, 1, 1, 2, 1));
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SlowTribonacci(5));
		System.out.println(SlowTribonacci(3));
	}
	
	//very slow O(n) performance
	public static int SlowTribonacci(int n) {
		
		if(n <= 2)
		{
			return map.get(n);
		}
		
		map.put(n, SlowTribonacci(n - 1) + SlowTribonacci(n - 2) + SlowTribonacci(n - 3));
		return map.get(n);
		
	}
	
	//dynamic programming O(1)
	
	private static int n = 38;
	public int[] cache = new int[n];
	
	//an object class
	Tribonacci() {
		cache[0] = 0;
		cache[1] = 1;
		cache[2] = 1;
		for(int i = 3; i < n; i++)
		{
			cache[i] = cache[i - 1] + cache[i - 2] + cache[i - 3];
		}
	}
	
	
}



