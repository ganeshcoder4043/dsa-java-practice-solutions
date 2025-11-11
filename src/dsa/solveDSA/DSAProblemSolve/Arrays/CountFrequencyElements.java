package dsa.solveDSA.DSAProblemSolve.Arrays;

import java.util.HashMap;

public class CountFrequencyElements {

	public static void main(String[] args) {
		// Count Frequency of Each Element in an Array
		// that means -> arrays me kitne repeated element hai like 1=3times, 5=2times ,
		// 9=1times
		
		// 	USING OF LOOP BUT WE HAVE ANOTHER OPTION TO SOLVE THIS USING HASHMAP INTERVIEW PROFESSIONAL

		int[] arr = { 1, 5, 1, 9, 5, 1 };

//		int[] arr = {1,9,5,8,20,67,67,54,0,69,59,49,67};

		boolean[] visited = new boolean[arr.length];
		
		for(int i=0; i<arr.length;i++)
		{
			if(visited[i] == true) {
				continue;    // element already counted
			}
			
			int count =1;
			
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i] == arr[j]) {
					count++;
					visited[j]=true;   // mark duplicate as visited
				}
			}
			
			 System.out.println(arr[i] + " → " + count + " times");
		}
		
		
		// USING HASHMAP
		
//		int[] arr = { 1, 5, 1, 9, 5, 1 };
//
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int num : arr) {
//			if (map.containsKey(num)) {
//				map.put(num, map.get(num) + 1);
//			} else {
//				map.put(num, 1);
//			}
//		}
//
//		for (Integer key : map.keySet()) {
//			System.out.println(key + " -> " + map.get(key) + " times");
//		}
		
	}

}
