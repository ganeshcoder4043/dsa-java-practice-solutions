package dsa.basic.questions;

import java.util.Scanner;

public class PowerNumPrint {
	public static void main(String[] args) {
		// print number of power 
		System.out.println("print number of power ");
		System.out.println("Enter a number:- ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(); //for number
		System.out.println("Enter Power Number:- ");
		int p=sc.nextInt(); //for power of number
		int result = 1; // for result
		
		for(int i=1;i<=p;i++) {
			result=result*n;
		}
		System.out.println(result);
		sc.close();
	}
}
