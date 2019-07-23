package com.geeks.ds.LinkedList.Single;

public class IntersectionPoint {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void PrintList(Node current) {
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println(" ");
	}
	
	public void insert (int new_data) {
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
	static int getNode(Node first, Node second) {
		int count1 = getCount(first);
		int count2 = getCount(second);
		int difference;
		if(count1 > count2) {
			difference = count1-count2;
			return getIntersectionNode(difference, first, second);
		}else {
			difference = count2 - count1;
			return getIntersectionNode(difference, second, first);
		}
	}
	static int getIntersectionNode(int diff, Node first, Node second) {
		Node current = first;
		Node last = second;
		for(int i=0; i<diff; i++) {
			if(current == null) {
				return -1;
			}
			current = current.next;
		}
		while(current != null && last != null) {
			if(current.data == last.data) {
				return current.data;
			}
			current = current.next;
			last = last.next;
		}
		return -1;
	}
	static int getCount(Node current) {
		Node temp = current;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		IntersectionPoint list1 = new IntersectionPoint();
		IntersectionPoint list2 = new IntersectionPoint();
		list1.insert(3);
		list1.insert(6);
		list1.insert(15);
		list1.insert(15);
		list1.insert(30);
		IntersectionPoint.PrintList(list1.head);
		list2.insert(10);
		list2.insert(15);
		list2.insert(30);
		IntersectionPoint.PrintList(list2.head);
		System.out.println("Intesection point of list1 and list2 is: "+IntersectionPoint.getNode(list1.head,list2.head));
	}

}
