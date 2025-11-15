package dsa.solveDSA.DSAProblemSolve.Strings;

public class CharFrequency {

	public static void main(String[] args) {
		// Count Occurrence of Each Character
		//=>Given a string, count the frequency of each character (including duplicates), 
		//=>but print every character only once.
		
		 /*   Input:  "banana"
			  Output:
			          b → 1  
			          a → 3  
			          n → 2  */
		
		
		String str = "ganesh";
		
		int[] freq = new int[256];  // ASCII size
		
		// Count frequency
		for(int i=0; i<str.length();i++) {
			freq[str.charAt(i)]++;
		}
		
		 // Print result
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(freq[ch]>0) {
				System.out.println(ch+" -> "+freq[ch]);
				freq[ch]=0; // mark printed so duplicates don't print again
			}
		}

	}

}
