package dsa.basic.questions;

import java.util.Scanner;

public class SingleCharPrint {

	public static void main(String[] args) {
		// print single value of character 
		
		System.out.println("print single value of character");
		System.out.println("Enter Character Value");
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		System.out.println(c);
		sc.close();
	}
}
