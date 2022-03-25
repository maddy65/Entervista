package com.leetcode.ds.practice;

import java.util.HashMap;
import java.util.Map;

public class Intersection {

	public static void main(String[] args) {
		 int[] nums1={1,2,2,1};
	        int[] nums2={2,2};
	    int[] ans=intersect(nums1,nums2);
	        for(int x:ans)
	            System.out.print(x+" ");
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		if(nums1.length > nums2.length) {
			return intersect(nums2,nums1);
		}
		Map<Integer,Integer> hs = new HashMap<Integer, Integer>();
		for(int val : nums1) {
			hs.put(val, hs.getOrDefault(val, 0)+1);
		}
		
		int key = 0;
		for(int val : nums2) {
			if(hs.getOrDefault(val, 0) > 0) {
				nums1[key++] = val;
				hs.put(val, hs.get(val)-1);
			}
		}
		int ans[]=new int[key];
        for(int i=0;i<key;i++){
            ans[i]=nums1[i];
        }
		
		return ans;
	}

}


