package arrays;

import java.util.Arrays;

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        // Print the output array
        System.out.println("Output: " + Arrays.toString(result));
	}
	public static int[] productExceptSelf(int[] nums) {
		int[] productArr = new int[nums.length] ;
		for(int i=0; i<nums.length; i++) {
			int product =1;
			for(int j=0; j<nums.length; j++) {
				if(nums[i] != nums[j]) {
					product *= nums[j];
				}
			}
			productArr[i] = product;
		}
		return productArr;
	}
}
