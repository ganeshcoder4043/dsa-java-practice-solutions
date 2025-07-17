package dsa.basic.questions;

import java.util.Scanner;

public class AllAddNatNum {
	public static void main(String[] args) {
		//  all Add Odd Natural Number 
		
				System.out.println(" all Add Odd Natural Number");
				System.out.println("Enter Number");
				Scanner sc = new Scanner(System.in);
				int a=sc.nextInt();
				int b=0;
				for(int i=1;i<=a;i=i+2) {   // In i=i+2 that is main
					b=b+i;
				}
				System.out.println(b);
				sc.close();
	}
}
