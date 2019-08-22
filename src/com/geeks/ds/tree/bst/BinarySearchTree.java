package com.geeks.ds.tree.bst;

public class BinarySearchTree {
	
	Node root;
	class Node{
		int key;
		Node left, right;
		
		Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	BinarySearchTree(){
		root = null;
	}
	
	void insert(int key) {
		root = insertRec(root, key);
	}
	
	Node insertRec(Node root, int key){
		if(root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}else {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	void inorder() {
		inOrderRec(root);
	}
	
	void inOrderRec(Node root){
		if(root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
		
		BST.insert(50);
		BST.insert(30);
		BST.insert(20);
		BST.insert(40);
		BST.insert(70);
		BST.insert(60);
		BST.insert(80);
		
		BST.inorder();
	}

}
