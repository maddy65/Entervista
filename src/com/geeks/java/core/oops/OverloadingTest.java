package com.geeks.java.core.oops;

public class OverloadingTest {

	public static void main(String[] args) {
		ObjectOverloading Test1 = new ObjectOverloading(100,22);
		ObjectOverloading Test2 = new ObjectOverloading(100,22);
		ObjectOverloading Test3 = new ObjectOverloading(-1,-1);
		
		System.out.println("Test1 == Test2:  "+Test1.equalTo(Test2));
		System.out.println("Test1 == Test2:  "+Test1.equalTo(Test3));
	}

}
