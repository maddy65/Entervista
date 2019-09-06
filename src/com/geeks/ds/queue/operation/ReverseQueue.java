package com.geeks.ds.queue.operation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
	
	static Queue<Integer> queue;
	
	static void print() {
		while(!queue.isEmpty()) {
			System.out.print(queue.peek()+" ");
			queue.remove();
		}
	}
	
	static void reverse() {
		Stack<Integer> st = new Stack<>();
		while(!queue.isEmpty()) {
			st.add(queue.peek());
			queue.remove();
		}
		while(!st.isEmpty()) {
			queue.add(st.peek());
			st.pop();
		}
	}

	public static void main(String[] args) {
		queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		reverse();
		print();
	}

}
