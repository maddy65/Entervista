package com.geeks.ds.stack.design;

public class StackUsingLinkedList {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	
	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printStack() {
		Node temp = head;
		while(temp != null) {
			System.out.print(" "+temp.data);
			temp = temp.next;
		}
	}
	
	 public boolean isEmpty() 
	    { 
	        return head == null; 
	    } 
	
	public int peek() {
		if(!isEmpty()) {
			return head.data;
		}
		else {
			System.out.println("Stack is empty"); 
	        return -1; 
		}
	}
	
	 public void pop()
    { 
        if (head == null) { 
            System.out.print("\nStack Underflow"); 
            return; 
        } 
        head = head.next;
    } 
	public static void main(String[] args) {
		StackUsingLinkedList obj = new StackUsingLinkedList();
		obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
        obj.printStack();
        System.out.println("");
        System.out.println("Top Element: "+obj.peek());
        
        obj.pop(); 
        obj.pop(); 
        obj.printStack();
        System.out.println("");

	}

}
