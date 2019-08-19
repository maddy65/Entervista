package com.geeks.ds.tree.basics;

import java.util.Stack;

public class ExpressionTree {

	class Node{
		char value;
		Node left, right;
		
		Node(char item){
			value = item;
			left = right = null;
		}
	}
	
	Node constructTree(char postfix[]) {
		Stack<Node> st = new Stack();
		Node t, t1, t2;
		for(int i=0; i< postfix.length; i++) {
			if(!isOperator(postfix[i])) {
				t = new Node(postfix[i]);
				st.push(t);
			}else {
				t = new Node(postfix[i]);
				
				t1 = st.pop();
				t2 = st.pop();
				
				t.right = t1;
				t.left = t2;
				st.push(t);
			}
		}
		t = st.peek();
		st.pop();
		return t;
	}
	
	private boolean isOperator(char c) {
		if(c =='+' || c == '-' || c == '*' || c == '/' || c =='^') {
			return true;
		}
		return false;
	}

	void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.value +" ");
			inorder(root.right);
		}
	}
	public static void main(String[] args) {
		ExpressionTree et = new ExpressionTree();
		String postfix = "ab+ef*g*-";
		char [] charArray = postfix.toCharArray();
		Node root = et.constructTree(charArray);
		System.out.println("Infix expression is: ");
		et.inorder(root);
	}

}
