package com.geeks.ds.tree.bst;

public class MinimumNodeValue {
	static Node head;
	class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left = right =null;
		}
	}
	
	Node insert (Node node, int data) {
		if(node == null) {
			return (new Node(data));
		}else {
			if(data <= node.data) {
				node.left = insert(node.left, data);
			}else {
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	int minvalue(Node node) {
		Node current = node;
		while(current.left != null) {
			current = current.left;
		}
		return (current.data);
	}
	public static void main(String[] args) {
		MinimumNodeValue bst = new MinimumNodeValue();
		Node root = null;
		root = bst.insert(root,4);
		bst.insert(root, 2);
		bst.insert(root, 1);
		bst.insert(root, 3);
		bst.insert(root, 6);
		bst.insert(root, 5);
		System.out.println("Minimum value of BST is : "+bst.minvalue(root));
	}
}
