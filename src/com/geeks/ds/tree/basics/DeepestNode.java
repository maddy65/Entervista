package com.geeks.ds.tree.basics;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {
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
	static void inorder(Node temp) {
		if(temp == null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	static void findDeepest(Node root) {
		Queue<Node> QT = new LinkedList<Node>();
		if(root == null) {
			return;
		}
		QT.add(root);
		Node temp = root;
		while(!QT.isEmpty()) {
			 temp = QT.poll();
			 if(temp.left != null) {
				 temp = temp.left;
			 }
			 if(temp.right != null) {
				 temp = temp.right;
			 }
		}
		System.out.println("Data: "+temp.data);
	}

	public static void main(String[] args) {
		DeepestNode tree = new DeepestNode();
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		
		
		
		System.out.println("Inorder traversal before insertion: ");
		inorder(root);
		findDeepest(root);
	}

}
