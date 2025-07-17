package dsa.basic.questions;

import java.util.Scanner;

public class EvenNaturalNum {
	public static void main(String[] args) {
		// All Even Natural Number Print
		System.out.println("All Even Natural Number Print");
		System.out.println("Enter number for print even number:- ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=a;i=i+2) {
			System.out.println(i);
		}
		sc.close();
	}
}
