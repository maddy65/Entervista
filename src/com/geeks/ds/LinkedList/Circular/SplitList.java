package com.geeks.ds.LinkedList.Circular;


public class SplitList {
	
	static class Node{
		int data;
		Node next;
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
	
	static Node insert(Node head, int data) {
		Node new_node = new Node();
		Node temp = head;
		new_node.data = data;
		new_node.next = head;
		if(head != null) {
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = new_node;
		}else {
			new_node.next = new_node;
		}
		head = new_node;
		return head;
	}
	
	static void splitList(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		while(fastPtr.next != head && fastPtr.next.next != head) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		if(fastPtr.next.next == head) {
			fastPtr = fastPtr.next;
		}
		Node head1 = head;
		Node head2 = null;
		if(head.next != head) {
			head2 = slowPtr.next;
		}
		fastPtr.next = slowPtr.next;
		slowPtr.next = head;
		printList(head1); 
		printList(head2); 
	}

	public static void main(String[] args) {
		Node head = null;
		head = insert(head,12);
		head = insert(head, 56); 
	    head = insert(head, 2); 
	    head = insert(head, 11);
	    printList(head); 
	    splitList(head);

	}

}
