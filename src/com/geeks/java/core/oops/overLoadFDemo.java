package com.geeks.java.core.oops;

public class overLoadFDemo {
	void test() {
		System.out.println("No Parameters");
	}
	
	void test (int a) {
		System.out.println("int: "+a);
	}
	
	
	
	void test(int a, int b) {
		System.out.println("a: "+a+ "b: "+b);
	}
	
	double test(double a) {
		System.out.println("double a: "+a);
		return a*a;
	}
	
}
