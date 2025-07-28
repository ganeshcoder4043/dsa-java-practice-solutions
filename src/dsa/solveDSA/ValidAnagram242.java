package dsa.solveDSA;

import java.util.Arrays;

public class ValidAnagram242 {
	
//	Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//			 
//
//			Example 1:
//
//			Input: s = "anagram", t = "nagaram"
//
//			Output: true
//
//			Example 2:
//
//			Input: s = "rat", t = "car"
//
//			Output: false
	
	
	

	public boolean isAnagram(String s, String t) {       // Anagram => Same letters, different order. ex-> listen<->silent 
		if(s.length()!=t.length()) { // for length check
			return false;
		}
		
		char[] Sarr = s.toCharArray();  // Convert to char array and sort both strings
		char[] Tarr = t.toCharArray();
		
		Arrays.sort(Sarr);
		Arrays.sort(Tarr);
		
		return Arrays.equals(Sarr, Tarr);  // compare sorted array
	}
	public static void main(String[] args) {
		
		String s = "car";
		String t="arc";
		 ValidAnagram242 anagram = new ValidAnagram242();
		 boolean result = anagram.isAnagram(s, t);
		 System.out.println("isAnagram ? -> "+result);

	}

}
