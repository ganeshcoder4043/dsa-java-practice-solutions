package dsa.basic.questions;

public class AToZPrint {
	public static void main(String[] args) {
		// a to z print alphabet
		System.out.println("a to z print alphabet");
		int count =0;
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			count++;
		}
		System.out.println("Total alphabets: " + count);
		
		
	}
}
