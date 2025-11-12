package dsa.solveDSA.DSAProblemSolve.Arrays;

import java.util.Arrays;

public class findSecLarElem {

	public static void main(String[] args) {
		// Find Second Largest Num Value From Given Arrays ->
		
				// Easy apporach 
//		 int[] arr = {1,9,5,8,20,67,67,54,0,69,59,49,67};
//		 Arrays.sort(arr);
//		 int secondLargestNum = arr[arr.length-2];
//		 System.out.println(secondLargestNum);
		 
		
		
//        -----****--------*******----------*********---------

		
		
	    // Find Second Largest Num Value From Given Arrays ->
		 // interview level apporach (Efficient Approach )
		 
//		int[] arr = {1,9,5,69,8,20,67,67,54,0,69,59,49,67,69,};
//		
//		int max=Integer.MIN_VALUE;
//		int secondMax=Integer.MIN_VALUE;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				secondMax=max;  // pervious max becaomes seconds
//				max=arr[i];
//			}
//			else if(arr[i]> secondMax && arr[i]!=max) // skip duplicate num of largest num
//			{
//				secondMax=arr[i];
//			}
//		}
//		System.out.println("Largest Number from Given Arrays-> "+max);
//		System.out.println("Second Largest Number from Given Arrays-> "+secondMax);
//		
		
		
//	             -----****--------*******----------*********---------
		
		
		// Find Third Largest Num Value From Given Arrays ->
		
		int[] arr = {1,9,5,8,20,67,67,54,0,69,59,49,67};
		
		int max= Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) 
			{
				thirdMax=secondMax;
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max) // Skip duplicate largest number
			{
				thirdMax=secondMax;
				secondMax=arr[i];
				
			}
			else if(arr[i]>thirdMax && arr[i]!=secondMax && arr[i]!=max) // Skip duplicate second largest number 
			{
				thirdMax=arr[i];
			}
		}
		System.out.println("Largest:-> " + max);
		System.out.println("Second Largest:-> " + secondMax);
		System.out.println("Third Largest (unique):-> " + thirdMax);
		
	}

}
