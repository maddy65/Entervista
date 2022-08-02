package Walmart;

public class LastwordLength {

	public static void main(String[] args) {
		String str = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(str));
	}
	
	public static int lengthOfLastWord(String s) {
        int result = 0;
        for(int i = s.length()-1; i>=0; i--) {
        	if(s.charAt(i) != ' ') {
        		result++;
        	}else {
        		if(result > 0) {
        			return result;
        		}
        	}
        }
		return result;
    }
}
