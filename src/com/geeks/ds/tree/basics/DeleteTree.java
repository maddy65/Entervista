package com.geeks.ds.tree.basics;


public class DeleteTree {

	static class Node{
		int data;
		Node left,right;
		public Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}
	static Node root;
	DeleteTree(){
		root = null;
	}
	
	
	
	void inorder(Node root) {
		if( root != null) {
			
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	public Node insert(Node temp, int value) {
		 if(root == null) {
			 return root;
		 }
		 if (value < root.data) 
            root.left = insert(root.left, value); 
        else if (value > root.data) 
            root.right = insert(root.right, value);
		 
		 return root;
	}
	static void deleteKey(Node root, int key) {
		if(root == null)
			return;
		if(key < root.data) {
			deleteKey(root.left, key);
		}
		else if(key > root.data) {
			deleteKey(root.right,key);
		}else {
			if(root.left == null) {
				root =  root.right;
			}else if(root.right == null) {
				root=  root.left;
			}
			
			root.data = minValue(root.right); 
			deleteKey(root.right, root.data);
		}
		
				
	}
	static int minValue(Node root) 
    { 
        int minv = root.data; 
        while (root.left != null) 
        { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    }
	public static void main(String[] args) {
		DeleteTree tree = new DeleteTree();
		/*tree.insert(root,50); 
        tree.insert(root,30); 
        tree.insert(root,20); 
        tree.insert(root,40); 
        tree.insert(root,70); 
        tree.insert(root,60); 
        tree.insert(root,80);*/
		/*root = new Node(50);
		root.left = new Node(30);
		root.left.left = new Node(20);
		root.left.right = new Node(40);
		root.right = new Node(70);
		root.right.left = new Node(60);
		root.right.right = new Node(80);*/
		
		
		System.out.println("Inorder traversal before insertion: ");
		tree.inorder(root);
		 deleteKey(root, 50);
        System.out.println("\nInorder traversal after delete:"); 
        tree.inorder(root); 

	}

}
