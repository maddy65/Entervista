package com.geeks.ds.array.sorting;

import java.util.Arrays;

public class Alternate {
	
	static void alternateSort(int arr[], int len) {
		Arrays.sort(arr);
		int i=0, j=len-1;
		while(i<j) {
			System.out.print(arr[j--]+" ");
			System.out.print(arr[i++]+" ");
		}
		
		if(len % 2 !=0) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,6,9,4,3,7,8,2,11};
		int len = arr.length;
		alternateSort(arr,len);
	}

}
