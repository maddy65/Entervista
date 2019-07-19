package com.geeks.ds.array.arrangment;

public class Reverse {
	
	static void reverseArray(int array[]) {
		int start = 0,
			end = array.length-1;
		int temp;
		while(start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		
	}
	static void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6};
		reverseArray(array);
		printArray(array);
	}

}
