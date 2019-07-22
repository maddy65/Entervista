package com.geeks.ds.LinkedList.Single;

import java.util.HashSet;

public class RemoveDuplicate {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head =new_node;
		
	}
	
	 static void removeDuplicateSorted() {
		Node current = head;
		while(current != null) {
			Node temp = current;
			while(temp != null && temp.data == current.data) {
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;
		}
	}
	 
	static void removedUnsorted() {
		HashSet<Integer> st = new HashSet<Integer>();
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			int tempData = temp.data;
			if(st.contains(tempData)) {
				prev.next = temp.next;
			}else {
				st.add(tempData);
				prev = temp;
			}
			temp = temp.next;
		}
		
	}
	public static void main(String[] args) {
		RemoveDuplicate RD = new RemoveDuplicate();
		
		RD.insert(10);
		RD.insert(8);
		RD.insert(7);
		RD.insert(6);
		RD.insert(6);
		RD.insert(4);
		RD.insert(4);
		RD.insert(4);
		RD.insert(2);
		System.out.println("List with duplicate values: ");
		RD.printList();
		System.out.println("List with duplicate removed values of sorted data: ");
		RemoveDuplicate.removeDuplicateSorted();
		RD.printList();
		RemoveDuplicate URD = new RemoveDuplicate();
		URD.insert(10);
		URD.insert(10);
		URD.insert(2);
		URD.insert(5);
		URD.insert(11);
		System.out.println("List with duplicate removed values of Unsorted data: ");
		RemoveDuplicate.removedUnsorted();
		URD.printList();

	}

}
