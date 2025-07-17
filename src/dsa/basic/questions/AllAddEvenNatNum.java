package dsa.basic.questions;

import java.util.Scanner;

public class AllAddEvenNatNum {

	public static void main(String[] args) {
		// All Add Even Natural Number 
				System.out.println("All Add Even Natural Number ");
				System.out.println("Enter number for all add even number:- ");
				Scanner sc = new Scanner(System.in);
				int a=sc.nextInt();
				int b=0;
				
				for(int i=0;i<=a;i=i+2) {
					b=b+i;
				}
				System.out.println(b);
				sc.close();
	}

}
