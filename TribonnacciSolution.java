package easy;

public class TribonnacciSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(tribonacci(37));
	}
	
	public static Tribonacci tri = new Tribonacci();
	
	public static int tribonacci(int n)
	{
		return tri.cache[n];
		
	}

}
