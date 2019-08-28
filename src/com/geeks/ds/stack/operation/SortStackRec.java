package com.geeks.ds.stack.operation;

import java.util.Stack;

public class SortStackRec {
	
	private static void display(Stack<Integer> st) {
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
	}
	
	static void sortStack(Stack<Integer> st) {
		if(st.size() > 0) {
			int val = st.pop();
			sortStack(st);
			insertSort(st,val);
		}
	}
	
	static void insertSort(Stack<Integer> st, int value) {
		if(st.isEmpty() || value > st.peek()) {
			st.push(value);
			return;
		}
		int temp = st.pop();
		insertSort( st, value);
		st.push(temp);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(30);
		st.push(-5);
		st.push(18);
		st.push(14);
		st.push(3);
		//System.out.println("Befor Sorting");
		//display(st);
		sortStack(st);
		System.out.println(" ");
		System.out.println("After Sorting");
		display(st);

	}

	

}
