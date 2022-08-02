package Reltio;

import java.util.HashMap;
import java.util.Map;

public class ZeroSubARr {

	public static void main(String[] args) {
		int[] rank = new  int[]{0,0,0,2,0,0}; 
		zeroFilledSubarray(rank);

	}
	
	public static long zeroFilledSubarray(int[] nums) {
		
		int count = 0;
		int MapKey = 2;
		int result = 0;
		//Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == 0) {
				count = count+1;
				int repeatCount = 0;
				//boolean flg = true;
				for(int j =i+1; j<nums.length; j++) {
					if(nums[j] == 0) {
						repeatCount = repeatCount+1;
					}else {
						break;
					}
				}
				if(repeatCount > 0) {
					result = result + repeatCount;
					//mp.put(MapKey, repeatCount);
					//MapKey = MapKey+1;
				}
			}
		}
		//mp.put(1, count);
		//int result = 0;
		//for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
			//result = result + entry.getValue();
		//}
		System.out.println(result + count);
        return result;
    }

}
