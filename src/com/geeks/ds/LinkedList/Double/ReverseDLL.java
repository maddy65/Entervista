package com.geeks.ds.LinkedList.Double;


public class ReverseDLL {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
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
		System.out.println("Traversing in reverse direction: ");
		while(last != null) {
			System.out.print(last.data+" ");
			last = last.prev;
		}
		System.out.println(" ");
	} 
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}

	public void reverse() {
		Node temp = null,
			 current = head;
		while(current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if(temp != null) {
			head = temp.prev;
		}
	}
	public static void main(String[] args) {
		ReverseDLL rdl = new ReverseDLL();
		rdl.insert(5);
		rdl.insert(4);
		rdl.insert(3);
		rdl.insert(2);
		rdl.insert(1);
		rdl.printlist(rdl.head);
		rdl.reverse();
		rdl.printlist(rdl.head);

	}

}
