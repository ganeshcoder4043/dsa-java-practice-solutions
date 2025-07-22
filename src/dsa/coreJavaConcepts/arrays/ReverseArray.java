package dsa.coreJavaConcepts.arrays;


public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {50, 20, 40, 10, 30};
		 
		 System.out.println("Original Array Printed");
		 for(int value:arr) {
			System.out.println(value); 
		 }
		 
		 System.out.println("\nonly print revrse order array not change in memory");
			for (int a = arr.length-1; a >=0; a--) {            // if u use this u can only print revrse or
				System.out.println(arr[a]);						// if u actual revrse array than use two pointer (swap technique)
			}
		 
		 System.out.println("\nReverse Array Printed from  in memoery using two pointer(swap technique)");
		 int start=0, end=arr.length-1;
		 while(start<end) {
			 int temp=arr[start]; // temp= actual value store
			 arr[start]=arr[end];  // swap value
			 arr[end]=temp;
			 start++;
			 end--;
		 }
		 
//		 Arrays.sort(arr);
		 
		 for(int value:arr) {
			 System.out.println(value);
			 
		 }
		 
		 
	}

}
