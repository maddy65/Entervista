package com.geeks.ds.array.rotation;

public class MultipleLeftRotation {
	
	static void leftRotate(int array[], int length, int key) {
		for (int i = key; i < key + length; i++) 
	        System.out.print(array[i % length] + " "); 
	}

	public static void main(String[] args) {
		int array[] = {1,3,5,7,9};
		int length = array.length;
		leftRotate(array, length, 2);

	}

}
