package com.geeks.ds.tree.bst;

class Index{
	int index = 0;
}

public class BSTPreOrder {
	Index index = new Index();
	class Node{
		int data;
		Node left, right;
		
		Node(int d){
			d = data;
			left = right = null;
		}
	}
	
	Node constructTree(int arr[], int length) {
		int preIndex = 0;
		return constructUtil(arr, index, preIndex, Integer.MIN_VALUE, Integer.MAX_VALUE, length);
	}
	
	private Node constructUtil(int[] arr, Index index2, int i, int minValue, int maxValue, int length) {
		if(index2.index >= length) {
			return null;
		}
		Node root = null;
		if(i > minValue && i < maxValue) {
			root = new Node(i);
			index2.index = index2.index + 1; 

			if (index2.index < length) { 

				root.left = constructUtil(arr, index2, 
							arr[index2.index], minValue, i, length); 
				root.right = constructUtil(arr, index2, 
							arr[index2.index], i, maxValue, length); 
			} 
		}
		return root;
	}

	void printInorder(Node node) {
		if(node == null) {
			return;
		}
		printInorder(node.left);
		System.out.print(node.data +" ");
		printInorder(node.right);
	}

	public static void main(String[] args) {
		
		BSTPreOrder BST = new BSTPreOrder();
		int myArr[] = new int[] {10,5,1,7,40,50};
		int size = myArr.length;
		Node root = BST.constructTree(myArr, size); 
		System.out.println("Inorder traversal of the constructed tree is "); 
        BST.printInorder(root); 
	}

}
