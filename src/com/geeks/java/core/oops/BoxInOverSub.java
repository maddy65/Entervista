package com.geeks.java.core.oops;

public class BoxInOverSub extends BoxInOver{
	int k;
	BoxInOverSub(int a, int b, int c){
		super(a,b);
		k = c;
	}
	
	void show() {
		super.show();
		System.out.println(k);
	}
}
