package medium;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1, 1};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
        
        int maxArea = 0;
        int currentArea = 0;
        int p1 = 0;
        int p2 = height.length - 1;
        
        while(p1 != p2)
        {
            if(height[p1] > height[p2])
            {
                currentArea = height[p2] * ((p2 + 1) - (p1 + 1));
                p2--;
            }
            else
            {
                currentArea = height[p1] * ((p2 + 1) - (p1 + 1));
                p1++;
            }
            if(currentArea > maxArea)
            {
                maxArea = currentArea;
            }
        }
        
        return maxArea;
        
    }

}
