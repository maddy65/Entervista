package com.leet.practice;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 3;
		System.out.println(matrixSearch(matrix,target));
	}
	
	public static boolean  matrixSearch(int [][] matrix, int target) {
		boolean flg = false;
		int colLength = matrix.length;
		for(int i=0; i<colLength; i++) {
			int rowLength = matrix[i].length;
			if(matrix[i][0] <= target && matrix[i][rowLength-1] >= target) {
				for(int j=0; j<rowLength; j++) {
					if(matrix[i][j] == target) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
