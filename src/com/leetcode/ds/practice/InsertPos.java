package com.leetcode.ds.practice;

public class InsertPos {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data =d;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertPos llist = new InsertPos();
		InsertPos llisttwo = new InsertPos();
		llist.head  = new Node(2);
		Node second = new Node(4);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		llisttwo.head  = new Node(5);
		Node secondtwo = new Node(6);
		Node thirdtwo = new Node(4);
		
		llisttwo.head.next = secondtwo;
		secondtwo.next = thirdtwo;
		llist.printList();
		llisttwo.printList();
		
	}
	
	
	
}
