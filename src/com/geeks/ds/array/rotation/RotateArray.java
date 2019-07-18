package com.geeks.ds.array.rotation;

public class RotateArray {
	
	void leftRotate(int arr[], int d) {
		for(int i=0; i<d; i++) {
			leftRotateByOne(arr);
		}
	}
	
	void leftRotateByOne(int arr[]) {
		int i, temp;
		temp = arr[0];
		for(i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	
	void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		RotateArray rt = new RotateArray();
		int arr[] = {1,2,3,4,5,6,7};
		rt.leftRotate(arr, 2);
		rt.printArray(arr);
		
	}

}
