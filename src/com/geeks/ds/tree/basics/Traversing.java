package com.geeks.ds.tree.basics;

public class Traversing {
	static class Node{
		int key;
		Node left,right;
		
		public Node(int item) {
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	Traversing(){
		root= null;
	}
	void printPreorder(Node temp) {
		if(temp == null) {
			return;
		}
		System.out.print(temp.key+" ");
		printPreorder(temp.left);
		printPreorder(temp.right);
	}
	void printInorder(Node temp) {
		if(temp == null) {
			return;
		}
		printInorder(temp.left);
		System.out.print(temp.key+" ");
		printInorder(temp.right);
	}
	void printPostorder(Node temp) {
		if(temp == null) {
			return;
		}
		printPostorder(temp.left);
		printPostorder(temp.right);
		System.out.print(temp.key+" ");
	}
	void printPreorder() {
		printPreorder(root);
	}
	void printInorder() {
		printInorder(root);
	}
	void printPostorder() {
		printPostorder(root);
	}
	public static void main(String[] args) {
		Traversing trav = new Traversing();
		trav.root = new Node(1);
		trav.root.left = new Node(2);
		trav.root.right = new Node(3);
		trav.root.left.left = new Node(4);
		trav.root.left.right = new Node(5);
		
		System.out.println("Preorder traversal of binary tree is "); 
        trav.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        trav.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        trav.printPostorder(); 
		

	}

}
