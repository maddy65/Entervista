package com.geeks.ds.array.arrangment;

import java.util.Arrays;

public class SmallestLargetOrder {

	static void arrangeOrder(int array[]) {
		int length = array.length;
		Arrays.sort(array);
		int[] tempArray = new int[length]; 
		int arrayIndex = 0;
		for(int i=0, j=length-1; i<= length/2 || j>length/2; i++,j--) {
			if(arrayIndex < length) {
				tempArray[arrayIndex] = array[i];
				arrayIndex++;
			}
			if(arrayIndex <length) {
				tempArray[arrayIndex] = array[j];
				arrayIndex++;
			}
		}
		for(int i=0;i <length; i++) {
			array[i] = tempArray[i];
		}
	}
	static void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int array[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 }; 
		arrangeOrder(array);
		printArray(array);

	}

}
