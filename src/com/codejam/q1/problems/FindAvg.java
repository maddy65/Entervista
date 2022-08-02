package com.codejam.q1.problems;

public class FindAvg {

	public static void main(String[] args) {
		int[] nums = new int[] {2,5,3,9,5,3};
		System.out.println(minimumAverageDifference(nums));
		
	}
	
	public static int  minimumAverageDifference(int[] nums) {
		int index = 0;
		int count = 0;
				
		for(int i=0; i<nums.length; i++) {
			int left = 0;
			int right = 0;
			for(int j=0; j<=i; j++) {
				left = left + nums[j];
			}
			for(int k=i; k<nums.length; k++) {
				right = right + nums[k];
			}
			right = right -nums[i];
			left = left/(i+1);
			int val = nums.length - (i+1);
			if(val == 0) {
				val = 1;
			}
			right = right/val;

			int avg = Math.abs(left - right);
			
			
			if(i == 0) {
				count = avg;
				index = i;
			}else {
				if(avg < count) {
					count = avg;
					index = i;
				}
			}
			
			
		}
		return index;
        
    }

}
