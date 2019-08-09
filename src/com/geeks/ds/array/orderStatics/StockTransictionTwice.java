package com.geeks.ds.array.orderStatics;

public class StockTransictionTwice {

	public static void main(String[] args) {
		int arr[] = {2,30,15,10,8,25,80};
		int result = findProfit(arr);
		System.out.println(result);
	}

	private static int findProfit(int[] arr) {
		int max = Integer.MIN_VALUE;
		int maxTwo = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		int minTwo = Integer.MAX_VALUE;;
		
		int maxIndexOne = 0;
		int maxIndexTwo = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndexOne = i;
			}
		}
		for(int i=maxIndexOne-1; i>0; i--) {
			if(arr[i] < arr[i-1]) {
				min = arr[i];
				break;
			}
		}
		int profit1 = max-min;
		
		
		return profit1;
	}

}
