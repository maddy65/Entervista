package com.geeks.ds.LinkedList.Single;

public class InsertionList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node (int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	public void insertFirst(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("the prev_node cannot be null. ");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void insertEnd(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}

	public static void main(String[] args) {
		InsertionList ilst = new InsertionList();
		
		ilst.insertFirst(1);
		ilst.insertAfter(ilst.head, 2);
		ilst.insertEnd(3);
		ilst.printList();

	}

}
