package dsa.coreJavaConcepts.arrays;

public class Arrays {

	public static void main(String[] args) {
		
//							NOTES
		
		
		

		int[] arr = { 10, 20, 30, 40, 50 };

		// for loop
		System.out.println("for loop");
		for (int i = 0; i < arr.length; i++) {   // best use case for retrive and update data from index
			System.out.println(arr[i]);
		}

		System.out.println("for-each loop");
		for (int value : arr) {                // best use case for retrive data but cannot be modify specific elemet using index
			System.out.println(value);
		}

		System.out.println("while loop");
		int i = 0;                                  // less use case 
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}

		System.out.println("do-while loop");
		int j = 0;
		do {                                     // less use in arrays
			System.out.println(arr[j]);
			j++;
		} while (j < arr.length);
		
		
		System.out.println("only print revrse order array ");
		for (int a = arr.length-1; a >=0; a--) {            // if u use this u can only print revrse or
			System.out.println(arr[a]);						// if u actual revrse array than use two pointer (swap technique)
		}														//thats means array revrese in memory location
		
		
		System.out.println(arr.length-1); // array lenght find 
		
	
	}

}


