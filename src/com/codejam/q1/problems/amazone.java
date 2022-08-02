package com.codejam.q1.problems;

import java.util.ArrayList;
import java.util.List;

public class amazone {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(2);
      
        System.out.println("ArrayList : " +maxSubArray(list));
	}
	
	public static long maxSubArraySum(List<Integer> products){
        int size = products.size();
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + products.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
	
	
	 public static long  maxSubArray(List<Integer> products) {
	        int maxsum=Integer.MIN_VALUE;
	        int cursum=0;
	        for(int i=0;i<products.size();i++){
	            cursum=cursum+products.get(i);
	            if(cursum>maxsum) maxsum=cursum;
	            if(cursum<0) cursum=0;
	        }
	        
	        return maxsum;
	    }
}
