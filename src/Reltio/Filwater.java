package Reltio;

public class Filwater {

	public static void main(String[] args) {
		int[] disp = new  int[]{5,4,4}; 
		fillCups(disp);

	}
	
	public static int fillCups(int[] disp) {
	    int count = 0;
	    
	    int cold = disp[0];
	    int warm = disp[1];
	    int hotWater = disp[2];
	    
	    int length = Integer.MAX_VALUE;
	    
	    if(warm == hotWater && hotWater != 0) {
	    	count = (cold+warm+hotWater)/2;
	    	
	    	count = count +1;
	    	
	    }else {
	    	
	    	for(int i=0; i<length; i++) {
	    		if(cold != 0 || warm !=0 || hotWater != 0) {
	    			if(cold != 0) {
	    				cold = cold-1;
	    				if(warm != 0) {
	    					warm = warm-1;
	    				}else {
	    					if(hotWater !=0 ) {
	    						hotWater = hotWater -1;
	    					}
	    					
	    				}
	    			}else {
	    				if(warm != 0) {
	    					warm = warm-1;
	    					if(hotWater != 0) {
	    						hotWater = hotWater -1;
	    					}
	    				}else {
	    					hotWater = hotWater -1;
	    				}
	    			}
	    			
	    			count = count+1;
	    		}else {
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.println(count);
	    return count;
	 }

}
