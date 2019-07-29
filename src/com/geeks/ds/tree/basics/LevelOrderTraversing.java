package com.geeks.ds.tree.basics;

public class LevelOrderTraversing {
	
	static class Node{
		int data;
		Node left,right;
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
	}
	Node root; 
	
	void printLevelOrder() {
		int height = height(root);
		for(int i=0; i<=height; i++) {
			printGivenLevel(root,i);
		}
	}
	
	int height(Node root) {
		if(root == null) {
			return 0;
		}else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			if(leftHeight > rightHeight) {
				return (leftHeight+1);
			}else {
				return (rightHeight+1);
			}
		}
	}
	void printGivenLevel(Node root, int level) {
		if(root == null) {
			return;
		}
		if(level == 1) {
			System.out.print(root.data+" ");
		}else if(level > 1 ) {
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
	}
	public static void main(String[] args) {
		LevelOrderTraversing tree = new LevelOrderTraversing(); 
        tree.root= new Node(1); 
        tree.root.left= new Node(2); 
        tree.root.right= new Node(3); 
        tree.root.left.left= new Node(4); 
        tree.root.left.right= new Node(5); 
         
        System.out.println("Level order traversal of binary tree is "); 
        tree.printLevelOrder(); 

	}

}
