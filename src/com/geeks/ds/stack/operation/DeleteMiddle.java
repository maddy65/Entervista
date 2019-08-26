package com.geeks.ds.stack.operation;

import java.util.Stack;

public class DeleteMiddle {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		 st.push('1'); 
         st.push('2'); 
         st.push('3'); 
         st.push('4'); 
         st.push('5'); 
         st.push('6'); 
         st.push('7'); 
         deleteMid(st,st.size(),0);
         while (!st.empty()){ 
             char p=st.pop(); 
             System.out.print(p + " "); 
         } 

	}

	private static void deleteMid(Stack<Character> st, int length, int current) {
		if(st.isEmpty()) {
			return;
		}
		char value = st.pop();
		deleteMid( st,  length,  current+1);
		
		if(current != length/2) {
			st.push(value);
		}
		
	}

}
