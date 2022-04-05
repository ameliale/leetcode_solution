package easy;

public class BestTimetoBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1, 2, 5, 9, 10};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices)
	{
		int lowestSellDay = Integer.MAX_VALUE;
		int largestDifference = 0;
		
		for(int i = 0; i < prices.length; i++)
		{
			if(prices[i] < lowestSellDay)
			{
				lowestSellDay = prices[i];
			}
			else 
			{
				largestDifference = Math.max(largestDifference, prices[i] - lowestSellDay);
			}
		}
		
		return largestDifference;
	}

}
