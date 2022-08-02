package com.leetcode.ds.practice;

public class AnagramCheck {

	public static void main(String[] args) {
		String s = "aa";
		String t = "bb";
		System.out.println(isAnagram(s,t));

	}
	
	 public static boolean isAnagram(String s, String t) {
	    
	     
	     char [] arr1 = s.replaceAll("\\s","").toLowerCase().toCharArray();
	     char [] arr2 = t.replaceAll("\\s", "").toLowerCase().toCharArray();
	     
	     if(arr2.length != arr1.length) {
	    	 return false;
	     }
	     
	     int XOR = 0;
	     
	     for(int i=0; i<arr1.length; i++) {
	    	 XOR ^= arr1[i]^arr2[i];
	     }
	     
		 return XOR == 0 ? true : false;
	 }

}
