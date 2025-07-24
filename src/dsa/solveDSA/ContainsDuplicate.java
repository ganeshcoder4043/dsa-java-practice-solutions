package dsa.solveDSA;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

//	217. Contains Duplicate
//	Given an integer array nums, return true if any value appears at least twice in the array, 
//	and return false if every element is distinct.

	public boolean hasDuplicate(int[] nums) {

		Set<Integer> seen = new HashSet<>();

		for (int num : nums) {
			if (seen.contains(num)) {
				return true;
			}
			seen.add(num);
		}
		return false;

	}

	public static void main(String[] args) {
		try {
			int[] nums = { 1, 2, 3, 4 };
			ContainsDuplicate obj = new ContainsDuplicate();
			boolean result = obj.hasDuplicate(nums);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
