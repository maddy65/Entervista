package com.geeks.ds.array.sorting;
import java.util.*;

public class ABSSort {

	public static void main(String[] args) {
		int[] array = {10,5,3,9,2};
		int len = array.length;
		int key = 7;
		reArrange(array,len,key);
		printArray(array, len);
	}

	private static void printArray(int[] array, int len) {
		for(int i=0; i<len; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

	private static void reArrange(int[] array, int len, int key) {
		TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>();
		for(int i=0; i<len; i++) {
			int diff = Math.abs(key - array[i]);
			if(tm.containsKey(diff)) {
				ArrayList<Integer> al = tm.get(diff);
				al.add(array[i]);
				tm.put(diff,al);
			}else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(array[i]);
				tm.put(diff,al);
			}
		}
		int index = 0;
		for(Map.Entry entry : tm.entrySet()) {
			ArrayList<Integer> al = tm.get(entry.getKey());
			for(int i=0; i<al.size(); i++) {
				array[index++] = al.get(i);
			}
		}
		
	}

}
