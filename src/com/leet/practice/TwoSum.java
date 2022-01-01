package com.leet.practice;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		int target = 18;
		
		twoSum(arr,target);
		
		
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
        int temp[] = new int[2];
       for(int i=0; i<nums.length-1; i++) {
           for(int j=i+1; j<nums.length; j++) {
               if(nums[i]+nums[j] == target) {
                   temp[0] = i;
                   temp[1] = j;
               }
           }
		}
   return temp;
   }

}
