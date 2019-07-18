package com.geeks.ds.array.rotation;

public class RotationCount {
	
	static int countRotation(int array[]) {
		int count = -1;
		int min = array[0];
		for(int i=0; i<array.length; i++) {
			if(min > array[i]) {
				count = i;
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int array[] = {7,12,17,22,27,2,5};
		System.out.println(countRotation(array));

	}

}
