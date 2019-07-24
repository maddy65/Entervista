package com.geeks.ds.LinkedList.Double;

public class Quicksort {

	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	public void addData(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}
	public void quicksort() {
		Node current = head;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		quicksortRecur(current, last);
	}
	public void quicksortRecur(Node current, Node last){
		if(last	!= null && current != last && current == last.next) {
			Node temp = partition(current, last);
			quicksortRecur(current, temp.prev);
			quicksortRecur(temp.prev, last);
		}
	}
	public Node partition(Node current, Node last) {
		int value = last.data;
		Node temp = current.prev;
		for(Node j=current; j!=last; j=j.next ) {
			if(j.data <= value) {
				temp = (temp==null) ? current : temp.next;
				int val = temp.data;
				temp.data = j.data;
				j.data = val;
			}
		}
		temp = (temp==null) ? current : temp.next;
		int val = temp.data;
		temp.data = last.data;
		last.data = val;
		return temp;
		
	}
	public static void main(String[] args) {
		Quicksort qsrt = new Quicksort();
			qsrt.addData(34);
			qsrt.addData(43);
			qsrt.addData(13);
			qsrt.addData(9);
			qsrt.addData(84);
			qsrt.printList();
			System.out.println("Elements after quick sort");
			qsrt.quicksort();
			qsrt.printList();
	}

}
