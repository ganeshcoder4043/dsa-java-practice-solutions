package dsa.solveDSA.DSAProblemSolve.Strings;

public class AnagramCheck {

	public static void main(String[] args) {
		// => Check if Two Strings Are Anagrams
//		Do strings A and B contain exact same characters with same frequency, 
//		but maybe in different order?

		/*
		 * Input: "silent", "listen" Output: true (because both have same characters)
		 * 
		 * Input: "hello", "world" Output: false
		 */

		String str1 = "silent";
		String str2 = "listen";

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
		
		
		
		
		// Best for Interviews //
		
		
		String s1 = "silent";
        String s2 = "listen";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[256]; // for all ASCII chars

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;   // increase count
            freq[s2.charAt(i)]--;   // decrease count
        }

        for (int count : freq) {
            if (count != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        
        System.out.println("Anagram");

	}

}
