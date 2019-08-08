package com.geeks.ds.array.arrangment;

import java.lang.reflect.Array;

public class POsitiveNegative {
	
	static void rearrange(int arr[], int size) {
		int positive = 0, negative = 1, temp;
		while(true) {
			while(positive < size && arr[positive] >= 0) {
				positive += 2;
			}
			while(negative < size && arr[negative] <= 0) {
				negative += 2;
			}
			if(positive < size && negative < size) {
				temp = arr[positive];
				arr[positive] = arr[negative];
				arr[negative] = temp;
			}else {
				break;
			}
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
		int length = arr.length;
		rearrange(arr,length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
