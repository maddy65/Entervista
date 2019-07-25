package com.geeks.ds.array.orderStatics;

import java.util.Arrays;

public class MeanMedium {
	
	public static double findMean(int array[]) {
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		return (double)sum / (double)array.length; 
	}
	
	public static double findMedian(int array[]) {
		Arrays.sort(array);
		int length = array.length;
		if(length % 2 != 0) {
			return (double)array[length/2];
		}
		return (double) (array[(length - 1) / 2] + array[length / 2]) / 2.0;
	}

	public static void main(String[] args) {
		 int array[] = { 1, 3, 4, 2, 7, 5, 8, 6 }; 
	        System.out.println("Mean = " + findMean(array));  
	        System.out.println("Median = " + findMedian(array));  

	}

}
