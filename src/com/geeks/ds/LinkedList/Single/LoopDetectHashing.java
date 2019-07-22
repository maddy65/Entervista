package com.geeks.ds.LinkedList.Single;

import java.util.HashSet;


public class LoopDetectHashing {
	
	static Node head;
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
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(" ");
	}
	
	static boolean detectLoop(Node head) {
		Node temp = head;
		HashSet<Node> st = new HashSet<Node>();
		while(temp != null) {
			if(st.contains(head)) {
				return true;
			}
			st.add(head);
			head = head.next;
		}
		return false;
	}
	public static void main(String[] args) {
		LoopDetectHashing Lhs = new LoopDetectHashing();
		Lhs.insert(20);
		Lhs.insert(4);
		Lhs.insert(15);
		Lhs.insert(10);
		Lhs.printList();
		
		/*Create loop for testing */
        LoopDetectHashing.head.next.next.next.next = LoopDetectHashing.head; 
        
       if(LoopDetectHashing.detectLoop(head)) {
    	   System.out.println("Loop Found");
       }else {
    	   System.out.println("Loop Not Found");
       }
	}

}
