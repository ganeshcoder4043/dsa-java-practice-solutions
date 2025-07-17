package dsa.basic.questions;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		
		// Check Odd Even Of Number 
		
		System.out.println("Check Odd Even ?");
		System.out.println("Enter Your Number:- ");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Your Number "+a+" is Even");
		}
		else {
			System.out.println("Your Number"+a+"is Odd");
		}
		sc.close();
	}
}
