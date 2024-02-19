package arrays;

public class BuyAndSellStock {

	public static void main(String[] args) { // prices = [7,1,5,3,6,4]

		int[] arr = {7,1,5,3,6,4};
		int highProfit = maxProfit(arr);
		System.out.println(highProfit);
	}
	
	public static int maxProfit(int[] prices) {
		int buyStock = prices[0];
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i=1; i<prices.length; i++) {
			int currentProfit = prices[i] - buyStock;
			if(currentProfit > maxProfit) {
				maxProfit = currentProfit;
			}
			if(prices[i]<buyStock) {
				buyStock = prices[i];
			}
		}
		return maxProfit;
	}
}
