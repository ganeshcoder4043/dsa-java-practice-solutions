package dsa.coreJavaConcepts.arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		int[] arr = { 23, 54, 5, 2,169, 87, 99, 06, 69 };

		// // Assume first element is min and max that means min=> 23 & max=>23
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i]; // min value store in min
			}

			if (arr[i] > max) {
				max = arr[i];  	// man value store in man 

			}

		}

		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
	}

}
