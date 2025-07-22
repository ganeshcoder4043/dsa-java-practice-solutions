package dsa.coreJavaConcepts.arrays;

public class LinearAndBinarySearch {

	public static void main(String[] args) {
		
		
		// linear search -> Linear search ek simple technique hai jisme hum array ke har element ko ek ek karke check karte hain jab tak element mil na jaye.
		int[] arr = { 23, 54, 5, 2,169, 87, 99, 06, 69 };
		int target =69;
		boolean found =false; // assume that ki abhi found not found
		
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.println("target index found :- "+i);
				found=true; // jab found mil jayega toh true ho jayega or fir loop se bhar aajayega
				break;
			}
		}
		
		if(!found) {
			System.out.println("target not found");
		}

	}

}
