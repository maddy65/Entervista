package com.geeks.ds.stack.design;

public class TwoStackArray {
	
	int size;
	int top1;
	int top2;
	int array[];
	
	TwoStackArray(int val){
		array = new int[val];
		top1 = -1;
		top2 = size;
	}
	
	void push1(int data) {
		if(top1 < top2-1) {
			top1++;
			array[top1] = data;
		}else {
			System.out.println("Stack overflow");
			System.exit(1);
		}
	}
	
	void push(int data) {
		
	}
	
	
	public static void main(String[] args) {
		TwoStackArray ts = new TwoStackArray(5);

	}

}
