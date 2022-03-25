package com.leetcode.ds.practice;

public class Stocks {
	public static void main(String[] args) {
		//int arr[] = new int[] {7,1,5,3,6,4};
		int arr[] = new int[] {7,6,4,3,1};
		//int arr[] = new int[] {2,4,1};
		System.out.println(maxProfit(arr));
	}
	
	public static int maxProfit(int[] prices) {
		
		int minVal = Integer.MAX_VALUE;
		int profit = 0;
		int curr = 0;
		
		for(int i=1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				
				profit += prices[i]-prices[i-1];
			}
		}
		/*for(int i=0; i<prices.length-1; i++) {
			if(minVal > prices[i]) {
				minVal = prices[i];
			}
			//int curr = 0;
			if(prices[i] > prices[i+1]) {
				int temp = curr;
				
				temp = prices[i] - minVal;
				curr += temp;
			}
			
			if(curr > profit) {
				profit = curr;
			}
		}*/
		
		
		// Max Profit 
		
		
		/*int minVal = Integer.MAX_VALUE;
		
		int profit = 0;
		
		for(int i=0; i<prices.length; i++) {
			if(minVal > prices[i]) {
				minVal = prices[i];
			}
			
			int cur = prices[i] - minVal;
			
			if(cur > profit) {
				profit = cur;
			}
		}*/
		
	/*	int minIndex = 0;
		int minVal = Integer.MAX_VALUE;
		
		for(int i=0; i<prices.length; i++) {
			if(prices[i] < minVal) {
				minVal = prices[i];
				minIndex = i;
			}
		}
		int maxVal = minVal;
		int maxIndex = minIndex;
		
		for(int j=minIndex; j<prices.length; j++) {
			if(prices[j] > maxVal) {
				maxVal = prices[j];
				maxIndex = j;
			}
		}*/
		
		/*System.out.println(minIndex);
		System.out.println(minVal);
		System.out.println(maxIndex);
		System.out.println(maxVal);*/
		//int result = maxVal - minVal;
		//return result;
        return profit;
    }
}
