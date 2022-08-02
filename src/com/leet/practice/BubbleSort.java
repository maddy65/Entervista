package com.leet.practice;

public class BubbleSort {

	public static void main(String args[]) {
		int arr[] = {3,60,35,2,45,320,5};
		System.out.println("Befor Sorting ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int[] sortedArray = new  int[arr.length];
		sortedArray = bubble(arr);
		System.out.println(" ");
		System.out.println("After  Sorting ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		
	}
	
	public static int[] bubble(int []arr) {
		int len = arr.length;
		int temp = 0;
		for(int i=0; i<len; i++) {
			for(int j= 1; j<(len-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
