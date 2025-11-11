package dsa.coreJavaConcepts.arrays;

import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {

		String str1 = "listen";
        String str2 = "silent";

        // Convert to char array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare
        if(Arrays.equals(arr1, arr2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams");
        }
	}

}
