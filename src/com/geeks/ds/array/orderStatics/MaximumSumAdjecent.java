package com.geeks.ds.array.orderStatics;

public class MaximumSumAdjecent {
	
	int FindMaxSum(int arr[], int len) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		for(int i=1; i<len; i++) {
			excl_new = (incl > excl) ? incl : excl;
			incl = excl + arr[i]; 
            excl = excl_new; 
		}
		return ((incl > excl) ? incl : excl);
	}

	public static void main(String[] args) {
		MaximumSumAdjecent sum = new MaximumSumAdjecent(); 
        int arr[] = new int[]{5, 5, 10, 100, 10, 5}; 
        System.out.println(sum.FindMaxSum(arr, arr.length)); 

	}

}
