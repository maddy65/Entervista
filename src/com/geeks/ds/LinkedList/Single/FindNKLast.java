package com.geeks.ds.LinkedList.Single;

public class FindNKLast {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	void printNthFromLast(int key) {
		int length = 0;
		Node temp = head;
		while (temp != null) { 
            temp = temp.next; 
            length++; 
        } 
		temp = head;
		for (int i = 1; i < length - key + 1; i++) 
            temp = temp.next; 
  
        System.out.println(temp.data); 
		System.out.println("Text");
		
	}
	
	

	public static void main(String[] args) {
		FindNKLast llist = new FindNKLast(); 
        llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(35); 
        
        llist.printNthFromLast(2); 

	}

}
