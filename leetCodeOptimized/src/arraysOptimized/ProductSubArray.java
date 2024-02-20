package arraysOptimized;

public class ProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,-1,4};
		int result = maxProduct(arr);
        System.out.println(result);

	}

	public static int maxProduct(int[] nums) {
		int maxSum = Integer.MIN_VALUE; 
		int currentSum = 1; 

		for (int i = 0; i < nums.length; i++) {

			// currentSum = nums[i];
			currentSum *= nums[i];

			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum == 0) {
				currentSum = 1;
			}
		}
		currentSum = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			currentSum *= nums[i];

			if (currentSum > maxSum) {
				maxSum = currentSum;
			}

			if (currentSum == 0) {
				currentSum = 1;
			}
		}
		return maxSum;
	}
}
