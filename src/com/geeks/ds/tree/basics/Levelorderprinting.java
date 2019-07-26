package com.geeks.ds.tree.basics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Levelorderprinting {
	
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;
	static void inorder(Node temp) {
		if(temp == null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	static void printLevel(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> qr = new LinkedList<Node>();
		Stack<Integer> st = new Stack<Integer>();
		qr.add(root);
		while(!qr.isEmpty()) {
			Node last = qr.poll();
			if(last.right != null) {
				qr.add(last.right);
			}
			if(last.left != null) {
				qr.add(last.left);
			}
			st.push(last.data);
		}
		
		while(!st.empty()) {
			System.out.print(st.pop()+" ");
		}
		
	}

	public static void main(String[] args) {
		
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Inorder traversal before insertion: ");
		inorder(root);
		System.out.println(" ");
		System.out.println("Pringing from bottom: ");
		printLevel(root);
	}

}
