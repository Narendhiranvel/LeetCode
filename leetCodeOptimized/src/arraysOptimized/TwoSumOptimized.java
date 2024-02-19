package arraysOptimized;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// [2,7,11,15] target = 9

public class TwoSumOptimized {

	public static void main(String[] args) {
		TwoSumOptimized twoSumOptimized = new TwoSumOptimized();
		int[] nums = { 2, 11, 7, 15 };
		int target = 9;
		int[] result = twoSumOptimized.twoSum(nums, target);

		System.out.println(Arrays.toString(result));

	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}
}
