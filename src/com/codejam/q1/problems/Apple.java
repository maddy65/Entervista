package com.codejam.q1.problems;

import java.util.HashSet;

public class Apple {

	public static void main(String[] args) {
		String str = "abbca";
		System.out.println(countTotalDistinct(str));

	}
	
	public static long countTotalDistinct(String str)	{
		long cnt = 0;

		HashSet<String> items = new HashSet<>();

		for (int i = 0; i < str.length(); ++i)		{

			String temp = "";
			HashSet<Character> ans = new HashSet<>();
			for (int j = i; j < str.length(); ++j){
				temp = temp + str.charAt(j);
				ans.add(str.charAt(j));
				if (!items.contains(temp)){
					items.add(temp);
					cnt += ans.size();
				}
			}
		}

		return cnt;
	}

}
