package com.geeks.java.core.oops;

public class BoxDemo {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		
		double vol;
		
		myBox1.width = 10;
		myBox2.width = 20;
		
		myBox1.height = 10;
		myBox2.height = 20;
		
		myBox1.depth = 10;
		myBox2.depth = 20;
		
		vol = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println(vol);
		
		/*vol = myBox2.width * myBox2.height * myBox2.depth;
		System.out.println(vol);*/
		
		Box B3 = myBox1;
		
		vol = B3.width * B3.height * B3.depth;
		System.out.println(vol);
		
		myBox1 = null;
		
		/*vol = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println(vol);*/
		
		vol = B3.width * B3.height * B3.depth;
		System.out.println(vol);
		

	}

}
