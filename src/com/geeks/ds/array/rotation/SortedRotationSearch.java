package com.geeks.ds.array.rotation;

public class SortedRotationSearch {
	
	static int Search(int array[], int low, int high, int key) {
		if(low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(array[mid] == key) {
			return mid;
		}
		if(array[low] <= array[mid]) {
			if(key >= array[low] && key <= array[mid]) {
				return Search(array, low,mid-1,key);
			}
			return Search(array, mid+1,high, key);
		}
		if(key >= array[mid] && key <= array[high]) {
			return Search(array, mid+1,high, key);
		}
		
		return Search(array, low, mid-1, key);
		
	}

	public static void main(String[] args) {
		int array[] = {4,5,6,7,8,9,1,2,3};
		int key = 6;
		int low = 0;
		int high = array[array.length - 1];
		int i = Search(array, low, high,key);
		if (i != -1)  
            System.out.println("Index: " + i); 
        else
            System.out.println("Key not found"); 
		
	}

}
