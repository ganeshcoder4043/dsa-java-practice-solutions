package dsa.basic.questions;

import java.util.Scanner;

public class SumAllNaturalNum {

	public static void main(String[] args) {
		// sum of all natural number
		System.out.println("sum of all natural number ");
		System.out.println("Enter a Natural Number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++) {

			b = b + i;

		}
		System.out.println(b);
		sc.close();
	}
}
