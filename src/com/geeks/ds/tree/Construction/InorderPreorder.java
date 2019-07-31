package com.geeks.ds.tree.Construction;

public class InorderPreorder {
	
	class Node{
		char data;
		Node left,right;
		
		Node(char item){
			data = item;
			left = right = null;
		}
	}
	
	static int preIndex = 0;
	
	Node buildTree(char inorder[], char preorder[], int inStrt, int inEnd) {
		if(inEnd < inStrt) {
			return null;
		}
		
		Node temp = new Node(preorder[preIndex++]);
		if(inorder.length == 0) {
			return temp;
		}
		int inOrderIndex = search(inorder, temp.data);
		temp.left = buildTree(inorder, preorder, inStrt, inOrderIndex - 1);
		temp.right = buildTree(inorder, preorder, inOrderIndex + 1, inEnd);
		return temp;
	}
	
	int search(char array[], int value) {
		int i;
		for(i=0; i<= array.length -1; i++ ) {
			if(array[i] == value) {
				return i;
			}
		}
		return i;
	}
	
	void printInorder(Node node){ 
		if (node == null) 
			return; 
		printInorder(node.left); 
		System.out.print(node.data + " "); 
		printInorder(node.right); 
	} 

	public static void main(String[] args) {
		InorderPreorder tree = new InorderPreorder();
		char inorder[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C'};
		char preorder[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
		Node root = tree.buildTree(inorder,preorder, 0, inorder.length-1);
		System.out.println("Inorder traversal of constructed tree is : "); 
		tree.printInorder(root); 

	}

}
