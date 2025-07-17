package dsa.basic.questions;

import java.util.Scanner;

public class AsciiValueFind {
	public static void main(String[] args) {
		// asciiValue find 
		
		System.out.println("print single value of character");
		System.out.println("Enter Character Value");
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		int ascii=c;
		System.out.println(ascii);
		sc.close();
	}
}
