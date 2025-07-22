package dsa.coreJavaConcepts.arrays;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 }; // Must be sorted
		int target = 30;
		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				System.out.println("Element found at index: " + mid);
				return;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println("Element not found.");
	}
}
