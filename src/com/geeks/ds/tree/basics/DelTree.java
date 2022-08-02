package com.geeks.ds.tree.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DelTree {

	public static void main(String[] args) {
		String str = "loveleetcode";
		System.out.println(findUnique (str));

	}

	private static int findUnique(String str) {
		
		if(str.length() == 0) {
			return 0;
		}
		
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(str.lastIndexOf(ch));
			if(i== str.lastIndexOf(ch) && i== str.indexOf(ch)) {
                return i;
        	}
		}
		
		
		return -1;
	}

}
