package dsa.basic.questions;

import java.util.Scanner;

public class FactrorialNumFind {

	public static void main(String[] args) {
        //Factorial ko ! symbol se likhte hain.
		// Jaise: 5! ka matlab hota hai:
		//5 × 4 × 3 × 2 × 1 = 120

		// Find Factorial Number Find
		System.out.println("Find Factorial Number Find ");
		System.out.println("Enter a Number for Factorial");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
		sc.close();
	}

}
