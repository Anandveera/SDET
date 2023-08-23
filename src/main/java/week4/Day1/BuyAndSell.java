package week4.Day1;

import org.junit.Test;

public class BuyAndSell {

	
	/*
	 * Best Time to Buy and Sell Stock
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 * 
	 * Input: prices = [7,1,5,3,6,4]
	 * output 	
	 */
	@Test
	public void test1() {
		maxProfit(new int[] {7,1,5,3,6,4});
	}
	public int maxProfit(int[] price) {
		int buy = price[0];
		int maxProfit = 0;
		for(int i=0;i<=price.length;i++) {
			if(buy>price[i]) {
				buy = price[i];
				System.out.println("Buy="+buy);
			}else if(price[i]-buy>maxProfit) {
				maxProfit=price[i]-buy;
				System.out.println("MaxProfit"+maxProfit);
			}
		}
		
		return maxProfit;
		
	}
}
