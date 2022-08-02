package com.leetcode.ds.tree;

import java.util.HashSet;
import java.util.Set;

public class FindDistinct {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		int [] arr2 = new int[] {2,4,6};
		
		int val = getDifference(arr,arr2);
		
		

	}

	private static int getDifference(int[] arr, int[] arr2) {
		int[] newArr = new int [2];
		HashSet<Integer> hashset = new HashSet<>();   
		HashSet<Integer> hashset2 = new HashSet<>();   
	    
        for (int i = 0; i < arr.length; i++){   
           if (!hashset.contains(arr[i])){   
               hashset.add(arr[i]);   
               
           }   
       } 
		
        
        for (int i = 0; i < arr2.length; i++){   
            if (!hashset2.contains(arr2[i])){   
            	hashset2.add(arr2[i]);   
            	System.out.println(arr2[i]);
            }   
        } 
        
        
        
        
 		
        return 0;
	}

}
