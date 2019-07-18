package com.geeks.ds.array.rotation;

import java.util.Arrays;

public class PairinArray {

	static boolean hasPairInArray(int array[], int length, int key) {
		int low = 0;
		int high = length-1;
		while(low<high) {
			if(array[low] + array[high] == key) {
				return true;
			}
			else if(array[low] + array[high] <key) {
				low++;
			}
			else {
				high--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int array[] = {1,20,13,45,4,36,54};
		Arrays.sort(array);
		int key = 49,	
			length = array.length;
				
		if(hasPairInArray(array, length, key)) {
			System.out.println("Array has two element with given sum ");
		}else {
			System.out.println("Array has no element with given sum");
		}
	}

}
