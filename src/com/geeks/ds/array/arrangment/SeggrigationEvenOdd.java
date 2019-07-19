package com.geeks.ds.array.arrangment;

public class SeggrigationEvenOdd {
	
	static void seggrigation(int array[]) {
		int length = array.length;
		int i = -1, j=0;
		while(j!=length) {
			if(array[j]%2 == 0) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			j++;
		}
		
	}
	static void printArray(int array[]) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		seggrigation(array);
		printArray(array);

	}

}
