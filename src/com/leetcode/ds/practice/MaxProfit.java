package com.leetcode.ds.practice;

public class MaxProfit {
	
	public static void main(String args[]) {
		int[] prices = new int[] {6,1,3,2,4,7};
		int val = 2;
		System.out.println(maxProft(val,prices));
		
	}

	private static int maxProft(int k, int[] prices) {
		int temp = 0;
		int profit = 0;
		int[] sell = new int[k+1];
		int[] buy = new int[k+1];
		
		for(int i=0; i< k+1; i++) {
			sell[i] = 0;
			buy[i] = Integer.MIN_VALUE;
		}
		
		
		for(int i=0; i<prices.length; i++) {
			for(int j = k; j > 0; j--){
                sell[j] = Math.max(sell[j], prices[i] + buy[j]);
                buy[j] = Math.max(buy[j], sell[j-1] - prices[i]);
            }
		}
		
		return sell[k];
	}
}
