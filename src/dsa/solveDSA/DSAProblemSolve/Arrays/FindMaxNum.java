package dsa.solveDSA.DSAProblemSolve.Arrays;

public class FindMaxNum {

	public static void main(String[] args) {
		// Find Max Num Value From Given Arrays ->
		
		int[] arr = {1,9,5,8,20,54,69,59,49,67};
		
		int max = arr[0];  // assume first element is max
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i] > max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("Max Num Value Printed From Given Arrays-> "+max);
		
	}

}
