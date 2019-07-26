package com.geeks.ds.tree.basics;

import java.util.LinkedList;
import java.util.Queue;



public class FindMaximum {
	
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
	
	static int findMaxInRecursion(Node root) {
		int rootValue, left, right, max = Integer.MIN_VALUE;
		if(root != null) {
			rootValue = root.data;
			left = findMaxInRecursion(root.left);
			right = findMaxInRecursion(root.right);
			if(left < right) {
				max = right;
			}else {
				max = left;
			}
			if(rootValue > max) {
				max = root.data;
			}
		}
		return max;
	}
	static int findMaxWRecurssion(Node root) {
		Queue<Node> qr = new LinkedList<Node>();
		qr.add(root);
		int max = Integer.MIN_VALUE;
		Node last;
		while (!qr.isEmpty()) {
			last  =qr.remove();
			if(max < last.data) {
				max = last.data;
			}
			if(last.left != null) {
				qr.add(last.left);
			}
			if(last.right != null) {
				qr.add(last.right);
			}
		}
		qr.peek();
		return max;
	}

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		
		System.out.println("Inorder traversal before insertion: ");
		inorder(root);
		System.out.println("");
		System.out.println("Find maximum Element: "+findMaxInRecursion(root));
		System.out.println("Find maxium element without using recursion" +findMaxWRecurssion(root));
		
	}

}
