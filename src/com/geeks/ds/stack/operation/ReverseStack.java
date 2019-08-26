package com.geeks.ds.stack.operation;

import java.util.Stack;

public class ReverseStack {
	
	static Stack<Character> st= new Stack<>();
	
	static void reverse() {
		if(st.size() > 0) {
			char x = st.peek();
			st.pop();
			reverse();
			insertReverse(x);
		}
	}
	
	static void insertReverse(char x) {
		if(st.isEmpty()) {
			st.push(x);
		}else {
			char val = st.peek();
			st.pop();
			insertReverse(x);
			st.push(val);
		}
	}

	public static void main(String[] args) {
		
		st.push('1');
		st.push('2');
		st.push('3');
		st.push('4');
		System.out.println("Before Reverse");
		System.out.println(st);
		reverse();
		System.out.println("Afrer Reverse");
		System.out.println(st);
		
	}

}
