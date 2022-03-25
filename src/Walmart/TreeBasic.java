package Walmart;



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
	
	public static void main(String args[]) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		
		
		int maxVal = findMax (root);
	}

	private static int findMax(Node root2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
