package com.geeks.ds.tree.traversing;

import java.util.Arrays;

public class PrintPostInPre {

	public static void main(String[] args) {
		int inOrder[] = {4,2,5,1,3,6};
		int preOrder[] = {1,2,4,5,3,6};
		int size = inOrder.length;
		printPostOrder(inOrder,preOrder,size);
	}

	private static void printPostOrder(int[] inOrder, int[] preOrder, int size) {
	
		int root = search(inOrder,preOrder[0],size);
		if(root != 0) {
			printPostOrder(inOrder, Arrays.copyOfRange(preOrder, 1, size), root);
		}
		if( root != size-1) {
			printPostOrder(Arrays.copyOfRange(inOrder, root+1, size), 
		            Arrays.copyOfRange(preOrder, 1+root, size), size - root - 1); 
		}
		System.out.print(preOrder[0]+" ");
	}

	private static int search(int[] inOrder, int root, int size) {
		for(int i=0; i<inOrder.length; i++) {
			if(inOrder[i] == root) {
				return i;
			}
		}
		return -1;
	}

}
