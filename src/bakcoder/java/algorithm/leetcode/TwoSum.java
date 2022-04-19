package bakcoder.java.algorithm.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
	}
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numberMap = new HashMap<>();
		
		for(int i=0 ; i<nums.length ; i++) {
			if(numberMap.containsKey(nums[i])) {
				return new int[]{numberMap.get(nums[i]), i};
			}
			numberMap.put(target-nums[i], i);
		}
		
		return null;
	}

}


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
		
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

//Constraints
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Only one valid answer exists.