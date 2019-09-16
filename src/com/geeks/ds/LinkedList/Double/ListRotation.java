package com.geeks.ds.LinkedList.Double;

public class ListRotation {
	
	static class Node{
		char data;
		Node prev;
		Node next;
	}
	
	static Node head = null;
	
	static void push(char new_data) {
		Node new_node = new Node();
		new_node.data = new_data;
		new_node.prev = null;
		new_node.next = head;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
		
	}
	
	static void printList(Node node) {
		while(node != null && node.next != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		if(node != null) {
			System.out.print(node.data);
		}
	}
	
	static void rotate(int n) {
		if(n == 0) {
			return;
		}
		Node current = head;
		int count = 1;
		while(count < n && current != null) {
			current = current.next;
			count++;
		}
		if(current == null) {
			return;
		}
		Node nth = current;
		while(current.next != null) {
			current = current.next;
		}
		current.next = head;
		head.prev = current;
		head = nth.next;
		head.prev = null;
		nth.next = null;
		
	}

	public static void main(String[] args) {
		push('e');
		push('d');
		push('c');
		push('b');
		push('a');
		int n = 2;
		System.out.println("Linked List");
		printList(head);
		rotate(n);
		System.out.println(); 
		System.out.println("Rotated Linked list "); 
		printList(head); 

	}

	

}
