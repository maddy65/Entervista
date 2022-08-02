package com.geeks.ds.LinkedList.Single;

public class sol2 {

	public static void main(String[] args) {
		int [] nums = new int[] {1,2};
		int [][] op = new int[][] {{1,3},{2,1},{3,2}};
		
		arrayChange(nums,op);
	}
	
	 static int[] arrayChange(int[] nums, int[][] operations) {
	     int oplen = operations.length;
	     for(int i=0; i<oplen; i++) {
	    	int left = operations[i][0];
	    	int right = operations[i][1];
	    	for(int j=0; j<nums.length; j++) {
	    		if(left == nums[j]) {
	    			nums[j] = right;
	    		}
	    	}
	     }
	     return nums;
	 }
}