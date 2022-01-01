package com.geeks.java.core.oops;

public class InheritanceTest {

	public static void main(String[] args) {
		superClass Ob1 = new superClass();
		subClass Ob2 = new subClass();
		Ob1.i = 10;
		Ob1.j = 20;
		System.out.println("Super Class Object : ");
		Ob1.show();
		Ob2.i = 30;
		Ob2.j = 40;
		Ob2.k = 30;
		Ob2.show();
		//Ob2.x = 99;
		System.out.println("Sub Object");
		Ob2.showK();
		

	}

}
