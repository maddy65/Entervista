package Reltio;

import java.util.Arrays;

public class MustZero {

	public static void main(String[] args) {
		int[] rank = new  int[]{1,5,0,3,5}; 
		minimumOperations(rank);

	}
	
	
	public static int minimumOperations(int[] nums) {
        int result = 0;
        
        Arrays.sort(nums);  
        
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] != 0) {
        		int val = nums[i];
        		result++;
        		for(int j=1; j<nums.length; j++) {
        			nums[j] = nums[j]-val;
        		}
        	}
        }
        System.out.println(result);
        return result;
    }

}
