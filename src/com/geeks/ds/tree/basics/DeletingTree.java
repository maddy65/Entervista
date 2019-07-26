package com.geeks.ds.tree.basics;

import com.geeks.ds.tree.basics.Levelorderprinting.Node;

public class DeletingTree {
	
	static Node root;
	static void inorder(Node temp) {
		if(temp == null) {
			return;
		}
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	static void deletingTree(Node root){
		root = null;
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
		deletingTree(root);
		root =  null;
		System.out.println("Inorder traversal after delete tree: ");
		inorder(root);
		
	}

}
