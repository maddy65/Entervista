package com.geeks.ds.array.arrangment;

public class MoveZeroEnd {
	
	static void moveZeroToEnd(int array[]) {
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] != 0) {
				array[count++] = array[i];
			}
		}
		while(count < array.length) {
			array[count++] = 0;
		}
	}
	static void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		moveZeroToEnd(array);
		printArray(array);
		

	}

}
