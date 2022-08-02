package com.geeks.ds.array.orderStatics;

public class DoubleExists {

	public static void main(String[] args) {
		int [] array = new int[] {0,0};
		System.out.println(4%2);
		//System.out.print(checkIfExist(array));
	}
	
	public static boolean checkIfExist(int [] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0 && array[i] >= 0) {
				int num = array[i]/2;
				for(int j=0; j<array.length; j++) {
					if(array[j] == num) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
