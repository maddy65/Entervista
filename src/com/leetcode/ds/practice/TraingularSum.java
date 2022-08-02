package com.leetcode.ds.practice;

public class TraingularSum {

	public static void main(String[] args) {
		int [] arr = new int[]{1,2,3,4,5};
		int val = maxElement(arr);
		System.out.println(val);
	}

	private static int maxElement(int[] arr) {
		
		int len = arr.length;
		
		int count = arr[0];
		while(len > 1) {
			//System.out.println(len-1);
			//int[] tempArr = new int[len-1];
			for(int i=0; i<len-1; i++) {
				int val = arr[i]+ arr[i+1];
				arr[i] = val%10;
			}
			len = len-1;
			if(len == 1) {
				//System.out.println(arr[0]);
				count = arr[0];
			}
		}
		
		return count;
		
		
		
	}

}
