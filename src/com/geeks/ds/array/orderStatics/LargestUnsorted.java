package com.geeks.ds.array.orderStatics;

public class LargestUnsorted {

	public int findMax(int array[]) {
		int max = array[0];
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		LargestUnsorted temp = new LargestUnsorted();
		int [] array = {32,23,45,65,33,45};
		int value = temp.findMax(array);
		System.out.println("Largest value is: "+value);
	}

}
