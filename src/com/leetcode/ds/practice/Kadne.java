package com.leetcode.ds.practice;

public class Kadne {

	public static void main(String[] args) {
		  int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}
	
	static int maxSubArraySum(int a[]) {
		int size = a.length;
		
		int max_so_far = Integer.MIN_VALUE, max_ending = 0;
		
		for(int i=0; i<size; i++) {
			max_ending = max_ending + a[i];
			if(max_so_far < max_ending) {
				max_so_far = max_ending;
			}
			if(max_ending < 0) {
				max_ending = 0;
			}
		}
		return max_so_far;
	}

}
