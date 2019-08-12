package com.geeks.ds.LinkedList.Circular;

public class CountNodes {
	
	static class Node{
		int data;
		Node next;
	}
	
	static Node push(Node head, int data) {
		Node current = new Node();
		Node temp = head;
		current.data = data;
		current.next = head;
		if(head != null) {
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next = current;
		}else {
			current.next = current;
		}
		head = current;
		return head;
	}
	
	static int countNodes( Node head)  
	{  
	    Node temp = head;  
	    int result = 0;  
	    if (head != null) 
	    {  
	        do 
	        {  
	            temp = temp.next;  
	            result++;  
	        } while (temp != head);  
	    }  
	  
	    return result;  
	}

	public static void main(String[] args) {
		Node head = null;
		head = push(head,12);
		head = push(head, 56);  
		head = push(head, 2);  
		head = push(head, 11);  
		  
		    System.out.print(countNodes(head));
	}

}
