package com.geeks.ds.tree.traversing;

import java.util.Stack;

public class InorderWRec {
	
	static class Node{
		int key;
		Node left,right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	
	Node root;

	void printInorder() {
		if(root == null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		Node curr = root;
		while(curr != null || st.size() >0) {
			while(curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.print(curr.key+" ");
			curr = curr.right;
		}
	}
	public static void main(String[] args) {
		InorderWRec tree = new InorderWRec();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.printInorder();
	}

}
