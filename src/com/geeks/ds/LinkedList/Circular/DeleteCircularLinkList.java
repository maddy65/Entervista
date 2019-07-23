package com.geeks.ds.LinkedList.Circular;


public class DeleteCircularLinkList {
	static class Node{
		int data;
		Node next;
	}
	
	static Node push(Node head, int data) {
		Node ptr1 = new Node();
		Node temp = head;
		ptr1.data = data;
		ptr1.next = head;
		
		if(head != null) {
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = ptr1;
		}else {
			ptr1.next = ptr1; 
		}
		head = ptr1;
		return head;
	}
	
	static void PrintList(Node head) {
		Node temp = head;
		if(head != null) {
			do {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}while(temp != head);
		}
	}
	
	static Node deleteNode(Node head, int key) {
		if(head == null) {
			return null;
		}
		Node current = head, prev = null;
		while(current.data != key) {
			if(current.next == head) {
				System.out.println("Given data is not present ");
				break;
			}
			prev = current;
			current = current.next;
		}
		if(current.next == head) {
				head = null;
				return head;
		}
		if(current == head) {
			prev = head;
			while(prev.next != head) {
				prev = prev.next;
			}
			head = current.next;
			prev.next = head;	
		}else if(current.next == head ){
			prev.next = current.next;
		}else {
			prev.next = current.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = push(head,2);
		head = push(head,5); 
	    head = push(head,7); 
	    head = push(head,8);
	    head = push(head,10);
	    PrintList(head); 
	    System.out.println();
	    head = deleteNode(head,7);
	    PrintList(head);

	}

}
