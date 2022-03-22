package com.leetcode.ds.practice;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

	public static void main(String[] args) {
		 int[] nums = { 4,4 };
		 if(findDuplicate(nums)) {
			 
			 System.out.println("The duplicate element is ");
		 }else {
			 System.out.println("No Duplicate");
		 }
	}
	
	 public static boolean findDuplicate(int[] nums) {
		 Set<Integer> set = new HashSet<Integer>(); 
		 for(Integer e : nums) {
			 if(set.contains(e)) {
				 return true;
			 }
			 if(e != null) {
				 set.add(e);
			 }
		 }
		 return false;
	        
	 }

}
