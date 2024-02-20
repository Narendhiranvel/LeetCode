package arraysOptimized;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int maxArray = maxSubArray(nums);
		System.out.println(maxArray);
		
	}
	
	public static int maxSubArray(int[] nums) {
		int mSum = Integer.MIN_VALUE;
		int cSum = 0;
		
		for(int i=0; i<nums.length; i++) {
			cSum += nums[i];
			
			if(cSum> mSum) {
				mSum = cSum;
			}
			if(cSum < 0) {
				cSum = 0;
			}
		}
		return mSum;
	}

}
