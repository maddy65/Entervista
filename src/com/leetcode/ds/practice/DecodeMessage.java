package com.leetcode.ds.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DecodeMessage {

	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		decodeMessage(key, message);
	}
	
	public static String decodeMessage(String key, String message) {
        String decodeValue = "";
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result = "";
        for(int i=0; i<key.length(); i++) {
        		if(!result.contains(String.valueOf(key.charAt(i)))) {
        			result += String.valueOf(key.charAt(i));
        		}
        }
        result = result.replaceAll("\\s", "");
        for(int i=0; i<message.length();i++) {
        	
        	char messageValue = message.charAt(i);
        	if( messageValue == ' ') {
        		decodeValue += ' ';
        	}
        	for(int j=0; j<result.length(); j++) {
        		char keyValue = result.charAt(j);
        		if(messageValue == keyValue) {
        			decodeValue += alphabet[j];
        		}
        	}
        }
        return decodeValue;
    }

}
