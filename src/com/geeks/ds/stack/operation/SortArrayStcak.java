package com.geeks.ds.stack.operation;

import java.util.Stack;

public class SortArrayStcak {
	
	static void sortArrayUsingStack(int[] arr, int length) {
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<length; i++) {
			st.push(arr[i]);
		}
		
		Stack<Integer> tempStack = sortStack(st);
		for (int i = 0; i < length; i++){ 
			arr[i] = tempStack.peek(); 
			tempStack.pop(); 
		} 
	}

	private static Stack<Integer> sortStack(Stack<Integer> st) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!st.isEmpty()) {
			int temp = st.peek();
			st.pop();
			while(!tempStack.empty() && tempStack.peek() < temp) {
				st.push(tempStack.peek());
				tempStack.pop();
			}
			tempStack.push(temp);
		}
		return tempStack;
	}

	public static void main(String[] args) {
		int arr[] = {10,5,3,6,14};
		int length = arr.length;
		sortArrayUsingStack(arr,length);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
