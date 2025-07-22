package dsa.coreJavaConcepts.arrays;
import java.util.Arrays;
public class ArrayMethods {

	public static void main(String[] args) {
		int[] original = {10, 20, 30, 40, 50};

        // Copy with same size
        int[] copySame = Arrays.copyOf(original, original.length);  // original arrays copy ho gya hai

        // Copy with larger size (adds 0s at the end)
        int[] copyLarger = Arrays.copyOf(original, 7);  //[10, 20, 30, 40, 50, 0, 0]

        // Copy with smaller size (truncates values)
        int[] copySmaller = Arrays.copyOf(original, 3);

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy Same: " + Arrays.toString(copySame));
        System.out.println("Copy Larger: " + Arrays.toString(copyLarger));
        System.out.println("Copy Smaller: " + Arrays.toString(copySmaller));
	}

}
