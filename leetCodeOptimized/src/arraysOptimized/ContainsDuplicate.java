package arraysOptimized;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 1, 4 };
		boolean containsDuplicate = containsDuplicate(arr);
		System.out.println(containsDuplicate);
	}

	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}
}
