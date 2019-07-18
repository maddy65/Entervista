package com.geeks.ds.array.rotation;

public class ReversalAlgo {

	void rotateArray(int array[], int d) {
		reverseArray(array,0, d);
		reverseArray(array, d+1, array.length -1);
		reverseArray(array, 0, array.length -1);
	}
	
	void reverseArray(int array[], int start,int end) {
		int temp;
		while(start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
	
	void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		ReversalAlgo RsAlgo = new ReversalAlgo();
		int array[] = {1,2,3,4,5,6,7};
		RsAlgo.rotateArray(array,2);
		RsAlgo.printArray(array);

	}

}
