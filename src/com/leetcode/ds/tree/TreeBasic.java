package com.leetcode.ds.tree;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class TreeBasic {

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
	public static void main(String[] args) {
		root = new Node(1);
		root.right = new Node(2);
		root.right.right = new Node(3);
		
		/*root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);*/
		/*System.out.print("Printing Preorder : ");
		printPreOrder(root);
		System.out.println("");
		System.out.print("Printing Inorder : ");
		printInOrder(root);
		System.out.println("");
		System.out.print("Printing PostOrder : ");
		printPostOrder(root);*/
		
		
		/*int value = findMaxElement (root);
		System.out.println(value);*/
		
		
		/*int key = 2;
		if(searchKey(root, key)) {
			System.out.println("key is present");
		}else {
			System.out.println("key is not present");
		}*/
		
		//System.out.println(sizeOfTree(root));
		printLevelOrder(root);
		
		
	}
	
	private static int sizeOfTree(Node root2) {
		if(root2 == null) {
			return 0;
		}else {
			return 1+ sizeOfTree(root2.left)+sizeOfTree(root2.right);
		}
		
	}

	private static boolean searchKey(Node root2, int key) {
		if(root2 == null) {
			return false;
		}
		
		Stack<Node> st = new Stack<Node>();
		st.push(root2);
		
		while(st.empty() == false) {
			Node node = st.peek();
			if(node.data == key) {
				return true;
			}
			st.pop();
			
			if(node.left != null) {
				st.push(node.left);
			}
			if(node.right != null) {
				st.push(node.right);
			}
		}
		
		return false;
		
		
	}

	private static int findMaxElement(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE; 
		}
		int maxVal = 0;
		
		int res = root.data;
		int left = findMaxElement(root.left);
		int right = findMaxElement(root.right);
		
		if(left > res) {
			res = left;
		}
		if(right > res) {
			res = right;
		}
		
		return res;
		
	}

	public static void printPreOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	public static void printInOrder(Node root) {
		if(root == null) {
			return;
		}
		printInOrder(root.left);
		System.out.print(root.data +" ");
		printInOrder(root.right);
	}
	
	public static void printPostOrder(Node root) {
		if(root == null) {
			return;
		}
		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void printLevelOrder(Node root) {
		if(root == null) {
			return;
		}
		
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		
		while(!qu.isEmpty()) {
			Node temp = qu.poll();
			System.out.println(temp.data);
			
			if(temp.left != null) {
				qu.add(temp.left);
			}
			if(temp.right != null) {
				qu.add(temp.right);
			}
			
		}
		
	}

}
