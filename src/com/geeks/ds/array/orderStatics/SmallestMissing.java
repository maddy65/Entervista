package com.geeks.ds.array.orderStatics;

public class SmallestMissing {

	/**
	 * Normal Method 
	 */
	
	
	static int findMissing(int array[]){
		int i=0;
		for(i=0; i<array.length; i++) {
			if(array[i] != i)
				break;
		}
		return i;
	}
	
	/*
	 * Modified Binary Search
	 * */
	
	private int findFirstMissing(int[] myArr, int start, int end) {
		if(start > end)
			return 	end+1;
		
		if(start != myArr[start])
			return start;
		
		int mid = (start+end)/2;
		
		if(myArr[mid] == mid)
			return findFirstMissing(myArr, mid+1, end);

		return findFirstMissing(myArr, start, mid-1);
	}
	
	public static void main(String[] args) {
		SmallestMissing small = new SmallestMissing();
		int myArr[] = {0,1,2,3,4,5,6,7,10};
		int result = findMissing(myArr);
		System.out.println(result);
		int len = myArr.length;
		System.out.println("First Missing element is : "+ small.findFirstMissing(myArr, 0, len - 1)); 
	}

	

}
