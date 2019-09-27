package com.geeks.ds.array.sorting;

import java.util.Arrays;

public class MaxMinProduct {
	
	static void productMinMax(int arr1[],int arr2[],int len1,int len2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int product = arr1[len1-1] * arr2[0];
		System.out.println(product);
	}

	public static void main(String[] args) {
		int arr1[] = {5, 7, 9, 3, 6, 2};
		int arr2[] = {1, 2, 6, -1, 0, 9};
		int len1 = arr1.length;
		int len2 = arr2.length;
		productMinMax(arr1,arr2,len1,len2);
	}

}
