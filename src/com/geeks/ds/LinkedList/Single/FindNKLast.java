package com.geeks.ds.LinkedList.Single;

public class FindNKLast {
	static Node head;
	
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
	
	

	private static int max = 0, count = 0;
	private static Node top;
	public static void main(String[] args) {
		FindNKLast llist = new FindNKLast(); 
        llist.push(3); 
        llist.push(3); 
        llist.push(3); 
        llist.push(3); 
        
        System.out.println(maxPages(head));
        //llist.printNthFromLast(2); 

	}
	
	public static int maxPages(Node head){
		 /*int count = 0;
		 
		 Node temp = head;
		 int valuefirst = head.data;
		 while (temp.next.next != null) { 
            temp = temp.next; 
        }
		 int valuelast = temp.next.next.data;
		 temp.next = null;
		count = valuefirst + temp.data;
		head = head.next;
		if(count > maxPages(head)) {
			return count;
		}*/
		
		 top = head;
		    return calculateMax(head);
		
		
		
		
	}
	
	static int calculateMax(Node tail) {
		
	    if(tail.next==null)
	        max = max<top.data + tail.data ?top.data + tail.data: max;
	    else if(tail == top && count++ !=0){
	        max = max<top.data ?tail.data: max;
	    }
	    else if(top.next == tail && count++!=1)
	        max = max<top.data + tail.data ?top.data + tail.data: max;

	    else {
	    	calculateMax(tail.next);
	    }
	    top = top.next;
	    return max;
	}
	
	

}
