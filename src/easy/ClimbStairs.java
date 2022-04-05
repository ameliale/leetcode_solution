package easy;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(10));
	}
	
	public static int climbStairs(int n) {
        
        int[] cache = new int[n + 1];
        return stairClimbed(0, n, cache);
    }
    
    public static int stairClimbed(int i, int n, int cache[])
    {
        if(i > n)
        {
            return 0;
        }
        if(i == n)
        {
            return 1;
        }
        if(cache[i] > 0)
        {
            return cache[i];
        }
        
        cache[i] = stairClimbed(i + 1, n, cache) + stairClimbed(i + 2, n, cache);
        
        return cache[i];
        
    }

}
