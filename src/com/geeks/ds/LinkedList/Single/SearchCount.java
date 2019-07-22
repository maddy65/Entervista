package com.geeks.ds.LinkedList.Single;

public class SearchCount {

	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println("");
	}
	
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
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
	
	public void count() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Length of the liked list is: "+count);
		System.out.println(" ");
	}
	public boolean search(int value) {
		boolean isFound = false;
		Node temp = head;
		while(temp != null) {
			if(temp.data == value) {
				isFound = true;	
			}
			temp = temp.next;
		}
		return isFound; 
	}
	
	public static void main(String[] args) {
		SearchCount slt = new SearchCount();
		slt.insert(1);
		slt.insert(2);
		slt.insert(3);
		slt.insert(4);
		slt.insert(5);
		slt.printList();
		slt.count();
		boolean isFound = slt.search(0);
		if(isFound) {
			System.out.println("Value is present. ");
		}else {
			System.out.println("Value is not present. ");
		}
	}

}
