package com.geeks.ds.array.orderStatics;

public class FindMinimumDistance {

	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
		int x = 3;
		int y = 8;
		findMinDiff(arr,x,y);
	}
	
	static void findMinDiff(int arr[], int x, int y) {
		if(x == y) {
			System.out.println("Change the value ");
			return;
		}
		int prev = 0;
		int i = 0;
		int minDiff = Integer.MAX_VALUE;
		for(i=0; i<arr.length; i++) {
			if(arr[i] == x || arr[i] == y) {
				prev = i;
				break;
			}
		}
		
		for(; i<arr.length; i++) {
			if(arr[i] ==x || arr[i] ==y) {
				if(arr[prev] != arr[i] && (i-prev) <minDiff) {
					minDiff = i-prev;
					prev = i;
				}else {
					prev = i;
				}
			}
		}
		System.out.println(minDiff);
	}
}
