package com.geeks.ds.array.rotation;

public class CyclicProgramming {

	void rotateCycle(int array[], int length) {
		int end = array[length-1];
		int i;
		for(i = length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		array[0] = end;
	}
	void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		CyclicProgramming Cp = new CyclicProgramming();
		int array[] = {1,2,3,4,5,6,7};
		int length = array.length;
		Cp.rotateCycle(array, length);
		Cp.printArray(array);
	}

}
