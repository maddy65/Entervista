package com.geeks.ds.array.orderStatics;

public class RunningSum {

	public static void main(String[] args) {
		int [] array = new int []{1,2,3,4};
		
		int [] newArr = new int[4];
		newArr = runningSum(array);
		
		for(int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i] +" ");
		}
	}
	
	public static int[] runningSum(int [] nums) {
		int length = nums.length;
		int [] newArr = new int[length];
		int count = nums[0];
		newArr[0] = count;
		for(int i=1; i<length; i++) {
			count = count+nums[i];
			newArr[i] = count;
		}
		
		return newArr;
		
	}

}
