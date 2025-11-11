package dsa.solveDSA.DSAProblemSolve.Arrays;

public class FindSumAllElem {

	public static void main(String[] args) {
		int[] arr = {1,9,5,8,20,54,0,69,59,49,67};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(sum);

	}

}
