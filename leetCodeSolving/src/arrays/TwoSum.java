package arrays;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub [2,7,11,15], target = 9
		
		TwoSum twoSum = new TwoSum();
        int[] nums = {4, 4, 3, 4};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

	}
	
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}
}
