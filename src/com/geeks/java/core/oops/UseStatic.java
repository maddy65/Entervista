package com.geeks.java.core.oops;

public class UseStatic {
	
	static int a =3;
	static int b;
	
	static void meth (int x) {
		System.out.println("x = " +x);
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	
	static void callme() {
		System.out.println("a = " +a);
	}
	
	static {
		System.out.println("Static block initilized : ");
		b = a*4;
	}

	public static void main(String[] args) {
		meth(42);
		UseStatic.callme();
	}

}
