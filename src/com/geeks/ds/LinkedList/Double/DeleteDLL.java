package com.geeks.ds.LinkedList.Double;

public class DeleteDLL {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
		}
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
	
	public void deleteList(int delete_value) {
		Node current = head;
		if(head == null) {
			return;
		}
		boolean isPresent = false;
		while(current.next != null) {
			if(current.data == delete_value) {
				isPresent = true;
				break;
			}
			current = current.next;
		}
		if(!isPresent) {
			System.out.println("Value not present. ");
			return;
		}
		if(current.prev == null) {
			current.next.prev = null;
			head = current.next;
		}
		else if(current.next == null) {
			current.prev.next = null;
		}else {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		
		
	}
	
	public static void main(String[] args) {
		DeleteDLL dList = new DeleteDLL();
		dList.insert(5);
		dList.insert(4);
		dList.insert(3);
		dList.insert(2);
		dList.insert(1);
		//dList.printlist(dList.head);
		dList.deleteList(0);
		dList.printlist(dList.head);

	}

}
