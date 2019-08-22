package com.geeks.ds.tree.bst;

public class BinarySearchTreeDelete {
	
	Node root;
	
	class Node{
		int key;
		Node left,right;
		
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	
	BinarySearchTreeDelete(){
		root = null;
	}

	void insert(int data) {
		root = insertRec(root, data);
	}
	
	Node insertRec(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		if(data < root.key) {
			root.left = insertRec(root.left, data);
		}else {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	void inorder() {
		inorderRec(root);
	}
	
	void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}
	
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	Node deleteRec(Node root, int key) {
		if(root == null) {
			return root;
		}
		if(key < root.key) {
			root.left = deleteRec(root.left, key);
		}else if(key > root.key) {
			root.right = deleteRec(root.right, key);
		}else {
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.key = minValue(root.right);
			root.right = deleteRec(root.right, root.key); 
		}
		return root;
	}
	
	int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 
	public static void main(String[] args) {
		BinarySearchTreeDelete BST = new BinarySearchTreeDelete();
		BST.insert(50);
		BST.insert(30);
		BST.insert(20);
		BST.insert(40);
		BST.insert(70);
		BST.insert(60);
		BST.insert(80);
		
		BST.inorder();
		System.out.println("After Delete 20");
		BST.deleteKey(20);
		BST.inorder();
		
	}

}
