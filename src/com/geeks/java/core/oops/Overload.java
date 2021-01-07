package com.geeks.java.core.oops;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overLoadFDemo ob = new overLoadFDemo();
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		double result = ob.test(123.22);
		System.out.println(result);

	}

}
