package com.geeks.ds.LinkedList.Double;

public class InsertDLL {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node (int d){
			data = d;
		}
	}
	
	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversing in forward direction: ");
		while(node != null) {
			System.out.print(node.data+" ");
			last = node;
			node =node.next;
		}
		System.out.println(" ");
		System.out.print("Traversing in reverse direction: ");
		while(last != null) {
			System.out.print(last.data+" ");
			last = last.prev;
		}
	}
	
	public void front(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}
	public void end(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		Node last = head;
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		new_node.prev = last;
	}
	
	public void append(Node node, int new_data) {
		if(node == null) {
			System.out.println("The given node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = node.next;
		node.next = new_node;
		new_node.prev = node;
		if(new_node.next != null) {
			new_node.next.prev = new_node;
		}
	}
	public static void main(String[] args) {
		InsertDLL dllList = new InsertDLL();
		dllList.front(1);
		dllList.front(2);
		dllList.front(3);
		dllList.end(7);
		dllList.end(8);
		dllList.end(9);
		dllList.append(dllList.head.next,7);
		dllList.printlist(dllList.head);

	}

}
