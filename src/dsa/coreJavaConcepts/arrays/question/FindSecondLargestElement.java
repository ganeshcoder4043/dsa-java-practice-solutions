package dsa.coreJavaConcepts.arrays.question;

import java.util.Arrays;

public class FindSecondLargestElement {

	/* How do you find the second largest element in an array? */
	
	public static void main(String[] args) {
		int[] arr = { 73, 15, 48, 86, 6, 91 };
		
		/* Using Array.sort */
		Arrays.sort(arr);
		
		int secondLargeNum = arr[arr.length-2];
		System.out.println("Second Largest Number Using Of Sort -> "+secondLargeNum);
		
		
		/* Using Compare => Best Apporach */
		int largest = Integer.MIN_VALUE;  // ek constant hai jo Java mein sabse chhoti integer value represent karta hai. Or eski Value: -2,147,483,648 (lagbhag -2 billion) 
		int secondLargest = Integer.MIN_VALUE; // yeh sabse chhota number hai
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] >secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest Number -> " + secondLargest);
		
		
		
		
//		=> maine jis approach se kiya hun yeh glt hai best approach upar wla h 
		
//		int secondLarge = arr[0]; 
//		
//		for(int i=0; i<arr.length-1;i++) {
//			if(arr[i] >secondLarge) {
//				secondLarge=arr[i];
//			}
//			
//		}
//		System.out.println(secondLarge);
		
		
	}
}
