package arraysOptimized;

import java.util.Arrays;

public class ProductOfArrayOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,1,0,-3,3};
        int[] result = productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        // Print the output array
        System.out.println("Output: " + Arrays.toString(result));
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int[] productArr = new int[nums.length];

        // Calculate the product of all elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            productArr[i] = leftProduct;   // 0(1) 1(1) 2(2) 3(6)
            leftProduct *= nums[i]; // 1 2 6 24
        }

        // Calculate the product of all elements to the right of each index and multiply it with the left product
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            productArr[i] *= rightProduct; //0(6) 1(8) 2(12) 4(24)
            rightProduct *= nums[i]; // 4 12 24
        }

        return productArr;
	}

}
