package com.geeks.ds.array.orderStatics;

public class LargestUnsortedThree {
	
	static void largestThree(int array[]) {
		int first, second, third;
		third = second = first  = Integer.MIN_VALUE;
		if(array.length < 3) {
			System.out.println("Invalid input");
		}
		for(int i=0; i<array.length; i++) {
			if(array[i] > first) {
				third = second;
				second = first;
				first = array[i];
			}else if(array[i] > second) {
				third = second;
				second = array[i];
			}
			else if(array[i]>third) {
				third = array[i];
			}
		}
		System.out.println("Numbers are : "+first+" "+second+" "+third);
	}

	public static void main(String[] args) {
		int [] array = {32,23,45,65,33,43};
		largestThree(array);

	}

}
