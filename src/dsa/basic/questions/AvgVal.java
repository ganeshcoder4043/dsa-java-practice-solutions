package dsa.basic.questions;

import java.util.Scanner;

public class AvgVal {
	public static void main(String[] args) {
		// Average value find of a number
		System.out.println("Find Average Value of 5 Number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:- ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:- ");
		int b=sc.nextInt();
		System.out.println("Enter Third Number:- ");
		int c=sc.nextInt();
		System.out.println("Enter Fourth Number:- ");
		int d=sc.nextInt();
		System.out.println("Enter Fifth Number:- ");
		int e=sc.nextInt();
		
		int sumAllNum =a+b+c+d+e;
		double avg=sumAllNum/5.0;
		System.out.println(avg);
		
		sc.close();
		
	}
}
