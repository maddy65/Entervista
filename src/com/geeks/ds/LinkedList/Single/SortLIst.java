package com.geeks.ds.LinkedList.Single;

public class SortLIst {
	
	
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
	public void sortData() {
		Node current = head;
		Node index = null;
		int temp;
		if(head == null) {
			return;
		}else {
			while(current != null) {
				index = current.next;
				while( index != null) {
					if(current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		SortLIst slt = new SortLIst();
		slt.insert(4);
		slt.insert(2);
		slt.insert(1);
		slt.insert(3);
		System.out.println("Before Sorting : ");
		slt.printList();
		System.out.println("After Sorting : ");
		
	}

}
