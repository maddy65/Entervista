package com.codejam.q1.problems;

import java.util.Scanner;

public class Twistty {

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
			int caseValue  = 1;//calculateLength(diceArr, n);
			int caseData = i+1;
			System.out.println("Case #"+caseData+": "+caseValue);
		}

	}

}
