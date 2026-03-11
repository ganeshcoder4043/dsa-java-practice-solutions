package dsa.coreJavaConcepts.arrays.question;

public class ReverseArrays {

	       /* How do you reverse an array in Java? */
	
	public static void main(String [] args) {
		// Yeh sirf display ke liye reverse hai
		int [] arr = {40, 10, 30, 50, 20};
		System.out.println("Orignial Arrays ");
		for(int original:arr) {
			System.out.print(original +" ");
		}
		
		System.out.print("\n\n"); 
		
		System.out.println("Reverse Arrays ");
		for(int i=arr.length-1;i>=0;i--) {
			// using of loop -> not change in memory 
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.print("\n\n"); 
        
        System.out.println("Original Array:");
        for(int original:arr) {
            System.out.print(original +" ");
        }
        
        System.out.print("\n\n");
        
        // Actually reverse karna - Two Pointer Approach
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end) {
            // Swap karo
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
        System.out.println("Actual Reversed Array:");
        for(int reversed:arr) {
            System.out.print(reversed +" ");
        }
        System.out.print("\n");
	}
}
