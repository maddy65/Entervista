package com.geeks.java.core.oops;

public class IncreadeByTen {
	
	int a;
	
	IncreadeByTen(int i){
		a = i;
	}
	
	IncreadeByTen incr() {
		IncreadeByTen temp = new IncreadeByTen(a+10);
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreadeByTen ob1 = new IncreadeByTen(10);
		IncreadeByTen ob2;
		
		ob2 = ob1.incr();
		System.out.println("ob1.a : "+ ob1.a);
		System.out.println("ob2.a : "+ob2.a);
		ob2 = ob2.incr();
		System.out.println("After changing ob2: ");
		System.out.println(ob2.a);

	}

}
