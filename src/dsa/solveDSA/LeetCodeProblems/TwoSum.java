package dsa.solveDSA.LeetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
//	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//	Example 1
//		Input: nums = [2,7,11,15], target = 9
//		Output: [0,1]
//		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> sum = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement =target -nums[i];
			
			if(sum.containsKey(complement)) {
				return new int[] {sum.get(complement),i};
			}
			sum.put(nums[i],i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums= {2,4,7,9,0};
		int target =16;
		TwoSum obj = new TwoSum();
		int[] result = obj.twoSum(nums, target);
		System.out.println(result[0]+","+result[1]);
		
	}

}
