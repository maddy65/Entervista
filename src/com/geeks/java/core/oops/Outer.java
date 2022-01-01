package com.geeks.java.core.oops;

public class Outer {
	
	int outer_x = 10;
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner {
		int inner_x = 10;
		void display() {
			System.out.println("display: "+outer_x );
		}
	}
	
	/*void show() {
		System.out.println(inner_x);
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ot = new Outer();
		ot.test();
	}

}
