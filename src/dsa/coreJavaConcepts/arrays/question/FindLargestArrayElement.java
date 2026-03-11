package dsa.coreJavaConcepts.arrays.question;

import java.util.Arrays;

public class FindLargestArrayElement {

	/* How do you find the largest element in an array? */

	public static void main(String[] args) {
//		Arrays.sort() use kr ke liya hun 
		int[] arr = { 40, 10, 30, 50, 20 };

		Arrays.sort(arr); // Sort ho jayega: [10, 20, 30, 40, 50]

		int largest = arr[arr.length - 1]; // Last element = largest
		System.out.println("Using Of Sort To Find Largest Element: " + largest);

		
		
		/* Using of compare each number for large num*/
		int Largest = arr[0]; //maine assume kiya phela num large h
		
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i] > Largest) {
				Largest = arr[i];
				
			}
			
		}
		System.out.println("Using Of Compare Each Num To Find Largest Element: " + largest);
	}
}
