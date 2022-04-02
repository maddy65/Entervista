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
		//Arrays.sort(diceArr);
		quickSort(diceArr,0,n-1);
		
		for(int i=0; i<n; i++) {
			if(count < diceArr[i]) {
				count = count+1;
			}
		}
		return count;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high){
			
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
		
	}
	
	static int partition(int[] arr, int low, int high){
		
		int pivot = arr[high];
		int i = (low - 1);

		for(int j = low; j <= high - 1; j++)
		{
			
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
