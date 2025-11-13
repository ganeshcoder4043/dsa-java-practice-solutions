package dsa.solveDSA.DSAProblemSolve.Strings;

public class CheckPalindrome {

	public static void main(String[] args) {
		//=>A string is called palindrome if it reads the same forward and backward.
//		    Input:  "level"
//			Output: Palindrome
//
//			Input:  "hello"
//			Output: Not Palindrome
		
		
		String str ="level";
		String rev="";
		
		// Reverse string 
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		// Compare both
		if(str.equals(rev)) {
			System.out.println(str + " is a Palindrome ");
		}else {
			System.out.println(str + " is NOT a Palindrome ");
		}
		
		
		
		
		//=> Approach 2 — Two Pointer (Interview Favorite)
		
		
		String str2 ="hello";
		
		int left=0;
		int right=str.length()-1;
		
		boolean isPalindrome = true;
		
		while(left<right) {
			if(str2.charAt(left) != str2.charAt(right)) {
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		}
		
		if (isPalindrome) {
			System.out.println(str2 + " is a Palindrome");
		}else {
			System.out.println(str2 + " is NOT a Palindrome");
		}
		
		
	}

}
