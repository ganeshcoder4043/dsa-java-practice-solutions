package dsa.basic.questions;

import java.util.Scanner;

public class AllOddNatural {
	public static void main(String[] args) {
		// Print all Odd Natural Number 
		
		System.out.println("Print all Odd Natural Number");
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i=i+2) {   // In i=i+2 that is main
			System.out.println(i);
		}
		sc.close();
	}
}
