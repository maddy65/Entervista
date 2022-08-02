package Reltio;

import java.util.Arrays;

public class EqualPair {

	public static void main(String[] args) {
		int[][] matrix = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
		equalPairs(matrix);
	}
	
	public static int equalPairs(int[][] grid) {
		int rows = grid.length;
		int count = 0;
		for(int i=0; i<rows; i++) {
			int col =  grid[i].length;  
			int [] temp = new int[rows];
			for(int j=0; j<col; j++) {
				temp[j] = grid[i][j];
			}
			int res = equalColPairs(grid,temp);
			count = count +res;
		}
		//System.out.println(count);
        return count;
    }
	
	public static int equalColPairs(int[][] grid, int[] temp) {
		int rows = grid.length;
		int resCount = 0;
		for(int i=0; i<rows; i++) {
			int [] tempCol = new int[rows];
			int col =  grid[i].length;  
			for(int j=0; j<col; j++) {
				tempCol[j] = grid[j][i];
			}
			if(Arrays.equals(temp, tempCol)) {
				resCount = resCount+1;
			}
		}
        return resCount;
    }
}
