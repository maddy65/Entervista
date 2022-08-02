package com.leetcode.ds.practice;

public class MaxCandies {
	public static void main(String[] args){
		int arr[] = { 1, 0, 2 };
		int N = arr.length;
		
		int arr2[] = { 5,8,6 };
		System.out.println(countCandies(arr2, 3));
	}

	static int countCandies(int arr[], int n)
	{
		int sum = 0;
		int[] ans = new int[n];
		
		if (n == 1)
		{
			return 1;
		}
		
		for(int i = 0; i < n; i++)
			ans[i] = 1;
		
		for(int i = 0; i < n - 1; i++)
		{
				if (arr[i + 1] > arr[i] &&
				ans[i + 1] <= ans[i])
			{
				ans[i + 1] = ans[i] + 1;
			}
		}
		
		for(int i = n - 2; i >= 0; i--)
		{
		
			if (arr[i] > arr[i + 1] &&
				ans[i] <= ans[i + 1])
			{
			
				ans[i] = ans[i + 1] + 1;
			}
			
			else if (arr[i] == arr[i + 1] &&
					ans[i] < ans[i + 1])
			{
			
				ans[i] = ans[i + 1] + 1;
			}
			
			// Increment the sum by ans[i]
			sum += ans[i];
		}
		
		sum += ans[n - 1];
		return sum;
	}
}
