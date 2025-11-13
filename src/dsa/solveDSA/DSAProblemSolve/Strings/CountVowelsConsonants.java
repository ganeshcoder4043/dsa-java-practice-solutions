package dsa.solveDSA.DSAProblemSolve.Strings;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		/*
		 * => Given a string, count how many vowels and consonants it contains. Ignore
		 * spaces, numbers, and special characters.
		 */
//		      a, e, i, o, or u

		/*
		 * Input: "hello world" Output: Vowels = 3 Consonants = 7
		 */

		String str = "hello world";
		str = str.toLowerCase();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("No. of vowels-> " + vowels);
		System.out.println("No. of consonants-> " + consonants);

	}

}
