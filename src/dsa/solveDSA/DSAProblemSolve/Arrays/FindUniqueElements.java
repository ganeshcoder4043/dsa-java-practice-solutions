package dsa.solveDSA.DSAProblemSolve.Arrays;

public class FindUniqueElements {

	public static void main(String[] args) {

		// => Find Unique Elements in the Array
		// Input: [1, 5, 9, 5, 1, 7, 3]
		// Output: 9 7 3
		// USING LOOP & WE HAVE Alternate Approach USING HASHMAP

		int[] arr = { 1, 5, 9, 5, 1, 7, 3 };

		System.out.println("Unique Element printed");

		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;

			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
