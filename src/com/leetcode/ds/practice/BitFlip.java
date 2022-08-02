package com.leetcode.ds.practice;

public class BitFlip {

	public static void main(String[] args) {
		int start = 10;
		int goal = 7;
		System.out.println(minBitFlips(start,goal));

	}
	
	public static int minBitFlips(int start, int goal) {
		
		return countSetBits(start ^ goal);
	}

	private static int countSetBits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n &=(n-1);
		}
		return count;
	}

}
