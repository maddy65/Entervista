package com.geeks.ds.LinkedList.Single;

public class sol {

	public static void main(String[] args) {
		int [] arr = new int[] {1,3,5,2,4,8,2,2};
		
		System.out.println(minmaxgame(arr));

	}
	
	public static int minmaxgame(int [] nums) {
		int len = nums.length;
		if(nums.length == 1) {
			return nums[0];
		}
		int newlen = len/2;
		
		int [] newArr = new int[newlen];
		int j = 0;
		boolean min = true;
		boolean max = false;
		for(int i=0; i<len; i++) {
			if(i % 2 == 0) {
				
				if(min == true) {
					newArr[j] = Math.min(nums[i], nums[i+1]);
				}else {
					newArr[j] = Math.max(nums[i], nums[i+1]);
				}
				if(min == true) {
					min = false;
					max = true;
				}else {
					max = false;
					min = true;
				}
				
				j = j+1;
				
			}
		}
		
		return minmaxgame(newArr); 
	}

}
