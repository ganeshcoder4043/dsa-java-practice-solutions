package dsa.solveDSA.DSAProblemSolve.Arrays;

public class FindMinNum {

	public static void main(String[] args) {
		// Find Min Num Value From Given Arrays ->
		
		int[] arr = {1,9,5,8,20,54,0,69,59,49,67};
		
		int min = arr[0]; // assume first element is smallest
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {  // in current value 
				min=arr[i];
			}
		}
		System.out.println("Min Num Value Printed From Given Arrays-> "+min);

	}

}
