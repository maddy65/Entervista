package com.geeks.ds.stack.operation;

import java.util.Stack;

public class SortStackTemp {
	
	public static Stack<Integer> sortStack(Stack<Integer> input){
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!input.isEmpty()) {
			int value = input.pop();
			while(!tempStack.isEmpty() && tempStack.peek() > value) {
				input.push(tempStack.pop());
			}
			tempStack.push(value);
		}
		return tempStack;
	}

	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.push(34);
		input.push(3);
		input.push(31);
		input.push(98);
		input.push(92);
		input.push(23);
		Stack<Integer> tempStack = sortStack(input);
		while(!tempStack.isEmpty()) {
			System.out.println(tempStack.pop());
		}

	}

}
