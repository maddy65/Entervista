package com.geeks.ds.stack.operation;

import java.util.Stack;

public class DeleteSmaller {
	
	static void deleteElements(int arr[], int len, int key) {
		Stack<Integer> st = new Stack<Integer>();
		int count = 0;
		st.push(arr[0]);
		
		for(int i=1; i<len; i++) {
			while(!st.isEmpty() && st.peek() < arr[i] && count < key) {
				st.pop();
				count++;
			}
			st.push(arr[i]);
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

	public static void main(String[] args) {
		int arr[] = {20,10,25,30,40};
		int length = arr.length;
		int key = 2;
		deleteElements(arr, length, key);
	}

}
