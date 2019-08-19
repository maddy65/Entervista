package com.geeks.ds.array.orderStatics;

public class SecondLargest {
	
	static void printlarges(int arr[], int len) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i]; 
			}else if(arr[i] > second && arr[i] != first){
				second = arr[i];
			}
		}
		System.out.println(second);
	}

	public static void main(String[] args) {
		 int arr[] = {12, 35, 1, 10, 34, 1,2,3,4,60}; 
         int n = arr.length; 
         printlarges(arr, n); 
	}

}
