package com.codejam.q1.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] testArr = new int[4];
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int[] diceArr = new int[n];
			for(int j=0; j<n; j++) {
				diceArr[j] = sc.nextInt();
			}
			int caseValue  = calculateLength(diceArr, n);
			testArr[i] = caseValue;
		}
		
		for(int k=0;k<t; k++) {
			int caseData = k+1;
			System.out.println("Case #"+caseData+": "+testArr[k]);
		}
		

	}

	private static int calculateLength(int[] diceArr, int n) {
		int count = 0;
		Arrays.sort(diceArr);
		for(int i=0; i<n; i++) {
			if(count < diceArr[i]) {
				count = count+1;
			}
		}
		return count;
	}

}
