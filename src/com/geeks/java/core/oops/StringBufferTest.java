package com.geeks.java.core.oops;

import java.io.IOException;
import java.io.*;

public class StringBufferTest {

	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Last Name : ");
		String last = br.readLine();
		System.out.println("Enter Middle Name : ");
		String mid = br.readLine();
		System.out.println("Enter Name : ");
		String name = br.readLine();
		sb.append(last);
		sb.append(mid);
		sb.append(name);
		
		System.out.println("Name : "+sb);
		int length = sb.length();
		sb.insert(length, mid);
		System.out.println(sb);
	}

}
