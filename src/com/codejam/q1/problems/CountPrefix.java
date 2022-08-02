package com.codejam.q1.problems;

public class CountPrefix {

	public static void main(String[] args) {
		String [] str = new String[] {"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
		String str1 = "w";
		System.out.println(countPrefixes(str, str1));
	}
	
	public static int countPrefixes(String[] words, String s) {
		int count = 0;
		for(int i=0; i<words.length; i++) {
			String newWord = words[i];
			boolean flg = false;
			for(int j=0; j<newWord.length();j++) {
				if(newWord.length() > s.length()) {
					break;
				}
				if(j >= s.length()) {
					break;
				}else {
					
					if(newWord.charAt(j) == s.charAt(j)) {
						flg = true;
					}else {
						flg = false;
						break;
					}
				}
				
				
			}
			if(flg) {
				count = count+1;
			}
		}
		return count;
        
    }

}
