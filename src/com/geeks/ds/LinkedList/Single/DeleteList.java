package com.geeks.ds.LinkedList.Single;

public class DeleteList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data +" ");
			n = n.next;
		}
		System.out.println("");
	}
	
	public void deleteKey(int key) {
		Node temp = head, prev = null;
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp !=null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if(temp == null)
			return;
		prev.next = temp.next;
	}
	
	public void deletePos(int position) {
		if(head == null) {
			return;
		}
		Node temp = head;
		if(position == 0) {
			head = temp.next;
			return;
		}
		for(int i=0; temp!= null && i<position-1; i++) {
			temp = temp.next;
		}
		if(temp == null || temp.next == null) {
			return;
		}
		Node next = temp.next.next;
		temp.next = next;
	}
	
	public void deleteList() {
		head = null;
	}
	
	public void swapFirstEnd(){
		if(head != null && head.next != null) {
			return;
		}
		Node temp = null;
		Node current = head;
		while(current.next != null) {
			temp = current;
			current = current.next;
		}
		temp.next = null;
		current.next = head;
		head = current;
		
	}
	public void deleteFirst() {
		if(head == null) {
			System.out.println("There is nothing to delete");
		}
		head = head.next;
	}
	
	public void deleteEnd() {
		if(head == null) {
			System.out.println("There is nothing to delete");
		}
		Node last = head;
		while(last.next.next != null) {
			last = last.next;
		}
		last.next = null;
	}

	public static void main(String[] args) {
		DeleteList dLst = new DeleteList();
		dLst.insert(1);
		dLst.insert(2);
		dLst.insert(3);
		dLst.insert(4);
		dLst.insert(5);
		System.out.println("My List after insretion");
		dLst.printList();
		System.out.println("My last after changing first and end ");
		dLst.swapFirstEnd();
		dLst.printList();
		System.out.println("My list after deleting key");
		dLst.deleteKey(3);
		dLst.printList();
		System.out.println("My list after deleting position");
		dLst.deletePos(3);
		dLst.printList();
		System.out.println("My List After delteing First element");
		dLst.deleteFirst();
		dLst.printList();
		System.out.println("My List After delteing end element");
		dLst.deleteEnd();
		dLst.printList();
		System.out.println("My List After delteing all the list");
		dLst.deleteList();
		dLst.printList();
	}

}
