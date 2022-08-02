package com.codejam.q1.problems;

import java.util.PriorityQueue;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args){
		String S = "PEEL";
		//int K = 5;
		System.out.println(getSmallestStr(S));
	}

	static String getSmallestStr(String S){
		
		Stack<Character> stack = new Stack<Character>();
		
		/*char charZero = S.charAt(0);
		stack.push(charZero); */
		
		for (int i = 1; i <= S.length(); i++) {	
			while(i<=S.length()){
		            char c = S.charAt(i);
		            stack.push(c); 
		    }
		}
		return S;
	}
}
	
