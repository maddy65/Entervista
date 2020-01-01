package com.geeks.ds.topten.algos;

public class ReverseStringSpecial {

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArr = str.toCharArray();
		
		System.out.println("Input String: "+str);
		reverse(charArr);
		String revStr = new String(charArr);
		System.out.println("Output String: "+revStr);
	}
	
	public static void reverse(char str[]) {
		int len = str.length-1, l=0;
		while(l<len) {
			if(!Character.isAlphabetic(str[l]))
				l++;
			else if(!Character.isAlphabetic(str[len]))
				len--;
			else {
				char temp = str[l];
					str[l] = str[len];
					str[len] = temp;
					l++;
					len--;
			}
		}
	}

}
