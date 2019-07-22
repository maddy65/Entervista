package com.geeks.ds.LinkedList.Single;

import java.util.Stack;

public class CheckPalindrome {
	
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
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
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
	
	public void palindrom() {
		Node temp = head;
		boolean isPalin = false;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		while(head != null) {
			int value = stack.pop();
			if(head.data == value) {
				isPalin = true;
			}else {
				isPalin = false;
				break;
			}
			head = head.next;
		}
		if(isPalin) {
			System.out.println("List is palindrom. ");
		}else {
			System.out.println("List is not Palindrom.");
		}
	}
	public static void main(String[] args) {
		CheckPalindrome CP = new CheckPalindrome();
		CP.insert(1);
		CP.insert(2);
		CP.insert(3);
		CP.insert(2);
		CP.insert(1);
		CP.printList();
		CP.palindrom();
	}

}
