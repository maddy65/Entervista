package Walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionMUltipleArrays {

	public static void main(String[] args) {
		int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		List<Integer> result = intersection(nums);

	}
	
	public static List<Integer> intersection(int[][] nums) {
		
		int col = nums[0].length;
	    int row  = nums.length;
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				lists.add(nums[i]);
			}
		}
		
		List<Integer> finalList = lists.get(0);
	    for (int i=1; i<lists.size(); i++) {
	        finalList=intersection(finalList,lists.get(i));
	    }
	    System.out.println("firstList"+finalList);
	    return finalList;
		
        
    }
	
	public static <T> List<T> intersection(List<T> list1, List<T> list2) {
	    list1.retainAll(list2);
	    return list1;
	}

}
