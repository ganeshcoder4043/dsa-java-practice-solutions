package dsa.basic.questions;

import java.util.Scanner;

public class PrintNaturalNum {

	public static void main(String[] args) {
		//print all natural number of given number from user
		
		System.out.println("Print Natutal");
		System.out.println("Enter a Number for print natural number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
