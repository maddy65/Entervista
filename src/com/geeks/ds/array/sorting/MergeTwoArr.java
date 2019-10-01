package com.geeks.ds.array.sorting;



public class MergeTwoArr {
	
	static void mergeTwo(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len = len1+len2;
		int temp[] = new int [len];
		int i=0,j=0,k=0;
		while(i<len1 && j<len2) {
			if(arr1[i] < arr2[j]) {
				temp[k++] = arr1[i++];
			}else {
				temp[k++] = arr2[j++];
			}
		}
		while(i<len1) {
			temp[k++] = arr1[i++];
		}
		while(j<len2) {
			temp[k++] = arr1[j++];
		}
		
		for(int x=0; x<len1; x++) {
			arr1[x] = temp[x];
		}
		j = j-i;
		for(int x=0; x<len2; x++){
			arr2[x] = temp[j++];
		}
		System.out.println("Arrays 1: ");
		for(int x=0; x<len1;x++) {
			System.out.println(arr1[x]);
		}
		System.out.println("Arrays 2: ");
		for(int x=0; x<len2;x++) {
			System.out.println(arr2[x]);
		}
	}

	public static void main(String[] args) {
		int arr1[] = {10};
		int arr2[] = {2,3};
		mergeTwo(arr1,arr2);
	}

}
