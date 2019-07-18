package com.geeks.ds.array.arrangment;

import java.util.HashSet;
import java.util.Set;

public class ReArrangeIndex {

	static void arrangeIndex(int array[]) {
		Set <Integer> st = new HashSet<Integer>();
		for(int i=0; i<array.length; i++) {
			st.add(array[i]);
		}
		for(int i=0; i<array.length; i++) {
			if(st.contains(i)) {
				array[i] = i;
			}else {
				array[i] = -1;
			}
		}
	}
	public static void main(String[] args) {
		int array[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4,-1};
		arrangeIndex(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}

}
