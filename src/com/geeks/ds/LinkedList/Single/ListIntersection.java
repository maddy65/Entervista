package com.geeks.ds.LinkedList.Single;

public class ListIntersection {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static void printList(Node current) {
		while(current != null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
		System.out.println(" ");
	}
	
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		if(head == null) {
			head = new_node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
		return;
	}
	
	public static Node sortedIntersection(Node first, Node second) {
		Node head = null, tail = null;
		while(first != null && second != null) {
			if(first.data == second.data) {
				if(head == null) {
					tail = head = new Node(first.data);
				}else {
					tail = tail.next = new Node(first.data);
				}
				first = first.next;
				second = second.next;
			}
			else if(first.data < second.data) {
				first = first.next;
			}
			else {
				second = second.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		
		ListIntersection node1 = new ListIntersection();
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i<= array.length-1;i = i+3) {
			node1.insert(array[i]);
		}
		ListIntersection.printList(node1.head);
		
		ListIntersection node2 = new ListIntersection();
		for(int i = 1; i<= array.length-1; i = i+2) {
			node2.insert(array[i]);
		}
		ListIntersection.printList(node2.head);
		Node intersection = sortedIntersection(node1.head, node2.head);
		System.out.println("My List After intersection: ");
		ListIntersection.printList(intersection);
	}

}
