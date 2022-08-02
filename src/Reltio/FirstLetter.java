package Reltio;

import java.util.HashMap;

public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdd";
		repeatedCharacter(str);
	}
	
	public static char repeatedCharacter(String str) {
		HashMap<Character, Integer> count = new HashMap<>();
		char res = 0;
		for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i))) {
            	count.put(str.charAt(i), 1);
            }else {
            	res = str.charAt(i);
            	break;
            }
        }
		return res;
    }

}
