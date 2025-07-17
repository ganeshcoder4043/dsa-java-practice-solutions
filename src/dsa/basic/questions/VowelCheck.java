package dsa.basic.questions;

import java.util.Scanner;

public class VowelCheck {
	public static void main(String[] args) {
		// check vowel and constant
		System.out.println("check vowel and constant");
		System.out.println("Enter single word for check it is vowel and constant");
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u' ) {
			System.out.println("Yes "+ch+" is Vowel");
		}
		else {
			System.out.println("No "+ch+" is not Vowel it is Constant");
		}
		sc.close();
	}
}
