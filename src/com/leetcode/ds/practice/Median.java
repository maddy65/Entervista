package com.leetcode.ds.practice;

public class Median {

	public static void main(String[] args) {
		
		int [] arr1 = new int[]{1, 5, 9, 10, 15, 20};
		int [] arr2 = new int[]{2, 3, 8, 13};
		
		System.out.println(findMediaum(arr1,arr2));
	}
	
	public static double findMediaum(int[] arr1, int[] arr2) {
		
		int i=0, j=0, k=0;
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] temp = new int [len1+len2];
		
		while(i<len1 && j<len2) {
			if(arr1[i] < arr2[j]) {
				temp[k++] = arr1[i++];
			}else {
				temp[k++] = arr2[j++];
			}
		}
		
		while (i < len1) {
			temp[k++] = arr1[i++];
		}
		while(j< len2) {
			temp[k++] = arr2[j++];
		}
		int tempLength = temp.length;
		if(tempLength % 2 !=0 ) {
			return (double) temp[tempLength/2];
		}else {
			int mid1 = temp[(tempLength-1)/2];
			int mid2 = temp[(tempLength)/2];
			int median = mid1+mid2;
		    return (double) median/2.0;
		}
		
	}

}
