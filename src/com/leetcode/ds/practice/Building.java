package com.leetcode.ds.practice;

public class Building {

	public static void main(String[] args) {
		String str = "001101";
		System.out.println(numberOfWays(str));

	}

	private static long numberOfWays(String str) {
		
		 char[] ch = new char[str.length()];
		int count = 0;
		int len = str.length();
		for (int i = 0; i < len-1; i++) {
			ch[i] = str.charAt(i);
			//ch[i+1] =  str.charAt(i+1);
			if(ch[i] != str.charAt(i+1)) {
				if(i+2 != len) {
					if(ch[i] == str.charAt(i+2)) {
						count = count+1;
					}
				}
			}
		}
		return count;
	}

}
