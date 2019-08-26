package com.geeks.ds.tree.bst;

import java.util.Stack;

public class BSTStack {
	
	class Node { 
		  
	    int data; 
	    Node left, right; 
	  
	    Node(int d) { 
	        data = d; 
	        left = right = null; 
	    } 
	} 
	
	Node constructTree(int arr[], int length) {
		Node root = new Node(arr[0]);
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		
		for(int i=1; i<length; i++) {
			Node temp = null;
			while(!st.isEmpty() && arr[i] > st.peek().data) {
				temp = st.pop();
			}
			if (temp != null) { 
                temp.right = new Node(arr[i]); 
                st.push(temp.right); 
            }  
             else { 
                temp = st.peek(); 
                temp.left = new Node(arr[i]); 
                st.push(temp.left); 
            } 
		}
		return root;
	}
	
	void printInorder(Node node) { 
        if (node == null) { 
            return; 
        } 
        printInorder(node.left); 
        System.out.print(node.data + " "); 
        printInorder(node.right); 
    } 

	public static void main(String[] args) {
		BSTStack bst = new BSTStack();
		int arr[] = new int[] {10,5,1,7,40,50};
		int length = arr.length;
		Node root = bst.constructTree(arr, length); 
        System.out.println("Inorder traversal of the constructed tree is "); 
        bst.printInorder(root); 
	}
}
 