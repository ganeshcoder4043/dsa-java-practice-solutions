package dsa.solveDSA.DSAProblemSolve.Arrays;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class FindUniqueElementsUsingHashMap {

	public static void main(String[] args) {

		// => Find Unique Elements in the Array
		// Input: [1, 5, 9, 5, 1, 7, 3]
		// Output: 9 7 3
		// USING HASHMAP & & WE HAVE Alternate Approach USING LOOP

		int[] arr = { 1, 5, 9, 5, 1, 7, 3 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println("Unique Element Printed");

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

}
