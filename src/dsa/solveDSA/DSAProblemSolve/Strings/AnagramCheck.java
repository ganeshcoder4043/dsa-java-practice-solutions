package dsa.solveDSA.DSAProblemSolve.Strings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// => Check if Two Strings Are Anagrams
//		Do strings A and B contain exact same characters with same frequency, but maybe in different order?

		/*
		 * Input: "silent", "listen" Output: true (because both have same characters)
		 * 
		 * Input: "hello", "world" Output: false
		 */

		String str1 = "madamiii";
		String str2 = "madam";

		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
			return;
		}

		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();

		java.util.Arrays.sort(a);
		java.util.Arrays.sort(b);

		if (java.util.Arrays.equals(a, b)) {
			System.out.println("yes Anagrams");

		} else {
			System.out.println("Not Anagrams");
		}

	}

}
