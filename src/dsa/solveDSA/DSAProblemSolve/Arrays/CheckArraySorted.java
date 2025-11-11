package dsa.solveDSA.DSAProblemSolve.Arrays;

public class CheckArraySorted {

	public static void main(String[] args) {
		//=> Check Array are sorted ? 
		
//		int[] arr = {1,9,5,8,20,67,67,54,0,69,59,49,67};
		
		int[] arr = {1,3,5,7,8,9};
		
			boolean isSorted = true;
			
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1]) {
					isSorted=false;
					break;
				}
			}
			
			if(isSorted) {
				System.out.println("Given Arrays Are Already Sorted -> Yes" );
			}else{
				System.out.println("Given Arrays Are Not Already Sorted -> NO");
			}
	
	}
	
	
}
