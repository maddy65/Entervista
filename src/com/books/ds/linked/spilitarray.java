package com.books.ds.linked;

public class spilitarray {

	public static void main(String[] args) {
		
		int key = 2;
		int[] intArray = new int[] {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<key; i++) {
			int x = intArray[0];
			for(int j=0; j<intArray.length-1; i++) {
				intArray[j] = intArray[j+1];
			}
			intArray[intArray.length-1] = x;
		}
		
		for(int k=0; k<intArray.length; k++) {
			System.out.println(intArray[k]);
		}
		
	}

}
