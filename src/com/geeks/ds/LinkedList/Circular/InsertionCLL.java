package com.geeks.ds.LinkedList.Circular;


public class InsertionCLL {
	static class Node{
		int data;
		Node next;
	}
	
	static Node empty (Node head, int data) {
		
		if(head != null) {
			return head;
		}
		Node new_node = new Node();
		new_node.data = data;
		head = new_node;	
		head.next = head;
		return head;
	}
	
	static Node front (Node head, int data) {
		if(head == null) {
			return empty(head, data);
		}
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = head.next;
		head.next = new_node;
		
		return head;
	}
	
	static Node end(Node head, int data) {
		Node new_node = new Node();
		if(head == null) {
			return empty(head, data);
		}
		new_node.data = data;
		new_node.next = head.next;
		head.next = new_node;	
		head = new_node;
		return head;
	}
	static void printList(Node head) {
		Node temp = head;
		if(head != null) {
			do {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp != head);
		}
		System.out.println(" ");
	}
	

	public static void main(String[] args) {
		Node head = null;
		head = empty(head,2);
		head = front (head,7);
		head = end(head,11);
		printList(head);
	}

}
