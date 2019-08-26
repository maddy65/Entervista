package com.geeks.ds.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	
	static class Node{
		int data;
		int min,max;
	}
	
	static boolean levelorderIdOFBST(int arr[], int length) {
		if(length == 0) {
			return true;
		}
		
		Queue <Node> qt = new LinkedList<Node>();
		int i=0; 
		Node newNode = new Node();
		newNode.data = arr[i++];
		newNode.min = Integer.MIN_VALUE;
		newNode.max = Integer.MAX_VALUE;
		qt.add(newNode);
		
		while(i != length && qt.size() > 0) {
			Node temp = qt.peek();
			qt.remove();
			newNode = new Node();
			
			if(i<length && (arr[i] < (int) temp.data && arr[i] > (int) temp.min)) {
				newNode.data = arr[i++];
				newNode.min = temp.min;
				newNode.max = temp.data;
				qt.add(newNode);
			}
			newNode = new Node();
			if(i<length && (arr[i] > (int) temp.data && arr[i] < (int) temp.max )) {
				newNode.data = arr[i++];
				newNode.min = temp.data;
				newNode.max =temp.max;	
				qt.add(newNode);
			}
			
		}
		if(i == length) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {7,4,12,3,6,8,1,5,10};
		int length = arr.length;
		if(levelorderIdOFBST(arr,length)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
