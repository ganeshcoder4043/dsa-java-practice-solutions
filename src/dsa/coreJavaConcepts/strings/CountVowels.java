package dsa.coreJavaConcepts.strings;

public class CountVowels {
	public static void main(String[] args) {
		String s1 = "ganesh";
		int count = 0;
		for(char c : s1.toLowerCase().toCharArray()) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
		}
		System.out.println(count);
	}

}
