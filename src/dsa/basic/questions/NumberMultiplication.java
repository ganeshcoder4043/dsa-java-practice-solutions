package dsa.basic.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberMultiplication {
	public static void main(String[] args) {
		// tables of Number
		//-> Emse me BufferedReader ka use kiya hai or ese tu scanner class ka use kr skta hai koi bina loi problem ke , bs maine check krne ke liye  use kiya tha  
		System.out.println("Enter a Number For table number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		try {
			int num = Integer.parseInt(br.readLine());
			for (int i = 1; i <= 10; i++) {
				System.out.println(num * i);
				count++;
			}
			System.out.println("how many number of table you print-> "+count);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
