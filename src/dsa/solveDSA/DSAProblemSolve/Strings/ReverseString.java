package dsa.solveDSA.DSAProblemSolve.Strings;

public class ReverseString {

	public static void main(String[] args) {
		// => Given a string, reverse it manually without using .reverse() method.
		// => Input: "ganesh"
		// => Output: "hsenag"

		String str = "ganesh";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
		 // rev += str.charAt(i);
			rev = rev + str.charAt(i);

		}
		System.out.println("Reversed:-> " + rev);
		System.out.println();
		
		
		
		
		//=> using .reverse() method
		String str2 = "ganesh";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("using .reverse() method :-> "+sb.reverse());
		System.out.println();
		
		
		//=> Approach 2 — Two Pointer (Interview Favorite)
		String str3 = "ganesh";
		char[] chars =str.toCharArray();
		
		int left =0;
		int right = chars.length-1;
		
		while(left<right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right]= temp;
			
			   left++;
			   right--;
		}
		
		System.out.println("Approach 2 — Two Pointer :->"+new String(chars));
		
		
	}

}
