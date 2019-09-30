package com.geeks.ds.array.sorting;

public class PairSum {

	public static void main(String[] args) {
		int pair[] = {15, 13, 11, 10, 12, 10, 9, 8, 7, 5};
		int n = 5;
		int[] arr = new int[n]; 
		constructArr(arr, pair, n); 
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i]+" ");
	}

	private static void constructArr(int[] arr, int[] pair, int n) {
		System.out.println(arr[0]);
		for (int i=1; i<n; i++) {
			arr[i] = pair[i-1]-arr[0]; 
		} 
		
	}

}
