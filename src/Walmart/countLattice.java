package Walmart;

public class countLattice {

	public static void main(String[] args) {
		 int r = 6;
		 System.out.println(count(r));
	}
	
	static int count(int r){
	    if (r <= 0)
	        return 0;
	    int result = 4;
	  
	    for (int x=1; x<r; x++)
	    {
	        int ySquare = r*r - x*x;
	        int y = (int)Math.sqrt(ySquare);
	        if (y*y == ySquare)
	            result += 4;
	    }
	  
	    return result;
	}

}
