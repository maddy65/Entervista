package Walmart;

import java.util.ArrayList;
import java.util.List;

public class Lettercombination {

	public static void main(String[] args) {
		String digit = "23";
		lettercomb(digit);
	}
	
	public static List<String> lettercomb(String digits){
		if(digits.isEmpty()) {
			return new ArrayList<>();
		}
		
		String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> result = new ArrayList<>();
		helper(digits.toCharArray(),0,map, result);
		return result;
		
	}

	private static void helper(char[] charArray, int index, String[] map, List<String> result) {
		if(index == charArray.length) {
			result.add(String.valueOf(charArray));
			return;
		}
		char current = charArray[index];
		for(char i : map[current - '0'].toCharArray()) {
			charArray[index] = i;
			helper(charArray, index+1, map, result);
			charArray[index] = current;
		}
		
	}

}
