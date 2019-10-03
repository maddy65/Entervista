package com.geeks.ds.stack.design;

import java.util.Stack;

public class QueueStack {
	
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	static int deQueue() {
		if(s1.isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(0);
		}
		int x = s1.peek();
	}

	private void enQueue(int i) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(i);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
		
	

	public static void main(String[] args) {
		QueueStack qs = new QueueStack();
		qs.enQueue(1);
		qs.enQueue(2);
		qs.enQueue(3);
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());
		System.out.println(qs.deQueue());

	}

	

}
