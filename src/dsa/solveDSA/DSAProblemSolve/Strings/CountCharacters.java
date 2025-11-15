package dsa.solveDSA.DSAProblemSolve.Strings;

public class CountCharacters {

	public static void main(String[] args) {
		//=> Count Number of Characters (Without Spaces)
		/*  Input:  "I am learning DSA in Java"
			Output:  21 characters */
		
		String str = "I am learning DSA in Java with LeetCode";
		
		int count = 0;

		for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' ') {
                count++;
            }
        }
		System.out.println("Number of Characters Without Spaces ->  "+count);
	}

}
