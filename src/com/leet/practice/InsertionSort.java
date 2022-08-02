package com.leet.practice;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr = new int[]{9,5,1,4,3};
		System.out.println("Befor Sorting ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int[] sortedArray = new  int[arr.length];
		sortedArray = insertion(arr);
		System.out.println(" ");
		System.out.println("After  Sorting ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
	
	public static int[] insertion(int [] arr) {
		int len = arr.length;
		
		for(int i=1; i<len; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && key<arr[j]) {
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
		return arr;
		
	}

}
