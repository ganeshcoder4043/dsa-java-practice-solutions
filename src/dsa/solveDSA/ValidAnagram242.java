package dsa.solveDSA;

import java.util.Arrays;

public class ValidAnagram242 {

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
		String t="art";
		 ValidAnagram242 anagram = new ValidAnagram242();
		 boolean result = anagram.isAnagram(s, t);
		 System.out.println(result);

	}

}
