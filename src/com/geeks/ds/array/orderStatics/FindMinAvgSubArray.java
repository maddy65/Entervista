package com.geeks.ds.array.orderStatics;

public class FindMinAvgSubArray {
	
	static int arr[] = {3, 7, 90, 20, 10, 50, 40};

	public static void main(String[] args) {
		int key = 3;
		findMinSubAvg(key);
	}

	private static void findMinSubAvg(int key) {
		int length = arr.length;
		if(length < key)
			return;
		int res_index = 0;
		int curr_sum = 0;
		for(int i=0; i<key; i++) {
			curr_sum += arr[i];
		}
		int min_sum = curr_sum;
		for(int i=key; i<length; i++) {
			curr_sum += arr[i] - arr[i-key];
			if(curr_sum < min_sum) {
				min_sum = curr_sum;
				res_index = (i-key+1);
			}
		}
		System.out.println("Subarray between [" + res_index + ", " + (res_index + key - 1) + "] has minimum average");
	}

}
