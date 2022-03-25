package com.leetcode.ds.practice;

public class reshape {
	
	public static void main(String args[]) {
		int[][] a = {{1,2},{3,4}};
		
		int[][] newAyy = matrixReshape(a,2,4);
		
		for(int i=0; i<newAyy.length; i++) {
			System.out.println(" ");
			for(int j=0; j<newAyy[i].length; j++) {
				System.out.print(newAyy[i][j] + " ");
			}
		}
	}
	
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int rowCount = mat.length;
		int colCount = mat[0].length;
		
		
		
		if(r *c != rowCount *  colCount) {
			
			return mat;
			
		}else {
			System.out.println("Divisible");
			int[][] newMat = new int[r][c];
			int row = 0, col = 0; 
			
			for(int i=0; i< mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					newMat[row][col] = mat[i][j];
					if(++col >= c ) {
						col = 0;
						row ++;
					}
				}
			}
			return newMat;
		}
		
		
	
        
    }
}
