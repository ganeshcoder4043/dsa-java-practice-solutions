package dsa.solveDSA.DSAProblemSolve.Strings;

public class CountWords {

	public static void main(String[] args) {
//		Count Number of Words in a String
//		Given a string, count total number of words inside it.
//		Input:  "I am learning DSA in Java"
//		Output: 6
		
		
		//=> Approach 1 – Using Split Method (Simplest & Cleanest)
		String str = "I am learning DSA in Java";
		String[] words = str.trim().split("\\s+");
		System.out.println(words.length);
		
		
		//=>Approach 2 – Without Using Split (Interview Friendly)
		
		String str2 = "I am learning DSA in Java";
		
		int count = 0;
		boolean inWord = false;
		
		for(int i=0;i<str2.length();i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				if(!inWord) {
					count++;   // new word found
					inWord=true;
				}
			}else {
				inWord=false;   // word ended
			}
		}
		
		System.out.println("Total Words In String:-> "+count);
		
	}

}
