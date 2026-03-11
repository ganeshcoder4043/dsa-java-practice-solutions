package dsa.coreJavaConcepts.strings;

public class PalindromeCheck {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s2.equals(s1)) {
			System.out.println("yes its palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
