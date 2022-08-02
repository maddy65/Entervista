package Reltio;

public class DiagonalMatrix {

	public static void main(String[] args) {
		    int grid[][] = { 
		    			  { 2, 0, 0, 1 },
	                      { 0, 3, 1, 0 },
	                      { 0, 5, 2, 0 },
	                      { 4, 0, 0, 2 }
	                      };
		    
		    System.out.println(checkXMatrix(grid));

	}
	
	public static boolean checkXMatrix(int[][] grid) {
		int len = grid.length;
		boolean secondDiag = checkSecond (len, grid);
		boolean firstDiag = chechFirst(len, grid);
		boolean center = checkCenter(len, grid);
		if( secondDiag == true ) {
			return true;
		}
        return false;
    }

	public static boolean checkCenter(int len, int[][] grid) {
		boolean flg = false;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i + j < len - 1) {
					if (i < j && i != j && i + j > 0){
						if(grid[i][j] == 0){
							flg = true;
						}else {
							flg = false;
							return flg;
						}
					}else if (i != j){
						if(grid[i][j] == 0){
							flg = true;
						}else {
							flg = false;
							return flg;
						}
					}
				}
				else {
					if (i > j && i + j != len - 1){
						if(grid[i][j] == 0){
							flg = false;
						}else {
							flg = false;
							return flg;
						}
					}else {
						if (i + j != len - 1 && i != j){
							if(grid[i][j] == 0){
								flg = false;
							}else {
								flg = false;
								return flg;
							}
						}
							
					}
				}
			}
		}
		return flg;
	}

	public static boolean checkSecond(int len, int[][] grid) {
		boolean flg = true;
		for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
            	if (i == j) {
                    if(grid[i][j] == 0) {
            			flg = false;
            			return flg;
            		}
                }else if((i + j) == (len - 1)) {
                	if(grid[i][j] == 0) {
            			flg = false;
            			return flg;
            		}
                }else {
                	if(grid[i][j] != 0) {
            			flg = false;
            			return flg;
            		}
                }
            }
        }
		return flg;
	}

	public static boolean chechFirst(int len, int[][] grid) {
		boolean flg = true;
		 for (int i = 0; i < len; i++) {
	            for (int j = 0; j < len; j++) {
	            	if ((i + j) == (len - 1)) {
	            		if(grid[i][j] == 0) {
	            			flg = false;
	            			return flg;
	            		}
	                }
	            }
	        }
		return flg;
	}

}
