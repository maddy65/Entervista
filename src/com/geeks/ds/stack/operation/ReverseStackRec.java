package com.geeks.ds.stack.operation;


public class ReverseStackRec {
	
	StackNode top;
	
	class StackNode{
		int data;
		StackNode next;
		StackNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {
		if(this.top == null) {
			top = new StackNode(data);
			return;
		}
		StackNode st = new StackNode(data);
		st.next = this.top;
		this.top = st;
	}
	
	public StackNode pop() {
		StackNode st = this.top;
		this.top = this.top.next;
		return st;
	}
	
	public void display() {
		StackNode s = this.top; 
		while (s != null) { 
			System.out.print(s.data + " "); 
			s = s.next; 
		} 
		System.out.println(); 
	}
	
	public void reverse() {
		StackNode prev,curr,succ;
		curr = prev = this.top;
		curr = curr.next; 
		prev.next = null; 
		while (curr != null) { 

			succ = curr.next; 
			curr.next = prev; 
			prev = curr; 
			curr = succ; 
		} 
		this.top = prev;
		
	}

	public static void main(String[] args) {
		ReverseStackRec s = new ReverseStackRec(); 
		s.push(1); 
		s.push(2); 
		s.push(3); 
		s.push(4); 
		System.out.println("Original Stack"); 
		s.display(); 
		s.reverse(); 
		System.out.println("Reversed Stack"); 
		s.display(); 
	}

}
