package dsa.solveDSA.LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {
	
//									49. Group Anagrams
	
//	Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//			 
//
//			Example 1:
//
//			Input: strs = ["eat","tea","tan","ate","nat","bat"]
//
//			Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//
//			Explanation:
//
//			There is no string in strs that can be rearranged to form "bat".
//			The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
//			The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
	
	
	
	
	public List<List<String>> groupAnagrams(String[] strs){
		
		Map<String, List<String>> map= new HashMap<>();
		
		for(String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
				
			}
			map.get(key).add(str);
		}
		
		return new ArrayList<>(map.values());
		
	}

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		GroupAnagrams49 obj = new GroupAnagrams49();
		List<List<String>> groupAnagrams = obj.groupAnagrams(strs);
		System.out.println(groupAnagrams);
		
	
	}

}
