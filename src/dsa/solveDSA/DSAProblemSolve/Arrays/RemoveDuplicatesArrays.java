package dsa.solveDSA.DSAProblemSolve.Arrays;

import java.util.HashSet;

public class RemoveDuplicatesArrays {

	public static void main(String[] args) {
		// => Remove Duplicates Arrays
		// => USING OF LOOP , AND using of hashset

		int[] arr = { 1, 5, 1, 9, 5, 1 };

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				continue;
			}

			System.out.print(arr[i] + " ");

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
				}
			}
		}

		// => Remove Duplicates Arrays
		// => USING OF HashSet

//		int[] arr = { 1, 5, 1, 9, 5, 1 };
//		HashSet<Integer> set = new HashSet<>();
//		for (int num : arr) {
//			set.add(num);
//
//		}
//		System.out.println(set);

	}

}
