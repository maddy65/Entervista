package com.geeks.ds.array.orderStatics;

import java.util.Arrays;

public class EqualPairs {

	public static void main(String[] args) {
		int [] array = new int [] {3,2,3,2,2,2};
		int len = array.length;
		boolean flg = false;
		if(len%2 == 0) {
			flg = true;
			boolean visited[] = new boolean[len];
			Arrays.fill(visited, false);
			for(int i=0; i<len; i++) {
				if(visited[i] == true) {
					continue;
				}
				int count = 1;
				for(int j=i+1; j<len; j++) {
					if(array[i] == array[j]) {
						visited[j] = true;
						count++;
					}
				}
				
				if(count % 2 != 0) {
					flg = false;
				}
			}
		}
		System.out.println(flg);
		
	}

}
